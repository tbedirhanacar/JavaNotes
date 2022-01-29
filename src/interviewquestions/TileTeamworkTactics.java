package interviewquestions;

public class TileTeamworkTactics {

    public static void main(String[] args) {

        System.out.println(possibleBonus(3, 7));
        System.out.println(possibleBonus(1, 9));
        System.out.println(possibleBonus(5, 3));

    }

    public static boolean possibleBonus(int a, int b){
        return (b - a) < 6 && (b - a) > 0;
    }
}
