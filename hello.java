package hello.java;
import java.lang.*;
@SuppressWarnings("unused")
public class hello{
   public void move(){
      System.out.println("动物可以移动");
   }
   public static void run(hello b) {
	   b.move();
   }
}
 
class Dog extends hello{
   public void move(){
      System.out.println("狗可以跑和走");
   }
   public void bark(){
      System.out.println("狗可以吠");
   }

 
   public static void main(String args[]){
    //  hello a = new hello(); // Animal 对象
      hello b = new Dog(); // Dog 对象
    //  Dog d = (Dog)b;
    //  d.move();
    //  a.move();// 执行 Animal 类的方法
      b.move();//执行 Dog 类的方法
      run(new Dog());
    //  b.run();
     // d.bark();
   }
}


