import java.util.Scanner;

public class Break_And_Continue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<=7; i++){
            System.out.println(i);
            if(i==6){
                System.out.println("Ending the Loop");
              break;   
            } 
        }
       
       int i=0;
       while(i<=7){
        System.out.println(i);
        
        if(i==6){
            System.out.println("Ending the Loop");
            break;
        }
        i++;

       }

       for(int j=0; j<=5; j++){
        if(j==2){
            System.out.println("Ending the Loop");
            continue;
        }
        System.out.println(j);
        System.out.println("Java is Amazing");
       }


        int k=1;
        do{
            k++;
            if(k==6){
                System.out.println("Ending the Loop");
                continue;
            }
        System.out.println(k);
        System.out.println("Java is going Amazing");
       
        }while(k<=9);



        for(int m=9; m!=0; m--){
            System.out.println(m);
        }
        sc.close();
    }
    
}
