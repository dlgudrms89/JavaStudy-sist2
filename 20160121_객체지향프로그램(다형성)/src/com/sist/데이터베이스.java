package com.sist;
// ���δٸ� Ŭ������ �����ؼ� ����� ���� (interface�� �ַ� �ϴ� ����)
/*
 *      interface A
 *      {
 *         int a=10;   // public static final
 *         void disp(); // public abstract
 *      }
 */
interface Connection
{
	public void getConnection();
	// 1.8���� 
	static void disConnection() // public
	{
		System.out.println("������ ���̽� ����");
	}
	default void increment() // public 
	{
		System.out.println("auto increment");
	}
}
class Oracle implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ ����...");
	}

	@Override
	public void increment() {
		System.out.println("create sequence..");
	}
	
}
class MSSQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MSSQL����...");
	}
	
}
class MySQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL����...");
	}
	
}
class Container 
{
	public Connection getDataBase(String type)
	{
		Connection conn=null;
		if(type.equals("oracle"))
			conn=new Oracle();
		else if(type.equals("mysql"))
			conn=new MySQL();
		else if(type.equals("mssql"))
			conn=new MSSQL();
		return conn;
	}
}
public class �����ͺ��̽� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Container c=new Container();
        Connection conn=c.getDataBase("oracle");
        conn.getConnection();
        conn.increment();
        Connection.disConnection();
        
        conn=c.getDataBase("mysql");
        conn.getConnection();
        conn.increment();
        Connection.disConnection();
        
        conn=c.getDataBase("mssql");
        conn.getConnection();
        conn.increment();
        Connection.disConnection();
	}

}
