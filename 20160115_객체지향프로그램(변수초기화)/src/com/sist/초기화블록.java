package com.sist;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
 *   �ʱ�ȭ ��� : ��������� ���� �ʱ�ȭ ���� �ο� 
 *   
 *   �ʱⰪ 
 *     class A
 *     {
 *        int a=10; // ���� ���� �ο� 
 *        // Ŭ���� ������ ����� 
 *        1) �ν��Ͻ� �� 
 *        {
 *        }
 *        2) static ��
 *        static
 *        {
 *        } 
 *        
 *     }
 *     // ���� ==> 1) ���� ó��
 *               2) �ʱ�ȭ ��� 
 *               3) ������ (������ �ʱ�ȭ)
 */
import java.io.*;
public class �ʱ�ȭ��� {
    String[] sawon=new String[5];
    {
    	 // �����ͺ��̽�,��Ʈ��ũ,������
    	 try
    	 {
    		 File file=new File("c:\\image\\sawon.txt");
    		 FileReader fw=new FileReader(file);
    		 int i=0;
    		 char[] buffer=new char[1024];
    		 String str="";
    		 while((i=fw.read(buffer,0,1024))!=-1)
    		 {
    			 str+=new String(buffer);
    			 //System.out.println(str);
    		 }
    		 
    		 StringTokenizer st=
    				 new StringTokenizer(str, "\n");
    		 int a=0;
    		 while(st.hasMoreTokens())
    		 {
    			 //System.out.println(st.nextToken());
    			 sawon[a]=st.nextToken();
    			 a++;
    		 }
    		 
    	 }catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  �ʱ�ȭ��� aa=new �ʱ�ȭ���();
        for(int i=0;i<aa.sawon.length;i++)
        {
        	System.out.println(aa.sawon[i]);
        }
	}

}
