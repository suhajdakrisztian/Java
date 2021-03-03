class hazi {
  public static void main(String[] args) {
    Solution mySolution = new Solution();
    mySolution.countPerfectsInRange(Integer.parseInt(args[0]));
  }
}

class Solution {

  boolean isPerfect(int num) {
    int sumOfDivisors = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0)
        sumOfDivisors += i;
    }
    return sumOfDivisors == num;
  }

  void countPerfectsInRange(int upperLimit) {
    int count = 0;
    for (int i = 2; i <= upperLimit; i++) {
      if (isPerfect(i))
        count += 1;
    }

    if(count == 0)
      System.out.println("Egyetlen tokeletes szam sincs a megadott intervallumban.");
    else
      System.out.println("A megadott intervallumban " + count + " tokeletes szam van.");
  }
}
