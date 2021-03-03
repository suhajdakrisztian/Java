package vehicle;

class Vehicle {
  private int _modellid;
  private String _licensePlate;
  private int _color1;
  private int _color2;

  void setModellId(int newId) { this._modellid = newId;}
  int getModellId() { return this._modellid;}

  void setLicensePlate(String newLicensePlate) { this._licensePlate = newLicensePlate;}
  String getLicensePlate() { return this._licensePlate;}

  void setColor1(int c) {this._color1 = c;}
  int getColor1(int c) {return this._color1;}

  void setColor2(int c) {this._color1 = c;}
  int getColor2(int c) {return this._color1;}

}