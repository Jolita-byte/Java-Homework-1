package edu;

public class StringSum {
        public static int add(String numbersString){
            if (numbersString == null || numbersString.isEmpty()){
                return 0;
            }

            String [] numbersArray = numbersString.split("[+,;:.]");
            int result = 0;
            for (int i = 0; i < numbersArray.length; i++){
                result += Integer.parseInt(numbersArray[i]);
            }

            return result;
        }
    }
