package codin;

import java.util.Scanner;

public class Main {

   public static void main(String args[]){

       int i,m=0,check=0;

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number :");

       int n=sc.nextInt();

       m=n/2;
       if(n==0||n==1){
           System.out.println(n+" is not prime number");
       }else{
           for(i=2;i<=m;i++){
               if(n%i==0){
                   System.out.println(n+" is not prime number");
                   check=1;
                   break;
               }
           }
           if(check==0)  { System.out.println(n+" is prime number"); }
       }

      }
    }