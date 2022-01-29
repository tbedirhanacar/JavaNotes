package interviewquestions;

public class CaptureTheRook {

    public static void main(String[] args) {

    }

    public static boolean canCapture(String[] rooks) throws IllegalArgumentException {
        if (rooks[0].equalsIgnoreCase(rooks[1])){
            throw new IllegalArgumentException("Squares cannot be same!");
        }
        return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
    }
}
class IllegalArgumentException extends Exception{
    public IllegalArgumentException (String message) {
        super(message);
    }
}