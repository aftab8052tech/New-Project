/*
  WAP to calculate percentage of a given student in CBSE board exam. His marks from 5 subject must be taken as input from the keyboard (marks ate out of 100)
 */


import java.util.Scanner;

public class cbse {
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);

        System.out.println("Enter the mark in Mathematics ");
        int math =var.nextInt();
        System.out.println("Enter the mark in Physics ");
        int phy =var.nextInt();
        System.out.println("Enter the mark in Chemistry ");
        int che =var.nextInt();
        System.out.println("Enter the mark in Hindi ");
        int hin =var.nextInt();
        System.out.println("Enter the mark in English ");
        int eng =var.nextInt();
        float avg=(math+phy+che+hin+eng)/500.0f*100;
        System.out.println("The Percentage of Student are : "+avg);
        var.close();

    }
    
}
