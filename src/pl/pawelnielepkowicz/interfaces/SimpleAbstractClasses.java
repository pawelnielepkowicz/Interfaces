package pl.pawelnielepkowicz.interfaces;

/**
 * Created by Ja on 04/09/2015.
 */




abstract class Car {

    public abstract void getName(String carName);

    public abstract void improovePerformance();

    public abstract void setHorsePower(int baseHorsePower);

}

class DriftCar extends Car {

    static int horsePower;

    public void setHorsePower(int baseHorsePower){

        horsePower = baseHorsePower;
        System.out.println(horsePower);

    }

    public void getHorsePower(){

        System.out.println(horsePower);

    }


    public void getName(String NissanGTR){

        System.out.println(NissanGTR);

    }



    public void improovePerformance() {


    }

}

public class SimpleAbstractClasses {




}
