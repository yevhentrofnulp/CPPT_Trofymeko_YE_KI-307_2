/**
 * Програма, що реалізує у вигляді класу предметну область автомату.
 */
package ki307_Trofymenko_LAB_02;

/** 
* Клас для створення предметної області автомату...
* @version 1.0 
*/
public class KI307_Trofymenko_LAB_02{
/**
* Конструктор за замовченням
*/
public KI307_Trofymenko_LAB_02() {
}
/**
* Вхідний метод програми
* @param args визначення методу main
*/	
    public static void main(String[] args) {
        Rifle rifle = new Rifle (new MagazineCartridge(),new Fuse(),new Trigger());
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