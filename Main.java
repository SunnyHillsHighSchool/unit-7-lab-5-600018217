//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Johnathan Mitri

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test);
		out.println("odd count = " + test.countOdds());
		out.println("even count = " + test.countEvens());
		out.println("perfect count = " + test.countPerfects()+"\n\n\n");

    int[] s = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11};
    NumberAnalyzer test2 = new NumberAnalyzer( s );
		out.println(test2);
		out.println("odd count = " + test2.countOdds());
		out.println("even count = " + test2.countEvens());
		out.println("perfect count = " + test2.countPerfects()+"\n\n\n");


		//add more test cases			
	}
}