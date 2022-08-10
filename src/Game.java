import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Max random number = ");
        int max = sc.nextInt();
        System.out.println("");

        int randomNumber1 = 0;
        int randomNumber2 = 1;
        int randomNumber3 = 2;
        int Counter = 0;

        while (randomNumber1 != randomNumber2 | randomNumber1 != randomNumber3 | randomNumber2 != randomNumber3){

            randomNumber1 = (int) (Math.random() * (max + 1));
            randomNumber2 = (int) (Math.random() * (max + 1));
            randomNumber3 = (int) (Math.random() * (max + 1));
            Counter += 1;

            System.out.println("| " + randomNumber1 + " - " + randomNumber2 + " - " + randomNumber3 + " |");
        }
        System.out.println("\nCounting = " + Counter);
    }
}
