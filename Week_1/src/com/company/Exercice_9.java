package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Exercice_9 {
    public Exercice_9(){
        //double m[]=new double[8];
        double m[]={1.3,0.5,8,0,-8.7,1.2,1.3,1.4};
        for(int i=0;i<m.length;i++){
            System.out.println((i+1)+" - "+m[i]);
        }
        System.out.println(Arrays.toString(m));
    }
}
