package labs;
import java.util.Scanner;

public class GradingQuizzes
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many questions are in the quiz?");
        int questions = scan.nextInt();
        int score = questions;


        int key[] = new int[questions];
        for (int i=0; i < questions; i++)
        {
            System.out.println("Enter in the correct key for question " + (i+1) + ": ");
            key[i] = scan.nextInt();
        }

        String again = "y";

        while (again.equalsIgnoreCase("y"))
        {
            for (int i=0; i < questions; i++)
            {
                System.out.println("Enter in the answer for question " + (i+1) + ": ");
                int[] answer = new int[questions];
                answer[i] = scan.nextInt();
                if (answer[i] == key[i])
                {
                    
                }
                else
                {
                    score--;
                }

                
            };

            System.out.println("The number correct is " + score + " out of " + questions);
            System.out.println("The percent correct is " + (int) 100*((double) score/ (double) questions) + "%");

        System.out.println("Continue? (y/n)");
        again = scan.nextLine();
        again = scan.nextLine();

        //scanner isn't working so I had to add another line for the while loop
        }

        scan.close();

    }
}
