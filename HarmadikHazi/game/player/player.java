package game.player;

import game.utils.Vehicle;

public class Player {

  private String _name;
  private String _ipAddress;
  private int _health;
  private Vehicle _vehicle;

  public Player(String newName, String ip, Vehicle veh) {
    this._name = newName;
    this._ipAddress = ip;
    this._vehicle = veh;
    this._health = 100;
  }

  public Player(String newName, String ip) {
    this._name = newName;
    this._ipAddress = ip;
    this._vehicle = null;
    this._health = 100;
  }

  public String toString() {
    String fullString;
    if(this._vehicle != null)
      fullString = "Nev: " + this._name + "\n" + "IP: " + this._ipAddress + "\n" + "Health: " + this._health + "\n" + "Rendszam: " + _vehicle.getLicensePlate();
    else 
      fullString = "Nev: " + this._name + "\n" + "IP: " + this._ipAddress + "\n" + "Health: " + this._health;
    return fullString;
  }
}