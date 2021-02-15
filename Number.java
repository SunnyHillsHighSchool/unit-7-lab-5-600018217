//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Johnathan Mitri


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{

//private instance variable (must be an Integer)
private int value;
//constructor
public Number()
{
  value = 0;
}

public Number(int a)
{
  value = a;
}

//getter method
public int getValue()
{
  return value;
}

//setter method
public void setValue(int newValue)
{
  value = newValue;
}

//isOdd method
public boolean isOdd()
{
  return (value%2) == 1;
}

//isPerfect method
public boolean isPerfect()
{
  int factorSum = 0;
  for (int i = 1; i < value; i++)
  {
    if (value % i == 0)
    {
      factorSum += i;
    }
  }
  return value == factorSum;
}

//toString
public String toString()
{
  return "" + value;
}

}