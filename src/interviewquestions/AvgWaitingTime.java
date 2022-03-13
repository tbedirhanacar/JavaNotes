package interviewquestions;

public class AvgWaitingTime {
    public static void main(String[] args) {
        int[][] arr = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(arr));
    }

        public static double averageWaitingTime(int[][] customers) {
            int currentTime = customers[0][0];
            double avgWaitingTime = 0;
            for (int[] w: customers) {
                int finishedTime = (w[0]>currentTime)?w[0]+w[1]:currentTime+w[1];
                avgWaitingTime+=finishedTime-w[0];
                currentTime = (w[0]>currentTime)?(currentTime=w[0]+w[1]):currentTime+w[1];;
            }
            return avgWaitingTime/customers.length;
        }
}
