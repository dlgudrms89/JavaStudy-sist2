package com.sist;
/*
 *   ����ó�� : ������¸� ���� 
 *     = ���� ó�� : try~catch
 *     = ���� ó�� : throws 
 *     = ���� �߻� : throw 
 *     = ����� ���� : class MyException extends Exception
 *     = �⺻ ���� : ������ �����ϴ� �������α׷� 
 *     ***** ���� ==> �ڹٴ� ��� Ŭ������ ����ó���� ������ �ִ� 
 *           ����� ������ ����ó���� ������ �� �ִ� 
 *           System.in : �ݵ�� ����ó��
 *           System.out : ����ó���� ���� 
 *           
 *      1) check exception : �����Ͻ� ����
 *      2) noncheck exception : ����� ���� 
 *      
 *      �ڹ� 
 *              ������(javac)                 java
 *        ���üҽ� ============> ����Ʈ �ڵ�(.class) ===> ��� 
 *        
 *      ***** ó�� ��� 
 *      try
 *      {
 *         ���� ������ �ҽ� 
 *         1  == ���� ����
 *         2  == ���� �߻�   ===> 2
 *         3  == ���� ����
 *      }catch(����ó�� ���� 1)
 *      {
 *          ���ܴ��� ��ġ
 *      }catch(����ó�� ���� 2)
 *      {
 *          ���ܴ��� ��ġ ==> �ٽ� ���� ������ �����ϰ� ����� 
 *              finally
 *      }catch(����ó�� ���� 3)
 *      {
 *          ���ܴ��� ��ġ
 *      }catch(����ó�� ���� 4)
 *      {
 *          ���ܴ��� ��ġ
 *      }catch(����ó�� ���� 5)
 *      {
 *          ���ܴ��� ��ġ
 *      }
 *      finally
 *      {
 *          ������೪ ���� => ������ �����ϴ� ����  (������ ����)
 *           try  catch
 *           �ؿ� �ִ� ���� ���� 
 *      }
 *      4
 *      5
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1��");// O
        System.out.println("2��");// O
        try
        {
        	int[] a={1,2};
        	System.out.println("3��"); // O
        	System.out.println(a[2]); // X ==> 5
        	System.out.println("4��"); // X
        }
        // �迭 ���� �ʰ�
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("5��");
        	
        }
        // ������ȯ  Integer.parseInt("1 ")
        catch(NumberFormatException e)
        {
        	System.out.println("6��");
        }
        // 0���� ���� ��� 
        catch(ArithmeticException e)
        {
        	System.out.println("7��"); // finally
        }
        // ����� ��� ����
        catch(RuntimeException e)
        {
        	System.out.println("8��");
        }
        finally
        {
        	System.out.println("9�� finally");
        }
        System.out.println("10��"); // ���þ��� ���� 
        
	}

}




