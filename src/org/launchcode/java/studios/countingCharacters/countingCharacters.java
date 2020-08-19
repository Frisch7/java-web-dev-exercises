package org.launchcode.java.studios.countingCharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string or press ENTER to read from file: ");
        String words = input.nextLine();
        if(words.equals("")){
            words = readFromFile();
        }
        //String words = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String originalWord = words;
        words = words.toLowerCase();
        words = words.replaceAll("[^a-z]", "");
        char[] charactersInString = words.toCharArray();

        System.out.println("Original String: " + originalWord);
        countCharsInArray(charactersInString);
    }

    public static void countCharsInArray(char[] charArray){
        HashMap<Character, Integer> characterMap = new HashMap<>();

        for (char letter: charArray) {
            if(characterMap.containsKey(letter)){
                characterMap.put(letter, characterMap.get(letter) + 1);
            }else{
                characterMap.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> item: characterMap.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }

    public static String readFromFile(){
        String fileWords = "";
        try{
            File stringFile = new File("C:/LaunchCodeWorkSpace/java-web-dev-exercises/src/org/launchcode/java/studios/countingCharacters/string.txt");
            Scanner reader = new Scanner(stringFile);

            while(reader.hasNextLine()){
                 fileWords += reader.nextLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileWords;
    }
}
