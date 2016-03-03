package com.sist;
/*
 *    ����ó�� (�����ϴ� ���α׷�) 
 *     = ������ ���� (�����Ͻÿ� ����ó�� Ȯ��:�ݵ�� ����ó���� �ؾߵȴ�)
 *          IO , Thread , Network , Database , Web
 *     = ����� ���� (����ó�� ������ �� �ִ�)
 *     
 *     ���� : ���ܰ� �߻������� ������ ���Ḧ �����ϰ� ���� ������¸� �����ϴ� ����
 *     Error(����) => �ҽ��� �Է»󿡼� ������ �Ұ����� ����
 *     Exception(����)=> ������ ������ ����(������ ����)
 *        �Է� => ������ (����� 0�� �Է�)
 *        ��Ʈ��ũ => �����ּҰ� Ʋ����� 
 *        ���� => ��θ��� Ʋ���� 
 *        �迭 => ���� �ʰ� 
 *          int[] arr=new int[2];
 *          arr[2]=10;
 *     ===============================================
 *              ��ӵ� 
 *             
 *             Object
 *                |
 *            Throwable
 *                |
 *         =================
 *         |               |
 *       Error          Exception
 *                         |
 *                   ================
 *                   |              |
 *               ������ ����                     ����� ����
 *             IOException          RuntimeException
 *         InterruptedException           |
 *             SQLException           NumberFormatException
 *                                    Integer.parseInt("1");
 *        MalformedURLException      ArrayIndexOutOfBoundsException
 *                                   ArithmeticException (0���� ������)
 *                                   NullPointerException
 *                                   ClassCastException
 *        ClassNotFoundException
 *          Class.forName("")
 *          
 *         ==> try
 *             {
 *             }catch(RuntimeException){}
 *              catch(NumberFormatException){}
 *              catch(ArrayIndexOutOfBoundsException){}
 *              catch(NullPointerException){}
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
