package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BaseBallGame extends JFrame
implements ActionListener
{
    JTextArea ta;
    JTextField tf;
    JButton b1,b2;
    int[] com=new int[3];
    int[] user=new int[3];
    int s,b;
    public BaseBallGame()
    {
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	ta.setEditable(false);
    	tf=new JTextField(10);
    	b1=new JButton("Start");
    	b2=new JButton("Exit");
    	tf.setEnabled(false);
    	JPanel p=new JPanel();
    	p.add(tf);
    	p.add(b1);
    	p.add(b2);
    	
    	add("Center",js);
    	add("South",p);
    	setSize(350, 350);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	tf.addActionListener(this);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    // 난수
    public void getRand()
    {
    	int su=0;
    	boolean bDash=false;
    	for(int i=0;i<3;i++)
    	{
    		bDash=true;
    		while(bDash)
    		{
    			su=(int)(Math.random()*9)+1;
    			bDash=false;
    			for(int j=0;j<i;j++)
    			{
    				if(com[j]==su)
    				{
    					bDash=true;
    					break;
    				}
    			}
    		}
    		com[i]=su;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BaseBallGame();
	}
	public void error(String str)
	{
		JOptionPane.showMessageDialog(this,
				str);
		tf.setText("");
		tf.requestFocus();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			JOptionPane.showMessageDialog(this,
					"게임이 시작되었습니다");
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus();
		}
		else if(e.getSource()==b2)
		{
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==tf)
		{
			String strNum=tf.getText().trim();
			int num=0;
			try
			{
				// 정수로 변환
				num=Integer.parseInt(strNum);
			}catch(NumberFormatException ex)
			{
				error("정수만 입력하세요");
				return;
			}
			//비교 
			if(num<100 || num>999)
			{
				error("세자리 정수만 가능합니다");
				return;
			}
			user[0]=num/100;
			user[1]=(num%100)/10;
			user[2]=num%10;
			if(user[0]==user[1] || user[1]==user[2]
					|| user[0]==user[2])
			{
				error("중복된수는 사용할 수 없다");
				return;
			}
			
			s=0;
			b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트 
			String result="Input Number:"+num
					 +",Result:"+s+"S-"+b+"B\n";
			ta.append(result);
			
			if(s==3)
			{
				JOptionPane.showMessageDialog(this,
						"Game Over!!");
				//System.exit(0);
				tf.setEnabled(false);
				b1.setEnabled(true);
				ta.setText("");
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}

}



