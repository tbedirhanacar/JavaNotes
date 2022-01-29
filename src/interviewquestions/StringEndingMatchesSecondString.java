package interviewquestions;

public class StringEndingMatchesSecondString {
    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "d"));

    }

    public static boolean checkEnding(String str1, String str2) {
        return str1.substring(str1.length()-str2.length()).equals(str2);
    }
}
