package interviewquestions;

public class AlmostIncreasing {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        System.out.println(solution(sequence));
    }
    public static boolean solution(int[] sequence) {
        if (sequence.length==1)return true;
        int flag = 0;
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < sequence.length; i++) {
            System.out.println(biggestNum);
            if (sequence[i]>biggestNum){
                biggestNum=sequence[i];
            }
            else {
                flag ++;
                System.out.println("Flag!");
            }
        }
        return flag<2;
    }

}
