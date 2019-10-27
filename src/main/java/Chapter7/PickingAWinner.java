package Chapter7;

import java.util.*;

public class PickingAWinner {
    private List <String> contestants = new ArrayList<>();
    private String contenstant;

    public static void main(String[] args) {
        PickingAWinner pickingAWinner = new PickingAWinner();
        pickingAWinner.start();
    }

    private void start (){
        addContestantsToList();
        choseWinner();
    }

    private int randomWinner (){
        return new Random().nextInt(contestants.size());
    }

    private String askForContestants () {
        System.out.println("Enter a name:");
        try {return new Scanner(System.in).nextLine();}
        catch (InputMismatchException e){
            System.out.println("You must enter a string");
            return askForContestants();
        }
    }

    private void addContestantsToList (){
        boolean empty = false;
        while (!empty){
            contenstant = askForContestants();
            if (contenstant.isEmpty()){
                empty = true;
            } else {
                contestants.add(contenstant);
            }
        }
    }

    private void choseWinner (){
        if (contestants.size() == 0){
            System.out.println("There are no contestants");
            System.exit(0);
        } else
        System.out.println("The winner is : " + contestants.get(randomWinner()) +".");
    }
}
/*Create a program that picks a winner for a contest or prize
drawing. Prompt for names of contestants until the user
leaves the entry blank. Then randomly select a winner.
Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
• Use a loop to capture user input into an array.
• Use a random number generator to pluck a value from
the array.
• Don’t include a blank entry in the array.
 */