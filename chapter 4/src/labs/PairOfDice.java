package labs;
public class PairOfDice
{
	private Die die1;
	private Die die2;


  public PairOfDice(int facesDie1, int facesDie2)
  {
	  die1 = new Die(facesDie1);
	  die2 = new Die(facesDie2);
	  roll();
  }


  public void roll()
  {
	  die1.roll();
	  die2.roll();
  }


  public int getDie1FaceValue()
  {
	  return die1.getFaceValue();
  }
  
  public int getDie2FaceValue()
  {
	  return die2.getFaceValue();
  }
  
  public boolean equals(PairOfDice other)
  {
	  boolean result = die1.getFaceValue() == other.getDieFaceValue() && die2.getFaceValue() == other.getDie1FaceValue();
	  return result;
  }

  public String toString()
  {
	  return "Die1: " +die.getFaceValue() + "Die2: " + die2.getFaceValue();
  }


}