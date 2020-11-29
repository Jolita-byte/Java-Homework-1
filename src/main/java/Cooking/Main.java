package Cooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        ReceipePrompt rp = new ReceipePrompt();
        try{
            rp.run();
        }catch (InputMismatchException e) {
            System.err.println("Incorect menu option");
            rp.run();
        }



/*        CookingMeasurement cm = new CookingMeasurement(amount, unit);
        cm = CookingMeasurementConverter.convert(cm, Cooking.Units.ML);
        System.out.printf("%s %s = %s %s", amount, unit, cm.getAmount(),cm.getUnit());*/
    }

}
