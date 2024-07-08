package AlgorithmTest.factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int inputNum = scanner.nextInt();
        int accNum = 1;

        for(int i = 1; i <= inputNum; i++){
            accNum *= i;

        }
        System.out.println(accNum);

        accNum = 1;
        for (int i = inputNum; i >= 1; i--){
            accNum *= i;
        }
        System.out.println(accNum);

    }
}
