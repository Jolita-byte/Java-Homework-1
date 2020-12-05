package Cooking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static List<String> fileContents = new ArrayList<>();

    public static void readFromFile(String filePath) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = in.readLine()) != null) {
                fileContents.add(line);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }

    }
    public static void writeToFile(String filePath) throws IOException {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(filePath));
            for (String s: fileContents) {
                out.write(s+ "\r\n");
            }

/*            String [] array = fileContents.toArray();
            for (String a: array ) {
                System.out.println(a);
            }*/

/*            String line = In.readLine();
            System.out.println(line);
            while ((line = In.readLine()) != null) {
                System.out.println(line);
                fileContentsOut.write(line + "\r\n");*/

            }
        //}
        finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public static List<String> getFileContents(String path) throws IOException {
        readFromFile(path);
        return fileContents;
    }

}
