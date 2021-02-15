//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Johnathan Mitri

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[] arr)
  {
    list = new ArrayList<Number>();
    //for each int in array
    for (int i: arr)
    {
      //create a number instance of that int, and add it to the list
      list.add(new Number(i));
    }
  }

	//write count odds
  public int countOdds()
  {
    //declare and initialize oddCount as 0
    int oddCount = 0;
    //for each integer in the list
    for (Number num: list)
    {
      //create a new number object of the current number
      //if the number is odd
      if (num.isOdd())
      {
	      //increment oddCount
        oddCount++;
      }
    }
    //return oddCount
    return oddCount;
  }


	//write count evens
  public int countEvens ()
  {
    //declare and initialize evenCount as 0
    int evenCount = 0;
    //for each integer in the list
    for (Number num: list)
    {
      //create a new number object of the current number
	    //if the number is even
      if (!num.isOdd())
      {
	      //increment evenCount
        evenCount++;
      }
    }
    //return evenCount
    return evenCount;
  }

	//write count perfects
	public int countPerfects ( )
  {
    //declare and initialize perfectCount as 0
    int perfectCount = 0;
    //for each integer in the list
    for (Number num: list)
    {
      //create a new number object of the current number
	    //if the number is perfect
      if (num.isPerfect())
      {
	      //increment perfectCount
        perfectCount++;
      }
    }
    //return perfectCount
    return perfectCount;
  }


	//write a toString
  public String toString()
  {
    return list.toString();
  }
}