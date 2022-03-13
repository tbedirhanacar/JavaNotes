package interviewquestions;

import java.util.Arrays;

public class Statues {
    public static void main(String[] args) {
        int [] statues = {7, 3, 7, 10, 1, 4};
        System.out.println(solution(statues));
    }
    public static int solution(int[] statues) {
        int[] stat = statues;
        Arrays.sort(stat);
        int requiredStatues = 0;
        for (int i = 0; i < stat.length-1; i++) {
            if (stat[i+1]==stat[i])continue;
            if (stat[i+1]!=stat[i]+1){
                requiredStatues += stat[i+1]-stat[i]-1;
            }
        }
        return requiredStatues;
    }
}
