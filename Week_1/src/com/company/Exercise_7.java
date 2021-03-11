package com.company;

import java.util.Scanner;

public class Exercise_7 {
    public Exercise_7(){
        int x, y, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("X= ");
        x = sc . nextInt ();
        System.out.print("Y= ");
        y = sc . nextInt ();

        m = x*y;
        while(x!=y){
            if(x>y) x = x-y;
            else y = y - x;
        }
        System.out.println("USG: "+x);
        System.out.println("USJ: "+m/x);
    }
}
