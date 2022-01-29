package interviewquestions;

import java.util.Arrays;

    /*
        Soru:
        Size bir sayı dizisi veriliyor. Bu dizideki her elemanın yerinde, o eleman harici tüm elemanların çarpımını içeren bir dizi döndürün.
        Örnek:
        Liste = [1,2,3,4,5]
        Sonuç = [120, 60, 40, 30, 24]
    */

public class UnluAlgoritmaSorulari02 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(divisionOfAllElementsOtherThanCurrentElement(arr)));

    }
    public static int[] divisionOfAllElementsOtherThanCurrentElement(int[] array){
        int[] arr = new int[array.length];
        int multiplication = 1;
//        for (int i = 0; i < array.length; i++) {
//            multiplication = 1;
//            for (int j = 0; j< array.length; j++) {
//                if (i != j) {
//                    multiplication *= array[j];
//                }
//            }
//            arr[i] = multiplication;
//        }
        for (int i = 0; i < array.length; i++) {
        	multiplication *= array[i];      	
		}
        for (int i = 0; i < array.length; i++) {
			arr[i] = multiplication/array[i];
		}
        return arr;
    }

}
