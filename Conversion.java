/* WAP to convert the kilometer into mile by taking the input from the user */
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the kilometer which you ran in the race ");
        float km=sc.nextFloat();
        float miles=km/1.6f;
        System.out.println("The distance you covered in race it is upto in miles are "+miles);
        sc.close();
    }
    
}
