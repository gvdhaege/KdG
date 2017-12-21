package exercise14_01;

import exercise14_01.graphics.Circle;
import exercise14_01.graphics.Rectangle;
import exercise14_01.graphics.Shape;
import exercise14_01.graphics.Square;

public class ShapeApp {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[10];
      shapes[0] = new Circle(5);
      shapes[1] = new Square(8);
      shapes[2] = new Rectangle(5,9);
      shapes[3] = new Rectangle(2,3);
      shapes[4] = new Square(8);
      shapes[5] = new Circle(23);
      shapes[6] = new Rectangle(4,9);
      shapes[7] = new Circle(1);
      shapes[8] = new Square(2);
      shapes[9] = new Square(89);
      
      for(int i = 0; i < shapes.length; i++) {
         printShape(shapes[i]);
      }       
   }   
   
   public static void printShape(Shape s){
   	System.out.println(s);   	        
      System.out.print(" Area " + s.getArea());
      System.out.println(" Perimeter " + s.getPerimeter());
      System.out.println("");
   }
}
