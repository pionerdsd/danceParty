package by.learning;

import by.learning.Interfaces.Shows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dmurashko on 19.03.2018.
 */
@Component
public class DanceV2 implements Shows {
    Dancer dancer;
    DanceFloor danceFloor;

    @Autowired
    public DanceV2(Dancer dancer, DanceFloor danceFloor) {
        this.dancer = dancer;
        this.danceFloor = danceFloor;
    }

    @Override
    public int dance() {
        int n[] = dancer.getDanceCode();
        int size = danceFloor.getSize();
        int posision = 0, steps = 0;

        for (int i = 0; i < size; i++) {
            if (n[i] % 2 != 0) {
                n[i] = (-1) * n[i];
            }
            if ((posision + n[i] > size) || (posision + n[i] < 0)) {
                steps += posision;
                posision = 0;
            } else {
                steps += Math.abs(n[i]);
                posision += n[i];
            }
            System.out.print("i = " + i + " ");
            System.out.print("n[" + i + "] = " + n[i] + " ");
            System.out.print("position = " + posision + " ");
            System.out.println("steps = " + steps);
        }
        System.out.println(steps);
        return steps;
    }


}


