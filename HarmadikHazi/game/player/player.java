package player;

import utils.Vehicle;
import Integer.toString;

class Player {

  private String _name;
  private String _ipAddress;
  private int _health;
  private Vehicle _vehicle;

  Player(String newName, String ip, Vehicle veh) {
    this._name = newName;
    this._ipAddress = ip;
    this._vehicle = veh;
  }
  Player(String newName, String ip) {
    this._name = newName;
    this._ipAddress = ip;
  }

  String toString() {
    String fullString;
    if(this._vehicle != null)
      fullString = this._name + this._ipAddress + Integer.toString(_health) + Integer.toString(this._vehicle._licensePlate);
    else 
      fullString = this._name + this._ipAddress + Integer.toString(_health);
    return fullString;
  }
}