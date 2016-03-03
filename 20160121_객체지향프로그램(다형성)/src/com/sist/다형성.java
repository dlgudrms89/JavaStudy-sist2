package com.sist;
/*
 *    1. ������ (�����ε�,�������̵�)
 *       �����ε� (�ߺ��޼ҵ� ����)
 *       �������̵�(�޼ҵ� ������)
 *     ==============================
 *       �����ε�                            �������̵�
 *     ==============================
 *      ���� Ŭ����������                     ���
 *      �޼ҵ�� ����                      �޼ҵ���� ���� 
 *      �Ű������� �ٸ���               �Ű������� ����
 *      �������� �������               �������� ����
 *                       ������������ Ȯ��
 *     ===============================
 *       ������������ ũ�� 
 *       private < default < protected < public 
 *     
 *     1) ĸ��ȭ : ��ɺ� �и� , ������ ����ȭ 
 *              ==> �޼ҵ�� ������ �ϳ��� ��� 
 *     2) ��� : ������ Ŭ������ Ȯ���ؼ� ��� 
 *             �߰�(�����ε�),����(�������̵�) (������)
 *             
 *    2. Ŭ������ ���� 
 *       1) �߻�Ŭ����  : ���������� ����Ǵ� �޼ҵ尡 ������ �� 
 *                   ��ư Ŭ��,���콺 ó��,Ű���� 
 *                   => ���� �ٸ� Ŭ���� �����ؼ� ��� �� �� 
 *                   => ��������� �ַ� ����Ѵ� 
 *          ����)  
 *          public abstract class className
 *          {
 *               ���𸸵� �޼ҵ尡 �Ѱ��̻� (�������� �޼ҵ�)
 *               public abstract ������ �޼ҵ��();
 *               public void display(){}
 *          }
 *       2) ���� Ŭ���� : ������,��Ʈ��ũ,������ 
 *            => �������� ���Ǵ� ������,�޼ҵ尡 �ִ� ��쿡 �ַ� ���
 *            ***** ��� Ŭ����
 *            class A
 *            {
 *              A�� B�� �������� ���� ������ 
 *              class B
 *              {
 *              }
 *            }
 *            ***** �͸��� Ŭ���� : ��Ӿ��� ������(�������̵�)
 *            class A
 *            {
 *               B b=new B()
 *               {
 *                  void display(){}
 *               }
 *            }
 *            class B
 *            {
 *               void display(){}
 *            }
 *            ***** ����Ŭ���� (X)
 *            class A
 *            {
 *               public void display()
 *               {
 *                   class B
 *                   {
 *                   }
 *               }
 *            }
 *        3) ���� Ŭ���� : ����� �� �� ���� Ŭ���� 
 *                    => ������ �Ұ����� Ŭ����
 *                       String , Math,System
 *           public final class className
 *           {
 *           }
 *           
 *        4) �������̽� : �߻�Ŭ������ ���� 
 *              => ���߻���� ���� 
 *              => ��� �޼ҵ尡 �߻�޼ҵ� (����)
 *              => ��� ������ ����� 
 *              => ���õ� Ŭ������ ��� ���� 
 *              => ǥ��ȭ�� �����ϴ� 
 *              ����)
 *              public interface Name
 *              {
 *                 (public static final) int a=20; // ����� 
 *                 (public abstract) void display();
 *              }
 *              
 *              => Ŭ������ �������̽��κ��� ��� => �޼ҵ带 �����ؼ� ��� 
 *              public interface Name
 *              {
 *                  void disp();
 *                  default public void aaa()
 *                  {
 *                  }
 *                  public static void bbb()
 *                  {
 *                  } 
 *              }
 *              
 *              => 
 *              class A implements Name
 *              {
 *                  public void disp(){}
 *              }
 *       
 *       ��� 
 *          interface ==> interface
 *                  extends 
 *          interface ==> class
 *                  implements
 *          class ==> class
 *                  extends 
 *          class ==> interface
 *                 error 
 *                 
 *          interface A
 *          interface B extends A
 *          interface C extends B
 *          class D implements C
 *          class D implements A,B,C
 *                           Mouse,Key,Runnable,Action
 *          ========================================
 *            �߻� Ŭ����                                �������̽� 
 *          ========================================
 *            ���� ���                                 ���� ��� 
 *            ����(O),����(X)       ����(X)
 *                               default,static(1.8)
 *            �������̵�                            �������̵� 
 *            Ŭ������ ��� ���  ===> factory���� 
 *          ========================================
 */
// �߻�Ŭ���� 
abstract class Ani
{
	public abstract void eat();
	public void run()
	{
		System.out.println("�׹߷� �ȴ´�");
	}
	public void display()
	{
		System.out.println("display()");
	}
}
class Human extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
	public void run()
	{
		System.out.println("�ι߷� �ȴ´�");
	}
	
	
}
class Dog extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
	
}
class Pig extends Ani
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
	}
	
}
public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ani an=new Human();
        an.eat();
        an.run();
        
        
        an=new Dog();
        an.eat();
        an.run();
        
        an=new Pig();
        an.eat();
        an.run();
	}

}
