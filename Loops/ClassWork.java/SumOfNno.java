import java.util.*;
public class SumOfNno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int sum = 0;
    System.out.println("Enter the no. :");
    int takeNum = sc.nextInt();
    while (i <= takeNum) {
        sum = sum + i;
        i++; 
    }
    System.out.println(sum);

    }
}
