package otodikhazi.person;

import otodikhazi.person.Gender;

public class Person {
  private String _firstName;
  private String _lastName;
  private String _occupation;
  private int _gender; // 0 ferfi 1 no
  private int _birthYear;

  public Person(String fN, String lN, String oc, int gen, int by) {
    this._firstName = fN;
    this._lastName = lN;
    this._occupation = oc;
    this._gender = gen;
    this._birthYear = by;
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    String delim = ", ";
    result.append(this._firstName);
    result.append(delim);
    result.append(this._lastName);
    result.append(delim);
    result.append(this._occupation);
    result.append(delim);
    String gnd = this._gender == Gender.MALE.ordinal() ? "male": "female";
    result.append(gnd);
    result.append(delim);
    result.append(this._birthYear);

    return result.toString();
  }

  public boolean equals(Person toCompare) {

    if(toCompare == null) return false;

    if(this._firstName == toCompare._firstName &&
       this._lastName == toCompare._lastName &&
       this._occupation == toCompare._occupation &&
       this._gender == toCompare._gender &&
       this._birthYear == toCompare._birthYear)
        return true;
      return false;
    }
}