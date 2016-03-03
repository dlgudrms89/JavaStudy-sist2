package com.sist;
/*
 *   ������ ������� Ŭ������ ���(����)
 *   ==========
 *       B  
 *   ==========
 *   1. ���  ==> is-a : ���ϻ��
 *   class A extends B  ==> 
 *   2. ����  ==> has-a
 *   class A
 *   {
 *       B b;==>�͸��� Ŭ����
 *   }
 *   
 *   =======================
 *   ��������� class 
 *   ���̺귯�� ��� ===> ������
 *   
 *   ������ ���� 
 *   1) ���̺귯���� �о�´� 
 *      import javax.swing : ������� ���õ� ��� Ŭ���� 
 *      import java.awt : Layout
 *      import java.awt.event : �̺�Ʈ ó�� 
 *   2) ȭ�� ���� 
 *      = �ʿ��� ������Ʈ�� ����
 *        JButton b1,b2;
 *      = �����ڿ��� ������Ʈ�� �޸� �Ҵ� 
 *        b1=new JButton()
 *        �Ӽ�ó�� 
 *        b1.setEnabled(false)
 *        ��ġ 
 *        ������ ũ�� setSize(w,h)
 *        ������ ������ setVisiable(true)
 *    3) ȣ�� 
 *       new ������()   
 *    4) �̺�Ʈ�� ���� ó�� ==> interface  
 *    =============================
 *    ������ â (Container)
 *      = JFrame : �Ϲ� ������(Ÿ��Ʋ��)
 *      = JWindow : Ÿ��Ʋ�ٰ� ���� ������ (���ӼҰ�,�α���)
 *      = JDialog : Modal , Modaless
 *      = JPanel : �ܵ����� ������ �Ұ��� 
 *                 (Component������ ����� ����)
 *    ��� (Component)
 *      = Button (JButton,JRadioButton,JCheckbox,JMenu)
 *      = TextField (JTextField,JPasswordField)
 *      = TextArea (JTextArea,JTextPane)
 *      = List (JList,JTable,JTree,JComboBox)
 *      = etc : JProgressBar , JSilderBar ,
 *              JScrollPane 
 *        => ������ �и� : JTabbPane,JSilptPane,JInternalFrame
 *    ��ġ
 *      = BorderLayout (5���� ��ġ)
 *      = FlowLayout (1�� �迭)
 *      = GridLayout
 *      = CardLayout
 *    �̺�Ʈ 
 *      = ActionListener : Button,Menu,TextField
 *      = MouseListener : ��� ������Ʈ�� ����
 *      = KeyListener : Ű����� ���� 
 *      = ItemListener : �޺�,��ϼ��� 
 *      
 */
// ���̾ƿ� 
import java.awt.*;
import javax.swing.*;
public class MyWindow extends JFrame{
    JButton b1,b2,b3,b4,b5;// ����Ŭ����
    public MyWindow()
    {
    	b1=new JButton("North",new ImageIcon("c:\\image\\enter.gif"));
    	// ������ => �����ε�  
    	b2=new JButton("East");
    	b2.setToolTipText("�α���");
    	b3=new JButton("West");
    	b3.setEnabled(false);
    	b4=new JButton("Center");
    	b4.setForeground(new Color(223,159,220));
    	b5=new JButton("South");
    	b1.setRolloverIcon(new ImageIcon("c:\\image\\enter2.gif"));
    	// ��ġ
    	/*add("North",b1);
    	add("East",b2);
    	add("West",b3);
    	add("Center",b4);
    	add("South",b5);*/
    	
    	//JPanel p=new JPanel();
    	setLayout(new GridLayout(3, 2,5,30));
    	add(b1);
    	add(b5);
    	add(b4);
    	add(b2);
    	add(b3);
    	
    	//add("South",p);
    	setSize(640,480);
    	setVisible(true);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyWindow m=new MyWindow();
	}

}



