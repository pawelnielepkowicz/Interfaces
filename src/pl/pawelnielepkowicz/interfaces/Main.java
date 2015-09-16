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

        GTR.setName("Charlie Wonka");
        GTR.getName();
        GTR.improvePerformance(120);


        JapanDriftCar JapanGTR = new JapanDriftCar();
        // new unique methood
        JapanGTR.setName("JapanGTR");
        JapanGTR.getName();
        JapanGTR.setSpecialProperties("I am very fast");

        new SimpleAbstractClasses();
        new SimpleAbstractClasses();

        Interfaces inter = new Interfaces();
        inter.samoliciki[0].setAeroplaneName("Dreamliner");
        inter.samoliciki[1].setAeroplaneName("A320");

        System.out.println(inter.samoliciki[1].getAeroplaneName());


        // inter.samoliciki[1].getAirbusName();

        MultipleInterfaces myHero = new MultipleInterfaces();
        myHero.activateHero();
    }
}
