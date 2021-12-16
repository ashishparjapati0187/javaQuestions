package com.miscPrograms;

import java.util.Arrays;

public class FillArrayWithOtherValueProduct {

    // input array and we want to replace each element with product of all other elements

    public static void main(String[] args){

        int[] A=new int[] {1,2,3};

        int product=1;
        for(int i=0;i<A.length;i++){
            product*=A[i];
        }
        for(int i=0;i<A.length;i++){
            A[i]=product/A[i];
        }
        System.out.println("array final = = " + Arrays.toString(A));

    }

}
