
package Cooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReceipePrompt {
    private int menuOption;
    private float amount;
    private Unit unit;
    private Unit toUnit;
    private String receipe;

    public void run() throws InputMismatchException {
        menu();
        if (menuOption == 1) {
            basicConvertionOfMeasurement();
        } else if (menuOption == 2) {
            receipeProcessing();
        } else throw new InputMismatchException("Menu options are 1 or 2");
    }

    private void menu() {
        System.out.println("1 - basic conversion of a measurement\n2 - receipe processing");
        Scanner input = new Scanner(System.in);
        try {
            menuOption = input.nextInt();
        }catch (InputMismatchException e) {
            System.err.println("Incorect menu option");
            menu();
        }
//        while (menuOption != 1 && menuOption != 2) {
//            System.out.println("Selected not 1 or 2. select Menu again:");
//            menuOption = input.nextInt();//I don't know how to read whole text.
//        }
    }

    private void basicConvertionOfMeasurement() {
        promptAmount();
        promptUnit();
        promptToUnit();
        CookingMeasurement CMInput = new CookingMeasurement(amount, unit);
        CMInput = CookingMeasurementConverter.convert(CMInput, toUnit);
        System.out.printf("\u001B[31m%s %s = %s %s", amount, unit, CMInput.getAmount(), CMInput.getUnit());
    }

    private void receipeProcessing(){
        prompReceipe();
        String [] recipeWords = receipe.split(" ");
        for (int i = 0; i < recipeWords.length-1; i++){
            if (recipeWords[i].matches("[0-9]") && unit.unitExists(recipeWords[i+1])){}
/*Cooking.Units.unitExists(recipeWords[i+1])*//*
){
                CookingMeasurement CMInput = new CookingMeasurement(Float.parseFloat(recipeWords[i]), recipeWords[i+1]);
                CMInput = CookingMeasurementConverter.convert(CMInput, Unit.ML);
                recipeWords[i] = Float.toString(CMInput.getAmount());
                recipeWords[i+1] = CMInput.getUnit();
            }
        }
        receipe = String.join(" ", recipeWords);
        System.out.println(receipe);*/
    }
    }

    private void prompReceipe() {
        System.out.println("Enter receipe:");
        Scanner input = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        receipe = input.nextLine();
    }

    private void promptAmount() {
        System.out.println("Enter amount:");
        Scanner input = new Scanner(System.in);
        try {
            amount = input.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Amount must be float");
            promptAmount();
        }
    }

    private void promptUnit(){
        System.out.println("Enter unit:");
        Scanner input = new Scanner(System.in);
        try {
            unit = Unit.valueOf(input.next().toUpperCase());
        } catch (IllegalArgumentException e){
            System.err.println("Unit does not exists");
            promptUnit();
        }
    }

    private void promptToUnit(){
        System.out.println("Enter unit to convert to:");
        Scanner input = new Scanner(System.in);
        try {
            toUnit = toUnit.valueOf(input.next().toUpperCase());
        } catch (IllegalArgumentException e){
            System.err.println("Unit does not exists");
            promptToUnit();
        }
    }
}