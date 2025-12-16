package thomas.initiative;
import thomas.initiative.Rolls;
/**
 * A character in an RPG.
 * 
 * A character always has a name and proficiency bonus.
 * Whenever *rolleForInitiative* is called, the initiativeRoll field will be populated
 * with their initiative for the current encounter.  
 * Prior to calling rollForInitiative, the value of initiativeRoll is undefined.
 * 
 * @author Thomas
 */
public class RpgCharacter {
    public final String name;
    public int initiativeRoll = 0;
    public int proficiencyBonus = 0;

    public RpgCharacter(String name, int proficiencyBonus) {
      this.name = name;    
      this.proficiencyBonus = proficiencyBonus;
    }

    /**
    After calling this method, the initiativeRoll field will be populated
    with the character's d20 initiative roll.
    */
    public void rollForInitiative(){
      initiativeRoll = Rolls.roll20() + this.proficiencyBonus;
    }

    public String toString(){
      return "Character(name = " + this.name + ", roll = " + this.initiativeRoll + ", proficiency bonus = " + this.proficiencyBonus + ")";
    }
}