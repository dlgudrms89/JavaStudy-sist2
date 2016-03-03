package com.sist;
// 반드시 예외처리를 하는 라이브러리 : IO,Thread,NetWork,Database
// web,bigdata
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class MainClass extends JFrame
implements ActionListener
{
    JButton b1,b2,b3;
    public MainClass()
    {
    	b1=new JButton("메모장");
    	b2=new JButton("계산기");
    	b3=new JButton("그림판");
    	
    	setLayout(new FlowLayout());
    	add(b1);
    	add(b2);
    	add(b3);
    	
    	setSize(450, 300);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try{
			     Runtime.getRuntime().exec("c:\\windows\\system32\\notepad.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				re.printStackTrace();
			}
		}
		if(e.getSource()==b2)
		{
			try{
			     Runtime.getRuntime().exec("c:\\windows\\system32\\calc.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				re.printStackTrace();
			}
		}
		if(e.getSource()==b3)
		{
			try{
			     Runtime.getRuntime().exec("c:\\windows\\system32\\mspaint.exe");
			}catch(IOException re)
			{
				System.out.println(re.getMessage());
				re.printStackTrace();
			}
		}
	}

}





