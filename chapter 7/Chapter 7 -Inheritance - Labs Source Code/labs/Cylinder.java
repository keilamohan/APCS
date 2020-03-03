//*****************************************
//  Cylinder.java
//
//  Represents a cylinder.
//*****************************************
public class Cylinder extends Shape
{
    private double radius;  //radius in feet
    private double height;

   //----------------------------------
   //  Constructor: Sets up the cylinder.
   //----------------------------------
   public Cylinder(double r, double h)
   {
       super("Cylinder");
       radius = r;
       height = h;
   }

   //-----------------------------------------
   //  Returns the surface area of the cylinder.
   //-----------------------------------------
   public double area()
   {
       return math.PI*pow(radius, 2)*height;
   }

   //-----------------------------------
   //  Returns the cylinder as a String.
   //----------------------------------- 
   public String toString()
   {
       return super.toString() + " of radius " + radius + " and height " + height;
   }

}