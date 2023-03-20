import java.util.Scanner;


public class If_Else_Practice {
    public static void main(String[] args){
/*
1.  WAP to find out whether a student is pass or fail ; if it requires total 40% and at least 33% in each subject to pass assume 3 subjects and thake marks as an input
 */
   Scanner sc = new Scanner(System.in);
  
   System.out.println("Enter the marks obtained in Physics");
   float phy=sc.nextFloat();
   System.out.println("Enter the marks obtained in Chemistry");
   float che=sc.nextFloat();
   System.out.println("Enter the marks obtained in Mathematics");
   float maths=sc.nextFloat();

   float avg=(phy+che+maths)/3.0f;
   System.out.println("---------- CBSE BOARD ----------\n");
   if (avg>40 && che>30 && phy>30 && maths>30){
    System.out.println("Congratulations ! you are pass , You got "+avg+ " % in 12th");
   }
   else{
    System.out.println("Sorry ! You are Fail may be your average is less than 40% or you got less marks than 30 in any subject , You got "+avg+ " % in 12th\n");
   }

/*
 2. Calculate income tax paid by an employee to the government as per the slabs mentioned below;
      Income Slab     Tax
      2.5 L - 5.0 L    5%
      5.0 L - 10.0 L   20%
      Above 10.0 L     30%
 */
     System.out.println("Enter your Income (Per Annum)");
     float income=sc.nextFloat();
     float tax = 0;

     if(income<=2.5f){
        tax=tax+0;
     }
     else if (income>2.5f && income<=5.0f){
        tax = tax + (income-2.5f)*0.05f;
     }
     else if (income>5.0f && income<=10.0f)
     {
        tax = tax + 2.5f*0.05f;
        tax = tax + (income - 5.0f)*0.2f;
     }
     else if (income>10.0f){
        tax = tax + 2.5f*0.05f;
        tax = tax + 5.0f*0.2f;
        tax = tax + (income-10.0f)*0.3f;
     }

     System.out.println("You have to pay this tax "+tax);
     System.out.println(" ");

     /*
      3. WAP to find out the day of  the week given the number (1 for the sunday --------)
      */
       System.out.println("Enter the number for the days ( 1-7)");
       int day=sc.nextInt();
       switch(day){
        case 1 ->  System.out.println("Monday");
        case 2 ->  System.out.println("Tuesday");
        case 3->   System.out.println("Wednesday");
        case 4 ->  System.out.println("Thrusday");
        case 5 ->  System.out.println("Friday");
        case 6 ->  System.out.println("Saturday");
        case 7 ->  System.out.println("Sunday");
       }
       System.out.println(" ");
/*\
 4. Write a program in java to find whether the year entered by the user is a leap year or not
 */
     System.out.println("Enter the year");
     int year = sc.nextInt();
     if  ((year%4==0)  && (year%100 !=0 || year%400 ==0)){
        System.out.println(year+" is a Leap Year");
     }
     else {
        System.out.println(year+ " is not a Leap Year");
     }
     System.out.println(" ");

/*
  5. Write a program in java to find out the type of website from the url(Uniform Resoure Locator)
    .com -> Commercial Website
    .in  -> Indian Website 
    .org -> Organization Website
 */
    System.out.println("Enter your Website");
    String website= sc.next();

    if(website.endsWith(".com")){
        System.out.println(website+" is Commercial Website");
    }
    else if (website.endsWith(".in")){
        System.out.println(website+" is a Indian Website");
    }
    else if (website.endsWith(".org")){
        System.out.println(website+" is a Organization Website");
    }

    sc.close();
    }
    
}
