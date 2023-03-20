import java.util.Scanner;


public class Loops_Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // /*
        //  1. Write a program to print he following pattern 
        //      * * * * 
        //      * * *
        //      * *
        //      * 
        //  */
        // // int n=4;
        // // int i=1;
        // // while(i<=n){
        // //     int j=1;
        // //     while(j<=(n-i+1)){
        // //         System.out.print(" * ");
        // //         j++;
        // //     }
        // //     System.out.println(" ");
        // //     i++;
        // // }
        // // System.out.println(" ");
        // // for(int i=4; i>0; i--){
        // //     for(int j=0; j<i; j++){
        // //         System.out.print(" * ");
        // //     }
        // //     System.out.println("\n");
        // // }

        // System.out.println("Enter the number of the Sum of Even Number");
        // int m=sc.nextInt();
        // int sum=0;
        // for(int l=0; l<m; l++){
        //     sum=sum+(2*l);
        // }
        // System.out.println("The Sum of Even Number is :" +sum);

        /*
         3. Write a program to find factorial of a given number using for loop.
         */
        // int n=5;
        // int fact=1;
        // for(int o=1; o<=n; o++){
        //     fact=(fact*o);
        // }
        // System.out.println("The Factorial of the number is : "+ fact);
        // int n=4; 
        // int fact=1;
        // int i =1;
        // while(i<=n){
        //     fact=(fact*i);
        //     i++;
        // }
        // System.out.println("The factorial of the number is : "+fact);
        // do{
        //     fact=(fact*i);
        //     i++;

        // }while(i<=n);
        //   System.out.println("The factorial of the number is : "+fact);

        /*
         6. Write a program to calculate the sum of the number occuring in the multiplication table of 8
         */
        // int n=8;
        // int sum=0;
        // for(int i=1; i<=10; i++){
        //     sum = sum + (n*i);
        // }
        // System.out.println("The summation of table of 8 is : " +sum);

        /* 7. Write a program to print the sum of the odd number */
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int sum=0;    // 1,3,5,7,9,11
        for(int i=0; i<=n; i++){
            sum = sum + (2*i+1);
        }
        System.out.println("The summation of odd number is : "+sum);
        sc.close();
    }
    
}
