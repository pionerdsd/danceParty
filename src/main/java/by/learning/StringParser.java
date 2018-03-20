package by.learning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dmurashko on 20.03.2018.
 */
@Component
public class StringParser {

    private int[] code;
    private ArrayList<Integer> list = new ArrayList<>();

    public StringParser() {
        this.code =  convertor();
    }

    public int[] getCode() {
        return code;
    }

    public int[] convertor() {


        System.out.println("Please input numbers and press enter. Minimum 1 - max 50!. Input any other value to exit");
        while (true) {
            Scanner in = new Scanner(System.in);
            String val = in.nextLine();
            if ((val.matches("^[0-9]{1,50}$")) && (list.size() < 50)) {

                list.add(Integer.valueOf(val));
            }
            else {break;}

        }
        return  list.stream().filter(t -> t != null).mapToInt(t -> t).toArray();
    }

}

