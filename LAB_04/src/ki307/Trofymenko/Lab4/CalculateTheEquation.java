package ki307.Trofymenko.Lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheEquation implements CalculateTheEquationInterface {
    @Override
    public double doCalculation(double variable) {
        try {
            return Math.tan(4*variable)/variable;


        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
        }
        return 0;
    }

    @Override
    public double doCalculationWithInputInside() {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();
            return Math.tan(4*value) / (value);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Exception: illegal value.");
       
        }
        return 0;
    }
}