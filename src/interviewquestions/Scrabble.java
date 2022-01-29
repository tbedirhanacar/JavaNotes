package interviewquestions;

    import java.util.Scanner;

    public class Scrabble {

        int userNumber;
        int userPoint = 0;
        String currentUsersWord;

        public Scrabble(int usrNum){
            this.userNumber = usrNum;
        }

        public static void main(String[] args) {

            char reply;

            Scanner sc =  new Scanner(System.in);

            Scrabble p1 = new Scrabble(1);
            Scrabble p2 = new Scrabble(2);

            do {

                System.out.println("Player 1! Type your word");
                p1.currentUsersWord = sc.next();
                System.out.println("Player 2! Is the word " + p1.currentUsersWord + " valid? [Y/N]");
                reply = sc.next().charAt(0);

                if (reply == 'Y') {
                    p1.addPoints();
                    System.out.println("User 1 has " + p1.userPoint + " points");
                }else{
                    System.out.println("Word is not valid! User 2 won with " + p2.userPoint + " points");
                    break;
                }

                //------------------------------------

                System.out.println("Player 2! Type your word");
                p2.currentUsersWord = sc.next();
                System.out.println("Player 1! Is the word " + p2.currentUsersWord + " valid? [Y/N]");
                reply = sc.next().charAt(0);

                if (reply == 'Y') {
                    p2.addPoints();
                    System.out.println("User 2 has " + p2.userPoint + " points");
                }else{
                    System.out.println("Word is not valid! User 1 won with " + p1.userPoint + " points");
                    break;
                }

            } while (true);


        }

        public void addPoints(){
            userPoint += currentUsersWord.length();
        }

    }

