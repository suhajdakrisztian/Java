Package Player;

import.game.utils.vehicle;
import Integer.toString;

class Player {

  private:
    String _name;
    String _ipAddress;
    int _health;
    Vehicle _vehicle;

  public:
    String toString() {

      String fullString;

      if(this._vehicle != null)
        fullString = this._name + this._ipAddress + Integer.toString(_health) + Integer.toString(this._vehicle._licensePlate);
      else 
        fullString = this._name + this._ipAddress + Integer.toString(_health);

      return fullString;
    }
}