import java.util.Set;

//solution of the 8th class
//Exercise over Inheritance with an example over Books
enum CoverType{
  SoftCover,
  HardCover;
 }
 //Base class of Book, representing a general book
 class Book{
  //these are available only in Book
  private String author, title;
  //this is here and also in the derived classes as well (PrintedBook, EBook)
  protected int pages;
  //this runs when super() is called or not called in the contructor of derived class
  public Book(){
  author = "John Steinbeck";
  title = "Of Mice and Men";
  pages = 107;
  }
  public Book(String author, String title, int pages){
  if(author.length() < 2 || title.length() < 4){
  throw new IllegalArgumentException();
  }
  this.author = author;
  this.title = title;
  this.pages = pages;
  }
  public String getShortName(){
  return author.substring(0, 2) + ", " + title.substring(0,4) + ", " + pages; 
  }
  //annotation, using it hints the compiler about overriding a method,
  //from the base class with the !SAME SIGNATURE!
  @Override
  public String toString(){
  return author + ": " + title + ", " + pages;
  }
  public String createReference(int from, int to, String articleName){
  return this.getShortName() + "[" +from +"-" + to + "]" + "referenced in article: " + articleName;
  }
 }
 class PrintedBook extends Book{
  protected CoverType cover;
  
  public PrintedBook(){
  //either commented out or not, super() will always trigger in this Contructor
  //super();
  cover = CoverType.HardCover;
  pages += 6;
  }
  public PrintedBook(String author, String title, int pages, CoverType cover){
  super(author, title, pages + 6);
  //this.pages += 6;
  this.cover = cover;
  //putting super() here would not work,
  // as the contructor of the base class can only be called as the first instruction of the derived contructor
  }
  public int getPrice(){
  if(cover == CoverType.HardCover){
  return pages * 3;
  } else{
  return pages * 2;
  }
  }
  @Override
  public String toString(){
  if(cover == CoverType.HardCover){
  return super.toString() + " hardcovered";
  } else{
  return super.toString() + " softcovered";
  }
  }
  @Override
  public String createReference(int from, int to, String articleName){
  return super.toString() + " [" +from +"-" + to + "] " + "referenced in article: " + articleName;
  }
 }
 class EBook extends Book{
  protected int pdfSize;
  //this was needed for calcelling some strange behavior/typo/magic 
  //private EBook(){}
  public EBook(String author, String title, int pages, int fileSize){
  super(author, title, pages);
  pdfSize = fileSize;
  }
  public int getPrice(){
  return pdfSize + pages;
  }
  @Override
  public String toString(){
  return super.toString() + " size: " + pdfSize;
  }
  @Override
  public String createReference(int from, int to, String articleName){
  return super.toString() + " (PDF size: " + pdfSize + ") " + " [" +from +"-" + to + "] " + "referenced in article: " + articleName;
  }
  //can't use @Override here as base class doesn't have SAME SIGNATURE method (date argument)
  public String createReference(int from, int to, String articleName, String date){
  return super.toString() + " (PDF size: " + pdfSize + ") " + " [" +from +"-" + to + "] " + "referenced in article: " + articleName + " accessing PDF date: " + date;
  }
 }
 class first {
  public static void main(String[] args) {
  Book b1 = new Book();
  PrintedBook pb = new PrintedBook("Zlatan Ibrahimovic", "I am Zlatan Ibrahimovic", 352, CoverType.HardCover);
  EBook eb = new EBook("Stephen Hawking", "A Brief History of Time: From the Big Bang to Black Holes", 256, 3000);
  System.out.println(eb);
  System.out.println(pb);
  System.out.println(pb.createReference(9999, 10, "Best football player ever"));
  System.out.println(eb.createReference(99, 120, "Proves that physics is fun"));
  System.out.println(eb.createReference(99, 120, "Proves that physics is fun", "2012:06:15"));
  }
 }