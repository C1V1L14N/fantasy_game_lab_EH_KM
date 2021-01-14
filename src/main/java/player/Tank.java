package player;

import player.behaviours.IFight;
import tools.Armour;
import tools.Weapon;

public abstract class Tank extends Player implements IFight {

    private Weapon weapon;
    private Armour armour;

    public Tank(String name, int health, Weapon weapon, Armour armour) {
        super(name, health);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Armour getArmour(){
        return armour;
    }

    public void setArmour(Armour armour){
        this.armour = armour;
    }



}