import java.util.*;
public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2){
            System.out.println("prime");
        }else{
            for(int i = 2; i<=n-1; i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }
            
            if(isPrime == true){
                System.out.println( "prime number");
            }else{
                System.out.println("Not a prime number");
            }
        }
    }
}
