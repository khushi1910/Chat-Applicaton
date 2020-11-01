import java.io.*;
import java.net.*;
import java.util.*;
class Client2
{
public static void main(String[] args) throws Exception
{
Socket sock = new Socket("172.20.10.5", 8888);
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream, true);
InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new BufferedReader(new
InputStreamReader(istream));
System.out.println("Start the chitchat, type and press Enterkey"); 
String receiveMessage, sendMessage; while(true)
{
sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
pwrite.flush();
System.out.println("Welcome to quizzical");
Scanner sc=new Scanner(System.in);

System.out.println("1.What is a primitive data type in Java ?");
System.out.println("A. A method to represent values that are so useful that they are an integral part of the language");
System.out.println("B. An easy way to represent numbers");
System.out.println("C.The part of Java that matches the older programming languages");
String ans1=sc.next();

System.out.println("2. Does every variable in Java need a data type?");
System.out.println("A.No – only numeric variables need a data type");
System.out.println("B.Yes – all variables are of the same datatype");
System.out.println("C.Yes – every variable must be declared with its data type");
String ans2=sc.next();

System.out.println("3. What is NOT a name of a primitive data type in Java?");
System.out.println("A.int ");
System.out.println("B.string");
System.out.println("C.stand-in\n");
String ans3=sc.next();

System.out.println("4.Can chardata be stored in the main memory of the computer?");
System.out.println("A.No – computers can only save numbers");
System.out.println("B.Yes – a primitive data type is used to save it");
System.out.println("C.Yes – chardata is stored in a special memory");
String ans4=sc.next();

System.out.println("5.If an operator like “+” has more meaning depending on the context, is it called?");
System.out.println("A.Overloading");
System.out.println("B.Revise");
System.out.println("C.Overload");
String ans5=sc.next();

pwrite.println("Your score is: 5");

if((receiveMessage = receiveRead.readLine()) != null) 
{
System.out.println(receiveMessage); 
}
pwrite.flush();
}
}
}
