/**
 * Програма, що реалізує у вигляді класу предметну область автомату.
 */
package ki307.Trofymenko.Lab3;
/** 
* Клас для створення предметної області автомату...
* @version 1.0 
*/
public class Lab03_Class{
	/**
	* Конструктор за замовченням
	*/
	public Lab03_Class() {}
	/**
	* Вхідний метод програми
	* @param args визначення методу main
	*/

    public static void main(String[] args) {
        AssaultRifle rifle = new AssaultRifle(new MagazineCartridge(),new Fuse(),new Trigger());
        rifle.Fire();
        rifle.Reload();
        rifle.TurnOnTheFuse();
        rifle.Fire();
        rifle.TurnOffTheFuse();
        rifle.Fire();
        rifle.Fire();
        rifle.Fire();
        rifle.Fire();
        rifle.CheckMagazineCartridge();
        rifle.ClosePrintWriter();
    }
}