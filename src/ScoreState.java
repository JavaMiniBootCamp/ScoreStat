import java.util.Scanner;

public class ScoreState {
    public static void main (String args[]){
        int min=0, max=0, sum=0;
        double avg=0;
        int score=0, counter=0;
        double sumDouble =0;


        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();
        min = score;
        max = score;

        while (score != -1) {

            if(score<min && score>0)
            {
                min = score;
            }
            else if (score > max)
            {
                max = score;
            }
            sum += score;
            counter++;

            System.out.println("Enter a test score. Type -1 to quit.");
            score = keybd.nextInt();

        }

        if (counter > 0)
            sumDouble = sum;
        avg = sumDouble / counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}

