class JKR
{
void add()
{
Integer a = 10;
Integer b = 20;
Integer c = a+b;
System.out.println("The add the value : " +c);
sub();
}
void sub()
{
Integer a = 10;
Integer b = 20;
Integer c = a-b;
System.out.println("The sub the value : " +c);
mul();
}
void mul()
{
Integer a = 10;
Integer b = 20;
Integer c = a*b;
System.out.println("The mul the value : " +c);
div();
}
void div()
{
Integer a = 10;
Integer b = 20;
Integer c = a/b;
System.out.println("The div the value : " +c);
}
public static void main(String[] args)
{
 JKR c=new JKR();
 c.add();
 }
 }