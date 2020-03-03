public abstract class Shape
{
    public String shapeName;

    public Shape(String name)
    {
        shapeName = name;
    }

    public abstract double area();

    public String toString()
    {
        return shapeName;
    }
}