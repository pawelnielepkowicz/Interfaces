package pl.pawelnielepkowicz.interfaces;

public class Main {

    public static void main(String[] args) {
        Instrument orchestra[] = {

                new Percussion(),
                new Drums()

        };
        AbstractClasses AB = new AbstractClasses();
        AB.tuneAll(orchestra);

        DriftCar GTR = new DriftCar();
        GTR.setHorsePower(450);

    }
}
