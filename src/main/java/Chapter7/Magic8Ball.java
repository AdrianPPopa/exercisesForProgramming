package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    private List<String> answers = new ArrayList<>();

    public static void main(String[] args) {
    Magic8Ball magic8Ball = new Magic8Ball();
    magic8Ball.start();
    }

    private void start (){
        getQuestion();
        createAnswersList();
        giveAnswerToUser();
    }

    private String getQuestion(){
        System.out.println("What is your question?");
        return new Scanner(System.in).nextLine();
    }

    private void createAnswersList(){
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later");
    }

    private int randomNumberGenerator(){
        return new Random().nextInt(answers.size());
    }

    private void giveAnswerToUser(){
        System.out.println(answers.get(randomNumberGenerator()));
    }


}
/*Create a Magic 8 Ball game that prompts for a question and
then displays either “Yes,” “No,” “Maybe,” or “Ask again
later.”
Example Output
What's your question? Will I be rich and famous?
Ask again later.
Constraint
• The value should be chosen randomly using a pseudo
random number generator. Store the possible choices
in a list and select one at random.*/