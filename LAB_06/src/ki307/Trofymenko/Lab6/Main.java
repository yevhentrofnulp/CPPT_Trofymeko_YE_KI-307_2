package ki307.Trofymenko.Lab6;
/** 
* Основний клас програми
* @version 1.0 
*/
public class Main
{
	/**
	* Конструктор за замовченням
	*/
	public Main() {}
	/**
	* Вхідний метод програми
	* @param args визначення методу main
	*/
    public static void main(String[] args)
    {

        Suitcase<Item, ?, ?> suitcase = new Suitcase<>();

        suitcase.AddItem(new Clothes(29, "Sweeter", "M"));
        suitcase.AddItem(new Clothes(32, "Hoodie", "XL"));
        suitcase.AddItem(new Shoes(65, "Laser"));
        suitcase.AddItem(new Shoes(40, "Textil"));
        suitcase.AddItem(new Clothes(21, "T-Shirt", "L"));
        suitcase.AddItem(new Shoes(15, "Coton"));
        suitcase.AddItem(new Clothes(45, "Hoodie", "L"));

        var min = suitcase.FindMin();
        System.out.print("\nMin element is: ");
        min.PrintInfo();
        String data1 = "Hello";
        Integer data2 = 52;
        suitcase.PrintData(data1, data2);
        
    }
}