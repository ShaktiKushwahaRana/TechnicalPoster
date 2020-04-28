import java.io.Console;
class reading{
public static void main(String [] arg){
  Console c =System.console();
System.out.println("enter the username");
String s=c.readLine();
System.out.println(s);
System.out.println("enter password");
char[] pass=c.readPassword();
System.out.println(pass);}}
OUTPUT:
C:\Users\HP\Desktop>java reading
enter the username
shakti
shakti
enter password

shakti

C:\Users\HP\Desktop>
