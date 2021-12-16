//package com.miscPrograms;
//
//public class AddTwoLinkListNumber {
//}
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//import java.lang.Math;
//class AddTwoLinkListNumber {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int first=0,second=0;
//        int index=100;
//        ListNode finalNode=new ListNode(0);
//        System.out.println("node values="+finalNode.val);
//        int carry=0,temp;
//        while(l1.next!=null){
//            temp=l1.val+l2.val+carry; // 12
//            if(temp%10>0){
//                carry=temp%10; //1
//                finalNode.val=finalNode.val+(temp-10);
//            }
//            else
//                finalNode.val+=temp;
//
//            l1=l1.next;
//            l2=l2.next;
//            finalNode=finalNode.next;
//
//            if(l1.next==null){
//
//            }
//
//
//        }
//        System.out.println("final number are = "+first+","+second);
//        return null;
//    }
//}