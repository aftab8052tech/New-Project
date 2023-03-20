import java.util.Scanner;




public class Array01_Practice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        /*
         1. Create an Array of 5 floats and calculate their sum 
         */

         float aftab[] = {4.5f,5.3f, 9.4f , 9.32f, 78.0f};
         float sum=0;
         for(int i=0; i<aftab.length; i++){
            sum = sum + aftab[i];
            System.out.print(aftab[i] + " ");
         }
         System.out.println(" ");
         System.out.println("The sum of these floating value of this Array is : "+sum);
         System.out.println(" ");
         System.out.println("Using For Each Loop");
         System.out.println(" ");
         for(float e : aftab){
            sum = sum + e;
            System.out.print(e+" ");
         }
         System.out.println(" ");
         System.out.println("The sum of these floating value of this Array is : "+sum);
         System.out.println(" ");

         /*
          2. Write a program ro find out whether a given integer is present in an array or not 
          */
        
        int marks[]={65,45,87,63,54};
        System.out.println("Enter the number that you want to find in the array");
        int n = sc.nextInt();
        boolean isInArray=false;
        for(int i=0; i<marks.length; i++){
            if(n==marks[i]){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The element is present in the Array");
        }
        else{
            System.out.println("The element is not present in the Array");
        }
        System.out.println(" ");
        /*
         3. Calculate the average marks from an array containing mark of al student in physics using for each loop
         */
        int exam[]={97,85,81,83,78,79};
        int summation=0;
        for(int element : exam){
            summation = summation +element;
            System.out.print(element+" ");
        }
        System.out.println(" ");
        System.out.println("The Average marks obtained by Aftab Alam in Physices is "+summation/exam.length);
        System.out.println(" ");
        /*
        4. Create a Program add two matrices of size 4X5 
         */
      
        //  int mat1[][]={{1,2,3} , {5,4,3} };
        //  int mat2[][]={{1,2,3} , {5,4,3} };
        //  int result[][]={{0,0,0} , {0,0,0}};

        //  for(int i=0; i<mat1.length; i++){
        //     for(int j=0; i<mat1[i].length; j++){
        //       //  System.out.printf("Setting the value of i=%d and j=%d\n");
        //         result[i][j]=mat1[i][j] + mat2[i][j];
        //         System.out.println(" ");
        //         System.out.print(result[i][j] +" ");

        //     }
        //  }
        System.out.println(" ");
        int arr[]={1,2,3,4,5,6};
        int l = arr.length;
        int m = Math.floorDiv(l,2);
        int temp;
        System.out.println(" ");
        System.out.println("Reversing the element of an array");
        System.out.println(" ");
        for(int i=0; i<m; i++){
            temp= arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;  
        }
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println("\n");
        System.out.println("Reversing the element of an array by using Decreament Loop");
        System.out.println(" ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println( " ");
        /*
         6. WAP to find the maximum element in the array
         */
        System.out.println( " ");
         int alam[]={100,21,-54,540,587,-600};
        // System.out.println(Integer.MAX_VALUE);
        int max=Integer.MIN_VALUE;

        for(int element : alam){
            if(element>max){
                max=element;
            }
        }
        System.out.println("The Maximum value in the array "+max);

 /*
         6. WAP to find the minimum element in the array
         */
        System.out.println( " ");
         int alam1[]={100,21,-54,540,-587,600};
        // System.out.println(Integer.MAX_VALUE);
        int min=Integer.MIN_VALUE;
        for(int element : alam1){
            if(element<min){
                min=element;
            }
        }
        System.out.println("The Minimum value in the array "+min);

        System.out.println(" ");
        /*
         7. weite a program to find the whether an array is sorted or not
         */
       int man[]= {10,240,540,600,1000,8000,90000};
       boolean isSorted=true;
       for(int i=0; i<man.length-1; i++){
        if(man[i]>man[i+1]){
            isSorted=false;
            break;
        }

       }
       if(isSorted){
        System.out.println("The is Sorted");
       }
       else{
        System.out.println("The array is not Sorted");
       }


        sc.close();
    }
    
}
