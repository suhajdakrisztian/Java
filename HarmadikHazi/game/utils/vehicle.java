package game.utils;

public class Vehicle {

  private int _modellid;
  private String _licensePlate;
  private int _color1;
  private int _color2;

  public Vehicle(int modelid, String plate, int c1, int c2) {
    this._modellid = modelid;
    this._licensePlate = plate;
    this._color1 = c1;
    this._color2 = c2;
  }

  public void setLicensePlate(String newLicensePlate) { this._licensePlate = newLicensePlate;}
  public String getLicensePlate() { return _licensePlate;}

}