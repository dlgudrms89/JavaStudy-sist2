package com.sist;
/*
 *    접근지정어 
 *      private , protected  , public  , default
 *         ========================================
 *          자신의 클래스  같은 패키지(폴더) 상속받은 클래스  모든 클래스
 *         ========================================
 * private     O         X           X        X
 * protected   O         O           O        X
 * default     O         O           X        X
 * public      O         O           O        O
 * 
 *     ==> 멤버변수 : private (은닉화)
 *         멤버메소드 : public
 *         =============== 캡슐화
 *     ==> 순위
 *         private < default < protected < public
 *         
 *         멤버변수 
 *          형식)
 *              접근지정어 (옵션) 데이터형 변수명
 *                  static|final
 *         메소드
 *          형식) 
 *              접근지정어 (옵션) 리턴형 메소드명(매개변수..)
 *                  static|abstract|final...
 *              {
 *              }
 *         클래스 
 *          형식)
 *              접근지정어 (옵션) class className
 *              {
 *              }
 *         ****** 생성자는 반드시  public을 사용하는 것이 좋다  
 *      
 */
// 캡슐화 
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
