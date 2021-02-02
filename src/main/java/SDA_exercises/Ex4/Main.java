package SDA_exercises.Ex4;

import SDA_exercises.Ex4.Storage;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ex4------------");
        //Map<String,String> map4 = new HashMap<>();
        Storage storage = new Storage();
        storage.addToStorage("Java", "18");
        storage.addToStorage("Java", "15");
        storage.addToStorage("Python", "1");
        storage.addToStorage("PHP", "0");
        storage.printValues("Java");
        //MapPrint(map4);
    }
}
