class first {
  public static void main(String[] args) {
    for (int a = 10; a <= 20; ++a)  {
      if (a % 3 == 0)
             a++;
      else if (a % 2 == 0)
             a = a * 2;
      System.out.print(a + " ");
}
  }
}