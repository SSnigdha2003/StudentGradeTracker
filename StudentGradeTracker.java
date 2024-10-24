package com.student;
import java.util.Scanner;
public class StudentGradeTracker {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        
        System.out.println("*********Welcome to Student Grade Tracker*********");
        System.out.println("**************************************************");
        System.out.println("enter the number of grades:");
        int grades=s.nextInt();
        int[] arr=new int[grades];
        
        int grade=1;
        for(int i=0;i<grades;i++){
            System.out.println("enter the grade marks:"+grade);
            arr[i]=s.nextInt();
            grade++;
        }
        
        int total=0;
        for(int i=0;i<grades;i++){
            total=arr[i]+total;
        }
        
        double avg=(double)total/grades;
        System.out.println("your average og grades= "+avg);
        
        int max=0;
        for(int i=0;i<grades;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the maximum of grades:"+max);
        
        int min=arr[0];
        for(int i=1;i<grades;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the minimum of grades:"+min);
	}

}
