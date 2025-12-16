package thomas.initiative;

import java.util.Random;

public class Rolls {

  public static int roll20() {
    Random rng = new Random();
    int roll = rng.nextInt(20) + 1;
    return roll;
  }
}