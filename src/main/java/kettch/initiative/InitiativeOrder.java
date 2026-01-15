package kettch.initiative;
import java.util.List;
import java.util.ArrayList;
public class InitiativeOrder {
    public static void calculateOrder(List<RpgCharacter> creatures){
        for (RpgCharacter Character : creatures){
            Character.rollForInitiative();
        }
    }
    public static void printOrder(List<RpgCharacter> creatures){
        for (RpgCharacter Character : creatures) {
            Character.printInitiativeRoll();}
        }
    }

