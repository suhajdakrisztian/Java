public class konv {
  public static void main(String[] args) {

//    int lb = Integer.parseInt(args[0]);
//    int ub = Integer.parseInt(args[1]);
//
//    for (int i = lb; i <= ub; i++) {
//      System.out.println(i/2.0);
//    }
  proba p = new proba();
  p.printer("Suhi");
  }
}

class proba {
  int x, y = 3;
  void printer(String str) {
    System.out.println("Hello" + str);
  }
}