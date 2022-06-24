import java.util.ArrayList;

public class Score1 {


    public static void main(String[] args) {
        Score1 score = new Score1();
        score.calculateScore("ABBACCCCCAC");

    }

    public static ArrayList<Integer> calculateScore(String Score) {
        System.out.println(Score);
        ArrayList<Integer> aCounter = new ArrayList<Integer>();
        ArrayList<Integer> bCounter = new ArrayList<Integer>();
        ArrayList<Integer> cCounter = new ArrayList<Integer>();

        for (int i = 0; i < Score.length(); i++) {
            String letter = String.valueOf(Score.charAt(i));

            if (letter.equals("A")) {
                aCounter.add(1);

            } else if (letter.equals("B")) {
                bCounter.add(1);


            } else if (letter.equals("C")) {
                cCounter.add(1);

            }

        }
        // System.out.println("Score is: " + aCounter.size() + bCounter.size() + cCounter.size());
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(aCounter.size());
        result.add(bCounter.size());
        result.add(cCounter.size());
        System.out.println("Score is: " + result);
        return result;
    }


}










