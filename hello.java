package hello.java;
import java.lang.*;
@SuppressWarnings("unused")
public class hello{
   public void move(){
      System.out.println("��������ƶ�");
   }
   public static void run(hello b) {
	   b.move();
   }
}
 
class Dog extends hello{
   public void move(){
      System.out.println("�������ܺ���");
   }
   public void bark(){
      System.out.println("�����Է�");
   }

 
   public static void main(String args[]){
    //  hello a = new hello(); // Animal ����
      hello b = new Dog(); // Dog ����
    //  Dog d = (Dog)b;
    //  d.move();
    //  a.move();// ִ�� Animal ��ķ���
      b.move();//ִ�� Dog ��ķ���
      run(new Dog());
    //  b.run();
     // d.bark();
   }
}


