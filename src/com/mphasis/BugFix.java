package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections;
import java.util.Scanner;

 public class BugFix {
public static void main(String[] args) { 

System.out.println("\n**\n");
System.out.println("\t Welcome to TheDesk \n");
System.out.println("***************************");
optionsSelection();

}
 
 
private static void optionsSelection () { 
String[] arr = {"1. I wish to review my expenditure",

"2. I wish to add my expenditure", "3. I wish to delete my expenditure",
"4. I wish to sort the expenditures", "5. I wish to search for a particular expenditure",
"6. Close the application"
}; 

int[] arr1= {1,2,3,4,5,6};
		
int slen = arr1.length;
for(int i=0; i<slen; i++){

System.out.println(arr[i]);

}

ArrayList<Integer> arrlist = new ArrayList<Integer>();
ArrayList<Integer> expenses = new ArrayList<Integer>();
expenses.add(1000);
expenses.add(2300);
expenses.add(45000); 
expenses.add(32000);
expenses.add(110);
expenses.addAll(arrlist);

System.out.println("\nEnter your choice: \t");
Scanner sc = new Scanner(System.in);

int options = sc.nextInt();
for(int j=1;j<=slen; j++){ 
	if(options==j){


switch (options){

