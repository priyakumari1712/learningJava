import java.util.*;
public class Checkcase {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int takeNumber = sc.nextInt();
    System.out.println(takeNumber);
    if(takeNumber >= 0){
      System.out.println("print the giver no. is positive");
    }
    else{
      System.out.println("print the giver no. is negative");
    }
  }
}