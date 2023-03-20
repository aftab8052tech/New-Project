import java.util.Scanner;

public class Loops {
public static void main(String[] args){
/*
  1. while loop 
 */
System.out.println("Using While Loop");
System.out.println(" ");
int i=1;
while(i<=10){
    System.out.println(i);
    i++;
}
System.out.println(" ");
int j=10;
while(j>0){
    System.out.println(j);
    j--;
}
System.out.println(" ");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
System.out.println(" ");
int n=sc.nextInt();
System.out.println("The Table of "+n+" is : " );
int k = 1;
while(k<=10){
    System.out.println(n+" * "+k+" = "+(n*k));
    k++;
}
System.out.println(" ");

int l = 10;
while(l>=1){
    System.out.println(n+" * "+l+" = "+(n*l));
    l--;
}

/*
  1. For loop 
 */
System.out.println(" ");
System.out.println("Using For Loop");
System.out.println(" ");

System.out.println(" ");
for(int a=1; a<=10; a++){
   System.out.println(a);
}


System.out.println(" ");
for(int a=10; a>0; a--){
   System.out.println(a);
}

System.out.println(" ");
for(int b=1; b<=10; b++){
    System.out.println(n+" * "+b+" = "+(n*b));
}

System.out.println(" ");
for(int b=10; b>0; b--){
    System.out.println(n+" * "+b+" = "+(n*b));
}
System.out.println(" ");
/*
  1. do-while loop 
 */
System.out.println("Using Do-While Loop");
System.out.println(" ");
  int c=1;
  do{
    System.out.println(c);
    c++;
  }while(c<=10);
  System.out.println(" ");
  int d=10;
  do{
    System.out.println(d);
    d--;

  }while(d>0);

  System.out.println(" ");
  int e =1;
 do{

    System.out.println(n+" * "+e+" = "+(n*e));
    e++;
 }while(e<=10);

System.out.println(" ");
int f=10;
do{
    System.out.println(n+" * "+f+" = "+(n*f));
    f--;

}while(f>=1);
/*
 4. Write a program to calculate the Sum of Odd Number 
 */
System.out.println(" ");
System.out.println("Enter the value of Number");
int number=sc.nextInt();
for(int g=0; g<=number; g++)
{
System.out.println(2*number+1);
}





sc.close();
}
    
}
