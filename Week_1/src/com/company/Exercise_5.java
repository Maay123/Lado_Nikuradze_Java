package com.company;

import java.util.Scanner;

public class Exercise_5 {
    public Exercise_5(){
        System.out.println("Exercise_5");
        int x ,c,s=0,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("X=");
        x=scanner.nextInt();
        c=x;

        while(c!=0){
            c=c/10;
            ++count;
        }

        if (count == 4) {
            while(x!=0){
                s+=x%10;
                x=x/10;
            }
            System.out.println("SUM="+s);
        }
    }
}
