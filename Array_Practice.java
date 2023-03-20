
import java.util.Scanner;





public class Array_Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


         int marks[] = new int[6];
        marks[0] = 92;
        marks[1] = 82;
        marks[2] = 71;
        marks[3] = 78;
        marks[4] = 87;
        marks[5] = 84;
        marks[5] = 33;
        System.out.println(marks[5]);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
             
        }
        System.out.println(" ");      // Interger type array   //
        
        int mark[]={78,54,96,69,37};
        System.out.println(mark.length);
         for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
             
        }
        System.out.println(" ");

        float a[] = {1.0f, 2.0f,3.0f,4.0f,};             // Floating type array   //
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println(" ");


        String s[]= { "Aftab", "Irshad", "Arbaz", "Irfan"};
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
       System.out.println(" ");


       for(int i=s.length-1; i>=0; i--){              // Printing the array in reverse //
        System.out.println(s[i]);
       }
    System.out.println(" ");


       for(int element: marks){
        System.out.println(element);
       }
    System.out.println(" ");

       // Printing the 2-D -Array //
       int [][]students = new int[4][5];
       students [0][0]=100;
       students [0][1]=101;
       students [0][2]=102;
       students [0][3]=103;
       students [0][4]=104;
       students [1][0]=200;
       students [1][1]=201;
       students [1][2]=202;
       students [1][3]=203;
       students [1][4]=204;
       students [2][0]=300;
       students [2][1]=301;
       students [2][2]=302;
       students [2][3]=303;
       students [2][4]=304;
       students [3][0]=400;
       students [3][1]=401;
       students [3][2]=402;
       students [3][3]=403;
       students [3][4]=404;
       

       System.out.println("Printing the 2-D-Array : ");
       System.out.println(" ");
       for(int i=0; i<students.length; i++){
        for(int j=0; j<students[i].length; j++){
            System.out.print(students[i][j]);
            System.out.print(" ");
        }
        System.out.println(" ");
       }
       System.out.println(" ");



        sc.close();
    }
     
    
    
}
