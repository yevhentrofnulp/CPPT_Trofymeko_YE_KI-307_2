package ki307.Trofymenko.Lab5;

import java.io.IOException;
/** 
* Клас реалізації методу обчислення виразу заданого варіантом
* @version 1.0 
*/
public class EquationsApp {
	/**
	* Конструктор за замовченням
	*/
	public EquationsApp() {}
	/**
	* Вхідний метод програми
	* @param args визначення методу main
	*/
    public static void main(String[] args) {
        CalculateTheEquation calc = new CalculateTheEquation();
        try {
            calc.readResultFromBin("src/bin.bin");
            System.out.println("Result of calculation: " + calc.doCalculation());
            calc.writeResultToBin("src/bin.bin");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            calc.readResultFromTxt("src/txt.txt");
            System.out.println("Result of calculation: " + calc.doCalculation());
            calc.writeResultToTxt("src/txt.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}