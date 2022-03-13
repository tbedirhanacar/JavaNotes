package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class HauntedRooms   {
    public static void main(String[] args) {
        int[][] arr =  {{0,1,1,2},
                        {0,5,0,0},
                        {2,0,3,3}};
        System.out.println(solution(arr));
    }
    public static int solution(int[][] matrix) {
        List<Integer> hauntedCols = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (hauntedCols.contains(j))continue;
                if(matrix[i][j]==0)hauntedCols.add(j);
                else sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
