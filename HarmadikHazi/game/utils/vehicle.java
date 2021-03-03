package game.utils;

class Vehicle {
  private:
    int _modellid;
    String _licensePlate;
    int _color1;
    int _color2;

  public:
    void setModellId(int newId) { this._modellid = newId}
    int getModellId() { return this._modellid}

    void setLicensePlate(String newLicensePlate) { this._licensePlate = newLicensePlate}
    String getLicensePlate() { return this.newLicensePlate}

    void setColor1(int c) {this._color1 = c}
    int getColor1(int c) {return this._color1}

    void setColor2(int c) {this._color1 = c}
    int getColor2(int c) {return this._color1}

}