package interviewquestions;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 3 , 5, 6, 11, 23};
		twoSum(arr, 8	);

	}
	
	public static void twoSum(int[] arr, int sum) {
		int i=0, j=arr.length-1;
		int actualSum = 0;
		while (true) {
			actualSum = arr[i] + arr[j];
			if (actualSum == sum) {
				break;
			}else if (actualSum>sum) {
				j--;
			}else if (actualSum<sum){
				i++;
			}
		}
		System.out.println(arr[i]+" + "+ arr[j] + " = " + sum);
		
		
	}
}
