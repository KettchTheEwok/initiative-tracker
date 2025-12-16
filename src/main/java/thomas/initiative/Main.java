package thomas.initiative;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import thomas.initiative.RpgCharacter;
import thomas.initiative.Rolls;

public class Main {
  
  public static void main(String[] args) {
    List<RpgCharacter> encounter = new ArrayList<RpgCharacter>();

    
    //List<RpgCharacter> party = new ArrayList<RpgCharacter>();
    //Characters in party
    RpgCharacter alric = new RpgCharacter("Alric", 5);
    RpgCharacter senorI = new RpgCharacter("Señor Incompetons", 0);
    RpgCharacter balin = new RpgCharacter("Balin", 0);
    RpgCharacter lordV = new RpgCharacter("Lord Valkren", 0);
    

    List<RpgCharacter> party = List.of(
      alric, senorI, balin, lordV);
    
    RpgCharacter randomKolbold1 = new RpgCharacter("Random Kolbold 1", 0);

    encounter.addAll(party);
    encounter.add(randomKolbold1);

    for (RpgCharacter character : encounter) {
      character.rollForInitiative();
      System.out.println(character.name + ": " + character.initiativeRoll);
    }

    // System.out.println(party);

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}