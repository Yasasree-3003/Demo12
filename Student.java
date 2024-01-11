class Student
{
private int id;
private String name;
}
class Test
{
public static void main(String args[])
{
Student s=new Student();
System.out.println(s.id+" "+s.name);
s.id=3003;
s.name="Yasasree";
System.out.println(s.id+" "+s.name);
}
}
