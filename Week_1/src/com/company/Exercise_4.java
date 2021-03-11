package com.company;
import  java.util.Scanner ;
public class Exercise_4 {
    public Exercise_4(){
        int x, c,  count=0;
        Scanner sc = new Scanner(System.in);
        System . out . print ( " Three-digit integer: " );
        x = sc . nextInt ();
        c = x;

        while(c!=0){
            c = c/10;
            ++count;
        }
        if(count == 3){
            while(x!=0){
                System.out.println(x%10);
                x = x/10;
            }
        }
        else{
            System.out.println("Please enter 3 digit number.");
        }
    }
}
