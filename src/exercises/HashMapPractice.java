package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentID;



        do{
            System.out.print("Enter student ID (or -1 to finish): ");
            newStudentID = input.nextInt();

            if(!(newStudentID == -1)){
                System.out.print("Student Name: ");
                String newName = input.next();
                students.put(newStudentID, newName);
            }
        }while(!(newStudentID == -1));
        System.out.println("\nClass Roster: ");
        for (Map.Entry<Integer, String> student: students.entrySet()
             ) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
