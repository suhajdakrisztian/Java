package otodikhazi.main;


import otodikhazi.person.*;

public class Main {
  public static void main(String[] args) {

    Person p1 = new Person("Krisztian", "Suhajda", "Student", Gender.MALE.ordinal(), 1997);
    Person p2 = new Person("Krisztian", "Suhajda", "Student", Gender.MALE.ordinal(), 1998);
    Person p3 = new Person("Krisztian", "Suhajda", "Student", Gender.MALE.ordinal(), 1997);

    System.out.println(p1.toString());
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));
  }
}