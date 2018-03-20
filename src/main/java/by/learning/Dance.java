package by.learning;

import by.learning.Interfaces.Shows;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dmurashko on 19.03.2018.
 */
//@Component
public class Dance implements Shows {
    Dancer dancer;
    DanceFloor danceFloor;
    @Autowired
    public Dance(Dancer dancer, DanceFloor danceFloor) {
        this.dancer = dancer;
        this.danceFloor = danceFloor;
    }

    @Override
    public int  dance() {
        int n[] = dancer.getDanceCode();
        int size = danceFloor.getSize();
        int posision = 0, steps = 0;
        for (int i = 0; i < size; i++) {
            if (n[i] % 2 == 0) {
                if (posision + n[i] <= size) {
                    steps += n[i];
                    posision += n[i];
                }else {
                    steps+=posision;
                    posision=0;
                }
            }else {
                if(posision-n[i]>0){
                    steps+=n[i];
                    posision-=n[i];
                }else {
                    steps+=posision;
                    posision=0;
                }
            }
            System.out.print("i = "+ i + " ");
            System.out.print("n[" + i + "] = "+ n[i] + " ");
            System.out.print("position = "+ posision + " ");
            System.out.println("steps = " + steps);
        }
        System.out.println(steps);


        return steps;
    }


}
