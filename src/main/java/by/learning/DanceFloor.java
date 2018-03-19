package by.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dmurashko on 19.03.2018.
 */
@Component
public class DanceFloor {
    private int size;

    private Dancer dancer;

    @Autowired
    public DanceFloor(Dancer dancer) {
        size = dancer.getDanceCode().length;
          //System.out.println("DanceFloor size = " + size);
    }

    public int getSize() {
        return size;
    }
}