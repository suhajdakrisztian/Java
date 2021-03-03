package game.main;

import game.player.Player;
import game.utils.Vehicle;

class Main {
  public static void main(String[] args) {

    Vehicle v1 = new Vehicle(12312, "RAC-145", 234, 567);
    Vehicle v2 = new Vehicle(345345, "RAC-146", 999, 567);
    Vehicle v3 = new Vehicle(1297312, "RAC-147", 234, 888);

    Player p = new Player("Suhi", "168.1.1.1.", v1);
    Player p2 = new Player("Laura", "169.1.1.1");

    System.out.println(p.toString());
    System.out.println(p2.toString());
  }
}