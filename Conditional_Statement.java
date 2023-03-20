import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your age");
        byte age=sc.nextByte();
    if(age>18){
        System.out.println("You can drive");
    }
    else{
        System.out.println("You cannot drive");
    }


   

    boolean a=true;
    boolean b=false;
    if (a&& b){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    if (a || b){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    System.out.println(!a);
    System.out.println(!b);

    // ELSE IF LADDER //
     
    if (age==18){
        System.out.println("You are ready to make Licence");
    }
    else if(age>18 && age<39){
        System.out.println("You can drive");
    }
    else if (age>40 && age<50){
        System.out.println("You are more experienced");
    }
    else{
        System.out.println("You have to learn how to Drive");
    }

     System.out.println("Enter the value of N (1-5)");
     int n=sc.nextInt();
     switch(n){
        case 1: 
        System.out.println("This is one");
        break;
        case 2: 
        System.out.println("This is two");
        break;
        case 3: 
        System.out.println("This is three");
        break;
        case 4: 
        System.out.println("This is four");
        break;
        case 5: 
        System.out.println("This is five");
        break;
        default:
        System.out.println("Actually you Entered the value that is out of Range(1-5)");
     }

     System.out.println("Enter the Nmae of a person which you want to talk");
     String s=sc.next();

     switch(s){
        case "Aftab" -> System.out.println("Hello ! I am Aftab ");
        case "Irshad" ->System.out.println("Hello ! I am Irshad");
        case "Irfan" ->System.out.println("Hello ! I am Irfan");
       // Default : System.out.println(s+" Sir is not here");

     }








    sc.close();

}
      

}