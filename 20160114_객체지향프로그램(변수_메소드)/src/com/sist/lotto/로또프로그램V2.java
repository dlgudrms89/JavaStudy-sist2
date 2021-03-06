package com.sist.lotto;
import javax.swing.*;
public class 로또프로그램V2 {
	int[] lotto=new int[7];
    int[] user=new int[6];
    // 난수 발생 
    void getRand()
    {
    	int su=0;
        boolean bDash=false;
        for(int i=0;i<7;i++)
		{
			bDash=true;
			while(bDash)
			{
				su=(int)(Math.random()*45)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			lotto[i]=su;
			
		}
    }
    void sort(int[] arr)
    {
    	int len=arr.length;
    	int size=0;
    	if(len==7)
    		size=len-1;
    	else
    		size=len;
    	for(int i=0;i<size-1;i++)
        {
        	for(int j=i+1;j<size;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
    }
    void print(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
    }
    // 사용자 입력 
    void userInput()
    {
    	for(int i=0;i<user.length;i++)
        {
        	String strNum=JOptionPane.
        			showInputDialog("1~45까지 정수 입력:");
        	int num=Integer.parseInt(strNum);
        	// 정수형변경 (문자열) 
        	// 각 데이터형 => 기능을 처리 할수 있게 만든 클래스 : Wrapper
        	// int => Integer, byte=>Byte, Double...
        	// => 윈도우,웹(정수를 사용할 수 없다) ==> 정수변경이 가능 
        	if(num<1 || num>45)
        	{
        		JOptionPane.showMessageDialog(null,
        				"잘못된 입력입니다!!");
        		i--;
        		continue;// 증가식
        	}
        	int a=0;
        	for(int j=0;j<i;j++)
        	{
        		if(num==user[j])
        		{
        			a=1;
        			break;
        		}
        	}
        	if(a==0)
        	{
        		user[i]=num;
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,
        				"중복된 수는 사용 할 수 없습니다");
        		i--;
        		continue;
        	}
        }
    }
    // 비교
    int compare()
    {
    	int count=0;
        for(int i=0;i<lotto.length-1;i++)
        {
        	for(int j=0;j<user.length;j++)
        	{
        		if(lotto[i]==user[j])
        		{
        			count++;
        		}
        	}
        }
        return count;
    }
    void rankResult(int count)
    {
    	int b=0;
        String result="";
        if(count==5)
        {
	        for(int i=0;i<user.length;i++)
	        {
	        	if(user[i]==lotto[6])
	        	{
	        		b=1;
	        		result="축하합니다\n2등 당첨입니다!!";
	        	}
	        }
        }
        
        switch(count)
        {
        case 3:
        	result="축하합니다\n5등 당첨입니다!!";
        	break;
        case 4:
        	result="축하합니다\n4등 당첨입니다!!";
        	break;
        case 5:
        	if(b!=1)
        	result="축하합니다\n3등 당첨입니다!!";
        	break;
        case 6:
        	result="축하합니다\n1등 당첨입니다!!";
        	break;
        default:
        	result="낙첨입니다!!";
        }
        JOptionPane.showMessageDialog(null,
        		result);
    }
    // 출력(조립) 
    void process()
    {
    	getRand();
    	sort(lotto);
    	print(lotto);
    	System.out.println();
    	userInput();
    	sort(user);
    	print(user);
    	int count=compare();
    	rankResult(count);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        로또프로그램V2 v=new 로또프로그램V2();
        v.process();
	}

}
