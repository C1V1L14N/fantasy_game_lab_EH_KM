package playerTests;

import org.junit.Before;
import org.junit.Test;
import player.tankCharacter.Dwarf;
import tools.Armour;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Armour armour;
    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Battle Axe", 10);
        armour = new Armour("Helmet", 5);
        dwarf = new Dwarf("Sleepy", 100, weapon, armour);
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Sleepy", dwarf.getName());
    }


}
