package pl.pawelnielepkowicz.interfaces;

/**
 * Created by Ja on 06/09/2015.
 */

interface CanFight{
    void fight();
}

interface CanFly{

    void fly();
}

class ActionCharacter {

    public void swim(){

        System.out.println("ActionCharacter swim");
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly{

    public  void fight(){

        System.out.println("class SuperHero extends ActionCharacter implements HeCanFight, HeCanFly method fight");

    }

    public  void fly(){
        System.out.println("class SuperHero extends ActionCharacter implements HeCanFight, HeCanFly method fly");

    }
}



public class MultipleInterfaces {

    Hero h = new Hero();

    void activateHero(){

        h.fight();

    }



}
