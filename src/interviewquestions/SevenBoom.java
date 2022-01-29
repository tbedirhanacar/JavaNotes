package interviewquestions;

public class SevenBoom {

    public static void main(String[] args) {
        int[] arr1 = {8, 6, 33, 100};
        int[] arr2 = {2, 55, 60, 97, 86};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};

        sevenBoom(arr1);
        sevenBoom(arr2);
        sevenBoom(arr3);
    }

    public static void sevenBoom(int[] arr){
        boolean doesSevenExists = false;
        for (int w: arr) {
            while(w>=1){
                int i = w%10;
                if (i == 7) {
                    doesSevenExists = true;
                    break;
                }
                w = w/10;
            }
            if (doesSevenExists){
                break;
            }
        }
        if (doesSevenExists){
            System.out.println("Boom!");
        }else {
            System.out.println("There is no 7 in the array");
        }

    }
}
