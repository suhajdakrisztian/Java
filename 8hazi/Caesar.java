package Caesar;

public class Caesar{
  private int n;

  public Caesar(int n){
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