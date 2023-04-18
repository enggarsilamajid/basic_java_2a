import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        if (num >= 5) {
            System.out.println("Excellent!!!");
        }
    }
}
