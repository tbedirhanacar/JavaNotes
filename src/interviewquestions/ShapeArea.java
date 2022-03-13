package interviewquestions;

public class ShapeArea {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(solution(4));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
//    public static int solution(int n) {
//        int output = 1;
//        for (int i = 1; i <= n; i++) {
//            output+=4*(i-1);
//        }
//        return output;
//    }

    public static int solution(int n) {
        return 2*(n*n)-(2*n-1);
    }



}
