import java.util.*;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int takeYear = sc.nextInt();
        if (takeYear % 4 == 0) {
            if (takeYear % 100 != 0 || takeYear % 400 == 0 ) {
                System.out.println(" Leaf year ");
            }
            
        }else{
            System.out.println("Not a leaf year");  
        }
    }
}
