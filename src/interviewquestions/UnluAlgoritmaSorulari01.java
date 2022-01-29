package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnluAlgoritmaSorulari01 {

    /*
        Soru: Size bir sayı dizisi ve 'k' sayısı veriliyor. Bu dizideki herhangi iki sayının toplamının 'k' olup olmadığını bulan bir program yazınız.

        Örnek:
        Liste = [10, 15, 3, 7]
        k = 17 için 10 ve 7 sayılarının toplamı 17 ediyor.
     */

    public static void main(String[] args) {

        int k = 62;
        int[] arr = {50, 12, 51, 43, 16, 11, 40, 22};

        System.out.println(twoNumbersSumEqualToNumber1(arr,k));




    }

    public static boolean twoNumbersSumEqualToNumber1(int[] arr, int k) {
        Arrays.sort(arr);
        int num1 = 0, num2 = arr.length - 1;
        int sum;
        while (num1 != num2) {
            sum = arr[num1] + arr[num2];
            if (sum > k) {
                num2--;
            }
            if (sum < k) {
                num1++;
            }
            if (sum == k) {
                System.out.println(arr[num1]+", "+arr[num2]);
                return true;
            }
        }
        return false;
    }

    public static boolean twoNumbersSumEqualToNumber2(int[] arr, int k) {
        List<Integer> tumleyen = new ArrayList<>();
        for (Integer w : arr) {
            if (!tumleyen.contains(w)){
                tumleyen.add(k-w);
            }
            if (tumleyen.contains(w)){
                System.out.println(arr[tumleyen.indexOf(w)]+ ", " + w);
                return true;
            }
        }
        return false;
    }

}


