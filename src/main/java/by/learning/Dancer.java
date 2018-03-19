package by.learning;

import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by dmurashko on 19.03.2018.
 */

@Component
public class Dancer {
    private int [] danceCode;

    public Dancer() {
        this.danceCode = makeCode();
        //System.out.println("Dancer have been initialized!");
    }

    public int[] getDanceCode() {
        return danceCode;
    }

public static int [] makeCode(){
    System.out.println("Введите число от 0 до 99999999999999999999999999999999999999999999999999");
    Scanner in = new Scanner(System.in);
    String code = in.nextLine();
    int [] danceCode = new int[code.length()];
    for (int i = 0; i < code.length(); i++){
        danceCode[i] = code.charAt(i)- '0';
    }
    return danceCode;

}

}
