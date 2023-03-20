import java.util.*;

public class Information{
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);
        String name,add,department,sec;
        int roll_no;
        long phone_no;
        System.out.println("Enter your name ");
        name=var.nextLine();
        System.out.println("Enter your Address ");
        add=var.nextLine();
        System.out.println("Which Department you belong ");
        department=var.nextLine();
        System.out.println("Enter your Section ");
        sec=var.nextLine();
        System.out.println("Enter your University Roll No ");
        roll_no=var.nextInt();
        System.out.println("Enter your Mobile Number ");
        phone_no=var.nextLong();
        System.out.println("       THE DATA OF THE STUDENT IS      \n");
        System.out.println("Name of the Student is :"+name);
        System.out.println("Address of Student is :"+add);
        System.out.println("The Department of the Student is :"+department);
        System.out.println("Section of the Student is :"+sec);
        System.out.println("Student's Roll no :"+roll_no);
        System.out.println("Contact Number of Student is :"+phone_no);
        var.close();
    }
}
