package playerTests;

import org.junit.Before;
import org.junit.Test;
import player.tankCharacter.Dwarf;
import player.tankCharacter.Troll;
import tools.Armour;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


    Armour armour;
    Armour armourb;
    Weapon weapon;
    Weapon weaponb;
    Dwarf dwarf;
    Troll troll;

    @Before
    public void before(){
        weapon = new Weapon("Battle Axe", 10);
        armour = new Armour("Helmet", 5);
        dwarf = new Dwarf("Sleepy", 100, weapon, armour);
        weaponb = new Weapon("War Hammer", 8);
        armourb = new Armour("Knee Pads", 1);
        troll = new Troll("Colin", 60, weaponb, armourb);
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Sleepy", dwarf.getName());
    }

    @Test
    public void dwarfHasHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void dwarfHasWeapon(){
        assertEquals("Battle Axe", dwarf.getWeapon().getName());
    }

    @Test
    public void trollHasWeapon(){
        assertEquals("War Hammer", troll.getWeapon().getName());
    }

    @Test
    public void dwarfHasArmour(){
        assertEquals("Helmet", dwarf.getArmour().getName());
    }

    @Test
    public void canChangeName(){
        dwarf.setName("Dopey");
        assertEquals("Dopey", dwarf.getName());
    }

    @Test
    public void canChangeHealth(){
        dwarf.setHealth(75);
        assertEquals(75, dwarf.getHealth());
    }

    @Test
    public void canChangeWeapon(){
        Weapon weapon1 = new Weapon("Claymore", 60);
        dwarf.setWeapon(weapon1);
        assertEquals("Claymore", dwarf.getWeapon().getName());
    }

    @Test
    public void canChangeArmour(){
        Armour armour1 = new Armour("Pants", 10);
        dwarf.setArmour(armour1);
        assertEquals("Pants", dwarf.getArmour().getName());
    }

//    @Test
//    public void dwarfCanAttack(){
//        dwarf.attack(troll.setHealth(dwarf.getWeapon().getValue()));
//        assertEquals(50, troll.getHealth());
//    }



}
