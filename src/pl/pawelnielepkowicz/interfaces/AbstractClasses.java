package pl.pawelnielepkowicz.interfaces;

/**
 * Created by Ja on 03/09/2015.
 */

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

// abstract play
// abstract adjust
// regular what


abstract class Instrument {

    private int i;

    public abstract void play(String name);

    public abstract void adjust();

    String what() {

        return "whatInstrument";
    }

}




class Percussion extends Instrument {

    public void play(String name) {

        System.out.println(name);

    }

    public String what() {

        return "whatWind";
    }

    public void adjust() {

    }
}





class Drums extends Percussion {
    public void play(Note n){System.out.println("Brass.play() " + n);
    }

    public void adjust() {
        System.out.println("Drums.adjust()");
    }
}

public class AbstractClasses {



    public  void tuneInstrument(Instrument instrument){

        instrument.adjust();
        instrument.play("Play");
    }



    public  void tuneAll(Instrument[] instrumentInArray){

        // for each Instrument i in instrumentInArray
        for (Instrument i : instrumentInArray)
            tuneInstrument(i);
    }




}
