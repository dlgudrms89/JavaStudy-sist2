package com.sist;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 *   event (interface)
 *     ActionListener 
 *       actionPerformed : Button,Menu,TextField
 *     MouseListener
 *       mouseClicked
 *       mousePressed
 *       mouseReleaed
 *       mouseEntered
 *       mouseExited
 *     MouseMotionListener
 *       mouseMoved
 *       mouseDragged
 *     KeyListener
 *       keyPressed
 *       keyReleased
 *       keyTyped
 *     ItemListener
 *       itemStateChanged
 */
public class �ƹ�Ÿ����  extends JFrame 
implements ActionListener,ItemListener
{

	JLabel la;
	JComboBox box;
	JLabel av1,av2,av3;
	JRadioButton rb1,rb2,rb3;
	���õȾƹ�Ÿ s=new ���õȾƹ�Ÿ();
	int sel=0;
	public �ƹ�Ÿ����()
	{
		la=new JLabel("����");
		box=new JComboBox();
		box.addItem("����");
		box.addItem("����");
		av1=new JLabel(new ImageIcon("c:\\image\\m1.gif"));
		av2=new JLabel(new ImageIcon("c:\\image\\m2.gif"));
		av3=new JLabel(new ImageIcon("c:\\image\\m3.gif"));
		
		rb1=new JRadioButton("");
		rb2=new JRadioButton("");
		rb3=new JRadioButton("");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		rb1.setSelected(true);
		// ��ġ
		setLayout(null);
		la.setBounds(10, 15, 40, 30);
		box.setBounds(55, 15, 100, 30);
		
		av1.setBounds(10, 50, 100, 140);
		av2.setBounds(115, 50, 100, 140);
		av3.setBounds(220, 50, 100, 140);
		
		rb1.setBounds(45, 200, 30, 30);
		rb2.setBounds(150, 200, 30, 30);
		rb3.setBounds(255, 200, 30, 30);
		//�߰� 
		add(la); add(box);
		add(av1);add(av2);add(av3);
		add(rb1);add(rb2);add(rb3);
		setSize(345, 275);
		setVisible(true);
		box.addItemListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        �ƹ�Ÿ���� a=new �ƹ�Ÿ����();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			int index=box.getSelectedIndex();
			char c='m';
			if(index==0)
			{
				c='m';
				sel=0;
			}
			else
			{
				c='w';
				sel=1;
			}
			
			av1.setIcon(new ImageIcon("c:\\image\\"+c+"1.gif"));
			av2.setIcon(new ImageIcon("c:\\image\\"+c+"2.gif"));
			av3.setIcon(new ImageIcon("c:\\image\\"+c+"3.gif"));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int selNum=0;
		if(e.getSource()==rb1)
		{
			selNum=1;
		}
		else if(e.getSource()==rb2)
		{
			selNum=2;
		}
		else if(e.getSource()==rb3)
		{
			selNum=3;
		}
		s.set(sel, selNum);
		for(int i=0;i<120;i++)
		{
		 s.setBounds(345,0, i, 170);
		 
		 try
		 {
			 Thread.sleep(100);
		 }catch(Exception e1){}
		 s.setVisible(true);
		}
	}

}
