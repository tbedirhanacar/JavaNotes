package interviewquestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNum = 0;
        while (num>=1){
            int i = num%10;
            num = num/10;
            reversedNum = reversedNum*10+i;
        }
        System.out.println("Reverse Of The Number: " + reversedNum);
    }
}
