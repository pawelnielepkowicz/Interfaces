package pl.pawelnielepkowicz.interfaces;

/**
 * Created by Ja on 04/09/2015.
 */


abstract class Car {

    public abstract void setName(String carName);

    public abstract void getName();

    public abstract void improvePerformance(int extraHP);

    public abstract void setHorsePower(int _horsePower);

}

class DriftCar extends Car {

    int horsePower;
    String carName;


    public void setName(String _carName) {

carName = _carName;

    }

    public void getName() {

        System.out.println("carName: " + carName);

    }


    public void setHorsePower(int _horsePower) {

        horsePower = _horsePower;
        System.out.println("horsepower: " + horsePower);

    }

    public void getHorsePower() {

        System.out.println("horsepower: " + horsePower);

    }


    public void improvePerformance(int extraHP) {

        horsePower +=extraHP;
        System.out.println("new horsepower: " + horsePower);


    }

    DriftCar(){

    }

}

class JapanDriftCar extends DriftCar{

    String specialProperties;

    public void setSpecialProperties(String _specialProperties){

        specialProperties = _specialProperties;
        System.out.println("specialProperties: " + specialProperties);

    }

}




public class SimpleAbstractClasses {


    SimpleAbstractClasses(){

        DriftCar GTR = new DriftCar();
        GTR.setHorsePower(1450);
    }






}
