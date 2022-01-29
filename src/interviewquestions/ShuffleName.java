package interviewquestions;

public class ShuffleName {

    public static void main(String[] args) {
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));
    }

    public static String nameShuffle(String s) {
        String[] names = s.split(" ");
        return names[1] + " " + names[0];
    }
}
