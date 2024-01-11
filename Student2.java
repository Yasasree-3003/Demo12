class Person
{
protected String fname="john";
protected String iname="Doe";
protected int age=24;
}
class Student2 extends Person
{
private int graduationYear=2018;
public static void main(String args[])
{
Student2 myObj=new Student2();
System.out.println("Name:"+myObj.fname+" "+myObj.iname);
System.out.println("Age:"+myObj.age);
System.out.println("Graduation Year:"+myObj.graduationYear);
}
}

