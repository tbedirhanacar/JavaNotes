package interviewquestions;

public class FindTheBomb {
    public static void main(String[] args) {
        System.out.println(bomb("There is a bomb."));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(bomb("This goes boom!!!"));
    }
    public static String bomb(String str) {
        if (str.toLowerCase().contains("bomb")){
            return "DUCK!";
        }return "Relax, there's no bomb.";
    }
}