//*****************************************
//  Rectangle.java
//
//  Represents a rectangle.
//*****************************************
public class Rectangle extends Shape
{
    private double length;  //length in feet
    private double width;   //width in feet
   //----------------------------------
   //  Constructor: Sets up the rectangle.
   //----------------------------------
   public Rectangle(double l, double w)
   {  
      super("Rectangle");
      length = l;
      width = w;
   }

   //-----------------------------------------
   //  Returns the surface area of the rectangle.
   //-----------------------------------------
   public double area()
   {
       return width*length;
   }

   //-----------------------------------
   //  Returns the rectangle as a String.
   //----------------------------------- 
   public String toString()
   {
       return super.toString() + " of length " + length + " and width " + width;
   }

}