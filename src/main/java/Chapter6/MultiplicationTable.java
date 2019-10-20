package Chapter6;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTableLine();

    }

    private void printTableLine (){
        for (int a = 0; a <=12; a++){
            for (int b = 0; b <= 12;b++)
            System.out.println(a + " X " + b + " = " + (a * b));
        }
    }
}
/*Create a program that generates multiplication tables for
the numbers 0 through 12.
Example Output
0 X 0 = 0
0 X 1 = 0
...
12 x 11 = 132
12 x 12 = 144
Constraint
• Use a nested loop to complete this program.

 */