package com.sist;
/*
 *    ���������� 
 *      private , protected  , public  , default
 *         ========================================
 *          �ڽ��� Ŭ����  ���� ��Ű��(����) ��ӹ��� Ŭ����  ��� Ŭ����
 *         ========================================
 * private     O         X           X        X
 * protected   O         O           O        X
 * default     O         O           X        X
 * public      O         O           O        O
 * 
 *     ==> ������� : private (����ȭ)
 *         ����޼ҵ� : public
 *         =============== ĸ��ȭ
 *     ==> ����
 *         private < default < protected < public
 *         
 *         ������� 
 *          ����)
 *              ���������� (�ɼ�) �������� ������
 *                  static|final
 *         �޼ҵ�
 *          ����) 
 *              ���������� (�ɼ�) ������ �޼ҵ��(�Ű�����..)
 *                  static|abstract|final...
 *              {
 *              }
 *         Ŭ���� 
 *          ����)
 *              ���������� (�ɼ�) class className
 *              {
 *              }
 *         ****** �����ڴ� �ݵ��  public�� ����ϴ� ���� ����  
 *      
 */
// ĸ��ȭ 
class Saram
{
	private String name;
	private String jumin;
	private int age;
	double ki;
	protected String tel;
	public String addr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Saram s=new Saram();
        //s.getName();
	}

}
