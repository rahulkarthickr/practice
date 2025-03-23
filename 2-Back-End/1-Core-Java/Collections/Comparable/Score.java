import java.util.ArrayList;
import java.util.Collections;

public class Score implements Comparable<Score> {
    String player;
    Integer score;

    Score(String player, Integer score) {
        this.player = player;
        this.score = score;
    }

    public int compareTo(Score s) {
        // Java's compareTo() for integers works as:
        // a.compareTo(b) returns -1 if a < b
        // a.compareTo(b) returns 1 if a > b
        // a.compareTo(b) returns 0 if a == b
        // this.score.compareTo(s.score) - compares values in ascending order
        // Swapping o.score and this.score inverts ascending order to descending order
        // s.score.compareTo(this.score) - compares values in descending order
        int scoreComparison = s.score.compareTo(this.score);
        if (scoreComparison != 0) {
            return scoreComparison;
        }
        // If scores are equal, it compares player names in ascending order
        return this.player.compareTo(s.player);
    }

    public String toString() {
        return score + " " + player;
    }

    public static void main(String[] args) {
        ArrayList<Score> al = new ArrayList<>();
        al.add(new Score("B", 60));
        al.add(new Score("C", 70));
        al.add(new Score("A", 60));
        al.add(new Score("D", 40));
        Collections.sort(al);
        System.out.println(al);
    }
}
