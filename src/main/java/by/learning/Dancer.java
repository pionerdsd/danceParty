package by.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dmurashko on 19.03.2018.
 */

@Component
public class Dancer {

    private int [] danceCode;


    @Autowired
    public Dancer(StringParser stringParser) {

        this.danceCode = stringParser.getCode();
    }


    public int[] getDanceCode() {
        return danceCode;
    }


}
