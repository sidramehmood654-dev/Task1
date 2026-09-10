import java.util.*;

public class AI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) { System.out.println("Invalid input type."); return; }
        int n = sc.nextInt();
        boolean prime = n >= 2 && java.util.stream.IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n % i == 0);
        System.out.println(prime ? "Prime" : "Not prime");
    }
}