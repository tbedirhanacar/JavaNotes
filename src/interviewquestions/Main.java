package interviewquestions;

    /*

        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

        Input  : Coding is great.

        Output : .taerg si gnidoC

     */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "Coding is great.";

        String[] arr1 = str.split("");
        str = "";

        for (int i = arr1.length-1; i>-1 ; i--) {
            str += arr1[i];
        }

        System.out.println(str);


    }
}

