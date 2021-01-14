package tools;

import player.behaviours.IProtect;

public class Armour extends Tool implements IProtect {

    public Armour(String name, int value) {

        super(name, value);
    }


    @Override
    public void protect() {

    }
}
