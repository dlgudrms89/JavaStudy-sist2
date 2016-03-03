package com.sist;
/*
 *    한개의 파일안에 클래스 2개 이상 
 *    1) public ~ class는 반드시 1개만 존재
 *    2) public ~ class 저장명이 된다 
 */
import java.util.Scanner;
/*
 *   클래스의 용도 2개 
 *   1) 데이터  ( 데이터관리 클래스 ) : ~DTO
 *   2) 기능     ( 액션 클래스 ) : ~DAO
 *   3) 데이터  + 기능 
 */
// 사용자 정의 데이터형 
class Student
{
	int hakbun;
	String name;
	int kor;
	int eng;
	int math;
	int rank;
	int total;
	double avg;
	char hak;
}

public class 메소드 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] std=new Student[3];
        // int[] a=new int[3] => a[0~2] = 0
        // 클래스[] a=new 클래스[3] => a[0~2] = null
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	std[i]=new Student();
        	std[i].hakbun=i+1;
        	System.out.print("이름:");
        	std[i].name=scan.next();
        	System.out.print("국어점수:");
        	std[i].kor=scan.nextInt();
        	System.out.print("영어점수:");
        	std[i].eng=scan.nextInt();
        	System.out.print("수학점수:");
        	std[i].math=scan.nextInt();
        	std[i].total=std[i].kor+std[i].eng+std[i].math;
        	std[i].avg=std[i].total/3.0;
        	// ~DTO , ~VO
        }
        for(int i=0;i<3;i++)
        {
        	System.out.println("이름:"+std[i].name);
        	System.out.println("국어:"+std[i].kor);
        	System.out.println("영어:"+std[i].eng);
        	System.out.println("수학:"+std[i].math);
        	System.out.println("총점:"+std[i].total);
        	System.out.println("평균:"+std[i].avg);
        	System.out.println("================");
        }
	}

}




