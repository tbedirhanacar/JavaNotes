package interviewquestions;

public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2};
        System.out.println(countBoomerangs(arr));
    }

    public static int countBoomerangs(int[] arr){
        int numOfBoomerangs = 0;
        if (arr.length<3){
            return 0;
        }
        int i = 2;
        while (i < arr.length){
            if (arr[i-2]==arr[i] && arr[i-1]!=arr[i]){
                numOfBoomerangs++;
            }
            i++;
        }
        return numOfBoomerangs;
    }


}
