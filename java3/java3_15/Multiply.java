package java3.java3_15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
          try {
          System.out.print("곱하고자 하는 두 수 입력 >> ");
          int n = scanner.nextInt();
          int m = scanner.nextInt();
          System.out.print(n+ "x" + m + "=" + n*m); 
          break;
        } catch (InputMismatchException e) {
          System.out.println("실수를 입력하면 안 됩니다.");
          scanner.nextLine();
        }
        }
        scanner.close();
    }
}
