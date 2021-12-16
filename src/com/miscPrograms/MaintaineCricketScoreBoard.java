package com.miscPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MaintaineCricketScoreBoard {

    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int wickets=0,team_total=0;
        int total_Players = 5;
        System.out.println(" Total overs = "  );
        int total_overs = sc.nextInt();
        System.out.println(" Batting order of players:");
        HashMap<String, Integer> players_score = new HashMap<>();String[] order = new String[5];

        for(int i=1;i<=total_Players;i++){
            String input=sc.next();
            players_score.put(input,0);
            order[i-1]=input;
        }
        String batting=order[0],runningEnd=order[1];
                int nextPlayerIndex=2;
        System.out.println("my map="+players_score);
        System.out.println("order array = " + Arrays.toString(order));
        String[] order2 = new String[]{"P1", "P3", "P2", "P5", "P4"};


        // for total no of overs
        for(int j=1;j<=total_overs;j++){

            // for over balls

            System.out.println("Over " + j+" :");
            System.out.println();

            for (int i = 1; i <= 6; i++) {

                String eventHappen = sc.next();
                int current_score=0;

                if(!eventHappen.equals("w"))
                {current_score=Integer.parseInt(eventHappen);team_total+=current_score;
                    players_score.put(batting,players_score.get(batting)+current_score);
                    if (current_score > 0 && current_score % 2 != 0) {
                        String temp=batting;
                        batting=runningEnd;
                        runningEnd=temp;

                    }
                }
                else if(eventHappen.equals("w") && nextPlayerIndex<order.length)
                {batting=order[nextPlayerIndex];
                    nextPlayerIndex++;
                    wickets++;
                    System.out.println(" new batsman after wicket = " + batting);

                }
                else if(eventHappen.equals("w") && nextPlayerIndex>=order.length)
                {
                    wickets++;
                    System.out.println(" All out  ");break;}

                System.out.println();System.out.println("current_score = " + current_score+" and overTotlal = "+team_total);System.out.println("batting=  " + batting+" and runingEnd= "+runningEnd);
            }
            // after over switching batsman
            String temp=batting;
            batting=runningEnd;
            runningEnd=temp;
            System.out.println("Total : " + team_total+"/"+wickets);
            System.out.println("Over : " + j);
            System.out.println("player score after over: "+players_score);
        }

        System.out.println(" Final score = " +team_total+"/"+wickets+"/"+total_overs );

    }

    public static String findNewBatsman(String batting,String runningEnd,String[] order){

        //int a = 0,b=0;
       int a=  Arrays.asList(order).indexOf(batting);
        int b=  Arrays.asList(order).indexOf(batting);

        if(a<b)
            return order[b+1];
        else
            return order[a+1];
    }
}
