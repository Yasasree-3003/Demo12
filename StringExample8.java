public class StringExample8
{
public static void main(String args[])
{
String s1=new String("Hello");
String s2=new String(" World");
String s3=new String(" Python");
String s=String.format("%s%s%s",s1,s2,s3);
System.out.println(s.toString());
}
}