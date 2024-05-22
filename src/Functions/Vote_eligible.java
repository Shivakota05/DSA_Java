package Functions;

import java.util.Scanner;
//Tell if a person is eligible to vote or not by taking age from user
public class Vote_eligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        Iseligible(age);
    }

    static void Iseligible(int age) {
        if (age >= 18) {
            System.out.println("The Person is Eligible to Vote");
        } else {
            System.out.println("The Person is Not Eligible to Vote");
        }

    }
}
