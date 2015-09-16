package pl.pawelnielepkowicz.interfaces;

/**
 * Created by Ja on 06/09/2015.
 */

interface Areoplane {

    void setAeroplaneName(String _aeroplaneName);

    String getAeroplaneName();

}


class BigAeroplane implements Areoplane {

    String aeroplaneName;

    public void setAeroplaneName(String _aeroplaneName) {
        aeroplaneName = _aeroplaneName;


    }

    public String getAeroplaneName() {
        System.out.println(aeroplaneName);
        return aeroplaneName;

    }
}

class AirbusAeroplane extends BigAeroplane {


    public String getAeroplaneName() {

        return "getAeroplaneName airbusAeroplane";

    }

    public void getAirbusName() {

        System.out.println("getAirbusName");

    }

}

public class Interfaces {

    public Areoplane samoliciki[] = {

            new BigAeroplane(),
            new AirbusAeroplane()
    };


}
