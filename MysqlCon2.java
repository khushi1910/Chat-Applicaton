import java.sql.*; 
import java.util.*;
class MysqlCon2{  
public static void main(String args[]){  
	Scanner sc=new Scanner(System.in);
try{   
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/quiz","root","khushi1910"); 
		if (con != null)              
		    System.out.println("Connected");             
		else            
		    System.out.println("Not Connected");
			
		String name="";
		String pass="";
		System.out.println("Enter username:");
		name=sc.next();
		
		System.out.println("Enter password:");
		pass=sc.next();
		PreparedStatement ps=con.prepareStatement("select * from login where uname=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass); 
		ResultSet res=ps.executeQuery();
		
		while (res.next())
		{
			int count=0;
			System.out.println("Welcome to get quizzical. Type the correct options.");
			System.out.println("1.What is a primitive data type in Java ?\n A. A method to represent values"
					+ "that are so useful that they are an integral part of the language \n B. An easy "
					+ "way to represent numbers \n C.The part of Java that matches the older programming languages \n");
			char ans1=sc.next().charAt(0);
			if(ans1=='a')
			{
				count++;
			}
			
			System.out.println
			char ans2=sc.next().charAt(0);
			if(ans2=='c')
			{
				count++;
			}
				
			System.out.println("3. What is NOT a name of a primitive data type in Java? \n A.int \n B.string \n C.stand-in\n");
			char ans3=sc.next().charAt(0);
			if(ans3=='b')
			{
				count++;
			}
					
			System.out.println("4.Can chardata be stored in the main memory of the computer? \n A.No – computers can "
					+ "only save numbers \n B.Yes – a primitive data type is used to save it \n C.Yes – chardata is stored"
					+ " in a special memory \n");
			char ans4=sc.next().charAt(0);
			if(ans4=='b')
			{
				count++;
			}
					
			System.out.println("5. If an operator like “+” has more meaning depending on the context, is it called? \n A.Overloading \n B.Revise \n C.Overload \n");
			char ans5=sc.next().charAt(0);
			if(ans5=='a')
				{
				count++;	
				}
			
			System.out.println("Your score is: "+count);
		}
		res.close();
		ps.close();
		con.close();  
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
}  
} 
