package com.miscPrograms;

public class FindTripletsWithSumGiven {

    // complexity O(n^3)
    public static void main(String[] args){
        int[] A=new int[] {12, 3, 4, 1, 6, 9};  // 24

        for(int i=0;i<A.length-2;i++){
            for(int j=i+1;j<A.length-1;j++)
            {
                for(int k=j+1;k<A.length;k++){
                    //System.out.println("elements pair is i,j,k" + i+","+j+","+k);
                    if(A[i]+A[j]+A[k]==24)
                        System.out.println("pair with sum 24 = " + A[i]+","+A[j]+","+A[k]);
                }
            }
        }

    }

}
