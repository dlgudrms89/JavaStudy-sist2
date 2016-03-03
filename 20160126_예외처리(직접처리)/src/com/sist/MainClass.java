package com.sist;
/*
 *    예외처리 (예방하는 프로그램) 
 *     = 컴파일 예외 (컴파일시에 예외처리 확인:반드시 예외처리를 해야된다)
 *          IO , Thread , Network , Database , Web
 *     = 실행시 예외 (예외처리 생략할 수 있다)
 *     
 *     목적 : 예외가 발생했을때 비정상 종료를 방지하고 정상 수행상태를 유지하는 목적
 *     Error(에러) => 소스나 입력상에서 수정이 불가능한 에러
 *     Exception(예외)=> 수정이 가능한 에러(가벼운 에러)
 *        입력 => 나누기 (사용자 0을 입력)
 *        네트워크 => 서버주소가 틀릴경우 
 *        파일 => 경로명이 틀리다 
 *        배열 => 범위 초과 
 *          int[] arr=new int[2];
 *          arr[2]=10;
 *     ===============================================
 *              상속도 
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
 *               컴파일 예외                     실행시 예외
 *             IOException          RuntimeException
 *         InterruptedException           |
 *             SQLException           NumberFormatException
 *                                    Integer.parseInt("1");
 *        MalformedURLException      ArrayIndexOutOfBoundsException
 *                                   ArithmeticException (0으로 나눌때)
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
