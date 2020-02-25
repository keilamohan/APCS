package labs;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{

		ExpressionSolver express = new ExpressionSolver("3 + 5");
        express.solveExpression();
        System.out.println(express.toString());

        express.setExpression("3 * 5");
		express.solveExpression();
        System.out.println(express.toString());
        
		express.setExpression("3 - 5");
		express.solveExpression();
        System.out.println(express.toString());
        
		express.setExpression("3 / 5");
		express.solveExpression();
        System.out.println(express.toString());
        
		express.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		express.solveExpression();
        System.out.println(express.toString());
        
		express.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		express.solveExpression();
        System.out.println(express.toString());
        
	}
}