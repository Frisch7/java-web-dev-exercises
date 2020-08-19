package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        //loop through full array
        System.out.println("Print full array");
        for (int number : numbers
             ) {
            System.out.println(number);
        }

        //loop through array and print only odd numbers
        System.out.println("Print Odd Numbers only");
        for (int odd: numbers
             ) {
            if(!(odd % 2 == 0)){
                System.out.println(odd);
            }
        }

        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray = words.split("\\.");
        System.out.println(Arrays.toString(wordsArray));

        int[] moreNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumOfEvens(moreNumbers));

        String[] moreWords = words.split(" ");
        findByNumberOfLetters(4, moreWords);
    }

    public static int sumOfEvens(int[] numbers){
        int sum = 0;
        for (int number: numbers
             ) {
            if(number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }

    public static void findByNumberOfLetters(int numberOfLetters, String[] wordArray){
        for (String word:wordArray
             ) {
            if(word.length() == numberOfLetters){
                System.out.println(word);
            }
        }
    }
}
