// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
package kettch.initiative;
import java.util.List;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {
    List<RpgCharacter> encounter = new ArrayList<RpgCharacter>();

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

    InitiativeOrder.calculateOrder(encounter);
    InitiativeOrder.printOrder(encounter);

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}