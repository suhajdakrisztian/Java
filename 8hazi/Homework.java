import java.util.Random;
import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;

class Caesar {
  private int n;

  Caesar(int n){
      if(!(n > 0 && n < 26)){
          throw new IllegalArgumentException("N is not in the range of 1-25");
      } else {
          this.n = n;
      }
  }

  public int getN(){
      return this.n;
  }

  public String cipher(String text){
      StringBuilder result = new StringBuilder();
      for(int i = 0; i < text.length(); i++){
          if(Character.isLetter(text.charAt(i))){
              char letter = (char)(text.charAt(i) + this.n);
              if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                  if(letter > 'Z'){
                      letter = (char)(letter - 26);
                      result.append(letter);
                  } else{
                      result.append(letter);
                  }
              } else{
                  if(letter > 'z'){
                      letter = (char)(letter - 26);
                      result.append(letter);
                  } else{
                      result.append(letter);
                  }
              }
          } else if(text.charAt(i) == ' '){
              result.append(" ");
          } else{
              throw new IllegalArgumentException("It's not a letter!");
          }
      }
      return result.toString();
  }
}

class Logger {
  public void log(String str) {}
}

class ConsoleLogger extends Logger {

  @Override
  public void log(String str) { System.out.println(str); }
}

class ConsoleCipherLogger extends Logger {
  @Override
  public void log(String str) {
    Caesar cs = new Caesar(5);
    String res = cs.cipher(str);
    System.out.println(res);
  }
}

class FileLogger extends Logger{
  private String filename;

  FileLogger(String file) { this.filename = file; }

  @Override
  public void log(String s) {
    try {
      FileWriter myWriter = new FileWriter(this.filename,true);
      myWriter.write(s);
      myWriter.write("\n");
      myWriter.close();
    } 
    catch(IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

class Stream {

  private int _maxStringLength;
  private int _stringNumber;
  private Logger _log;
  
  public void StartStreaming() {

    int localLength = _stringNumber;
    while(0 != localLength) {
      String randString = generateNewString();
      _log.log(randString);
      localLength--;
    }
  }

  Stream(int strLen, int strNum, Logger logger) {
    if(strLen == 0 || strNum == 0) 
      throw new IllegalArgumentException("Nem megfelelo argumentumok");

    this._maxStringLength = strLen;
    this._stringNumber = strNum;
    this._log = logger;
  }

  public String generateNewString() {

    Random rand = new Random();
    int current_length = rand.nextInt((_maxStringLength - 1) + 1) + 1;

    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();

    for(int i = 0;i<current_length;i++) {
      char c = letters.charAt(rand.nextInt(letters.length()));
      sb.append(c);
    }
    String result = sb.toString();
    return result;
  }

}



public class Homework {
  public static void main(String[] args) {

    Logger newlog = new Logger();
    ConsoleLogger cs = new ConsoleLogger();
    ConsoleCipherLogger ccl = new ConsoleCipherLogger();
    FileLogger fl = new FileLogger("src.txt");
    Stream s = new Stream(15,10,fl);
    s.StartStreaming();
  }
  
}