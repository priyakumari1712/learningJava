import java.util.*;
public class ChechFever {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double temp = 103.5;
        if(temp > 100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("You dont have a fever");
        }
    }
}
