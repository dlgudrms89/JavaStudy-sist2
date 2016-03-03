package com.sist.card;

public class Card {
    int no;
    String type;
    static int height;
    static int width;// 클래스 => 컴파일 (javac)=> JVM 읽기 (java)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Card c1=new Card();
        // c1 ==> no,type
        c1.no=1;
        c1.type="♠";
        Card c2=new Card();
        // c2 ==> no,type
        c2.no=2;
        c2.type="◈";
        Card c3=new Card();
        // c3 ==> no,type
        c3.no=3;
        c3.type="♥";
        Card c4=new Card();
        c4.no=4;
        c4.type="♣";
        
        c1.width=350;
        c1.height=450;
        
        c2.width=360;
        c2.height=460;
        
        c3.width=370;
        c3.height=470;
        
        c4.width=380;
        c4.height=480;
        
        Card.width=390;
        Card.height=490;
        // static => 객체,클래스
        // instance => 객체 
        c2.no=10;
        
        System.out.println("c1.no:"+c1.no);
        System.out.println("c1.type:"+c1.type);
        System.out.println("c1.height:"+c1.height);
        System.out.println("c1.width:"+c1.width);
        
	}

}
