package com.sist;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JFrame
{
    JTable table;
    DefaultTableModel model;
    public WaitRoom()
    {
    	String[] col={"이름","성별","전화"};
    	Object[][] row=new Object[0][3];
    	model=new DefaultTableModel(row, col)
    	{

    		
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class getColumnClass(int c) {
				// TODO Auto-generated method stub
				return getValueAt(0, c).getClass();
			}
    		
    	};
    	table=new JTable(model);
    	table.setRowHeight(35);
    	// M(model)V(view)
    	JScrollPane js=new JScrollPane(table);
    	
    	add("Center",js);
    	setSize(640, 480);
    	setVisible(true);
    	
    	Object[] data={"홍길동",new ImageIcon("c:\\image\\man1.gif"),new Boolean(true)};
    	model.addRow(data);
    	Object[] data1={"심청이",new ImageIcon("c:\\image\\woman1.gif"),new Boolean(false)};
        model.addRow(data1);
        addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
        	
		});
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new WaitRoom();
	}
	
}
