package interviewquestions;

public class Stuttering {
    public static String stutter(String word) {
        String beginningOfStutter = word.substring(0,2);
        return beginningOfStutter.concat("... ").concat(beginningOfStutter).concat("... ").concat(word).concat("?");
    }
}