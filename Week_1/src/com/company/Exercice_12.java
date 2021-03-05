package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Exercice_12 {
    public Exercice_12(){
        int m[] = new int[8];
        Random random = new Random();
        for(int i=0;i<m.length;i++){
            m[i]=random.nextInt(20);
        }
        Arrays.sort(m);
        Collections.reverse(Arrays.asList(m));
        System.out.println(Arrays.toString(m));
    }
}
