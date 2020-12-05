
package Cooking;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReceipePrompt {
    private static int menuOption;
/*    private static float amount;
    private static Unit unit;
    private static Unit toUnit;*/
    private static String receipe;

    public static void run() {
        menu();
        if (menuOption == 1) {
            basicConvertionOfMeasurement();
        } else if (menuOption == 2) {
            receipeProcessing();
        } else {
            System.out.println("\u001B[31mIncorect menu option. Menu options should be 1 or 2!!!\n");
            menu();
        }
    }

    private static void menu() {
        System.out.println("1 - basic conversion of a measurement\n2 - receipe processing");
        Scanner input = new Scanner(System.in);
        try {
            menuOption = input.nextInt();
        }catch (InputMismatchException e) {
            System.err.println("2 Incorect menu option");
            menu();
        }
    }

    private static void basicConvertionOfMeasurement() {
        float amount = promptAmount();
        Unit unit = promptUnit("Enter unit:");
        Unit toUnit = promptUnit("Enter unit to convert to:");
        CookingMeasurement CMInput = new CookingMeasurement(amount, unit);
        CMInput = CookingMeasurementConverter.convert(CMInput, toUnit);
        System.out.printf("\u001B[31m%s %s = %s %s", amount, unit, CMInput.getAmount(), CMInput.getUnit());
    }

    private static void receipeProcessing(){
        List<String> recipe = getRecipe();
        for (int i = 0; i < recipe.size(); i++) {
            String recipeLine = recipeLineProcessing(recipe.get(i));
            recipe.remove(i);
            recipe.add(i, recipeLine);
        }
        for (String s: recipe) {
            System.out.println(s);
        }
    }

    private static String recipeLineProcessing(String recipeLine) {
        String[] recipeWords = recipeLine.split(" ");
        for (int j = 0; j < recipeWords.length - 1; j++) {
            if (recipeWords[j].matches("[0-9]") && Unit.unitExists(recipeWords[j + 1])) {
                CookingMeasurement CMInput = new CookingMeasurement(Float.parseFloat(recipeWords[j]), Unit.valueOf(recipeWords[j + 1]));
                CMInput = CookingMeasurementConverter.convert(CMInput, Unit.ML);
                recipeWords[j] = Float.toString(CMInput.getAmount());
                recipeWords[j + 1] = String.valueOf(CMInput.getUnit());
            }
        }
        return String.join(" ", recipeWords);
    }

    private static List<String> getRecipe() {
        List<String> recipe = new ArrayList<>();
        String path = "C:\\Users\\jolged\\IdeaProjects\\Recipe.txt";
        File f = new File(path);
        if (f.isFile()) {
            try {
                recipe = FileUtils.getFileContents(path);
            } catch (IOException e){
                System.err.println("Can't read from file");
            }

        } else {
            promptReceipe();
        }
        return recipe;
    }

    private static void promptReceipe() {
        System.out.println("Enter receipe:");
        Scanner input = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        receipe = input.nextLine();
    }

    private static float promptAmount() {
        System.out.println("Enter amount:");
        float amount = 0;
        Scanner input = new Scanner(System.in);
        try {
            amount = input.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Amount must be float");
            promptAmount();
        }
        return amount;
    }

    private static Unit promptUnit(String text){
        System.out.println(text);
        Unit inputUnit = null;
        Scanner input = new Scanner(System.in);
        try {
            inputUnit = Unit.valueOf(input.next().toUpperCase());
        } catch (IllegalArgumentException e){
            System.err.println("Unit does not exist");
            promptUnit(text);
        }
        return inputUnit;
    }
}