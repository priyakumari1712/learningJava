import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int sumEven = 0;
        int sumOdd = 0;
        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num%2 == 0){
                sumEven += num;
            }else{
                sumOdd += num;
            }

        }
        System.out.println("Sum of even number : " + sumEven);
        System.out.println("Sum of Odd number : " + sumOdd);
    }
}
