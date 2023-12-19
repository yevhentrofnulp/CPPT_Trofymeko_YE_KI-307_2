package ki307.Trofymenko.Lab4;
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
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=tg(4x)/x  = " + calc.doCalculation(100));
        System.out.println("  y=tg(4x)/x = " + calc.doCalculation(80));
        System.out.println("  y=tg(4x)/x = " + calc.doCalculation(-1000));

        System.out.println("  y=tg(4x)/x = " + calc.doCalculationWithInputInside());
    }
}