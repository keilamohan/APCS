// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
    
    Labrador labrador = new Labrador("Spot", "black");
    System.out.println(labrador.getName() + " says " + labrador.speak());

    Yorkshire yorky = new Yorkshire("Tyler");
    System.out.println(yorky.getName() + " says " + yorky.speak());

    System.out.println(labrador.avgBreedWeight() + " is the average weight.");
    System.out.println(yorky.avgBreedWeight() + " is the average weight.");

    }
}