package com.miscPrograms;



public class FindPairWithGivenSum {



    public static void main(String[] args) {

        int[] A=new int[] {1,2,5,6,7};

        int front=0,back=A.length-1;
        int sum=8,pairs=0;
        System.out.println("front - "+front+" back = " + back);

        while(front!=back){
            if(A[front]+A[back]==8)
            {pairs++;
            front++;
            }
            else if(A[front]+A[back]<8)
                front++;
            else if(A[front]+A[back]>8)
                back--;


        }
        System.out.println("pairs = " + pairs);



    }
}
