/*
 *   ������� (Ŭ���� ����ñ��� ����� ����)
 *     = static : Ŭ�������� (Ŭ�������� ���ؼ� ����� ����)
 *                => ���� Ŭ���� ��ü�� �������� ���Ǵ� ����
 *                => ���� �ӽ��� 
 *                   Ŭ�����δ��� ���ؼ� �ε�Ǿ��� �޸� �Ҵ�
 *                   �޼ҵ念���� ����
 *       class A
 *       {
 *          static int age;
 *       }
 *       A a=new A(); // age
 *       A a1=new A(); // age
 *     = instance : ��ü���� (��ü�� �����ϰ� ����� ����)
 *       heap����
 */
import javax.swing.*;
public class ������� {
    String name="��û��";// null
    String tel;
    String addr;
    void setAaa()
    {
    	String nam="ȫ�浿";
    	System.out.println(name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  ������� a=new �������();// name������ ���� 
        a.name=JOptionPane.showInputDialog("�̸� �Է�");
        a.tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է�:");
        a.addr=JOptionPane.showInputDialog("�ּ� �Է�:");
        String result="�̸�:"+a.name+"\n"
        		     +"��ȭ:"+a.tel+"\n"
        		     +"�ּ�:"+a.addr;
        
        JOptionPane.showMessageDialog(null, result);
        
	}

}



