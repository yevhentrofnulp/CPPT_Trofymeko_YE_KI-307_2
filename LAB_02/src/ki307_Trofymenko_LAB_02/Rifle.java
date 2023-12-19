package ki307_Trofymenko_LAB_02;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
* Головний клас програми Автомату
*/
public class Rifle {
    /**
     * new MagazineCartridge
     */
    MagazineCartridge magazineCartridge;
    /**
     * new Fuse
     */
    Fuse fuse;
    /**
     * new Trigger
     */
    Trigger trigger;
    /**
     * new PrintWriter
     */
    PrintWriter printWriter;

    /**
     * Constructor
     */
    public Rifle() {
    }

    /**
     * Constructor
     * @param magazineCartridge Ємність магазину 
     * @param trigger Курок
     */
    public Rifle(MagazineCartridge magazineCartridge, Trigger trigger) {
        this.magazineCartridge = magazineCartridge;
        this.trigger = trigger;
    }

    /**
     * Constructor
     * @param magazineCartridge Ємність магазину 
     * @param fuse Запобіжник
     * @param trigger Курок
     */
    public Rifle(MagazineCartridge magazineCartridge, Fuse fuse, Trigger trigger){
        this.magazineCartridge = new MagazineCartridge();
        this.fuse = new Fuse();
        this.trigger = new Trigger();

        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method that firing and returns boolean
     * @return boolean
     */
    public boolean Fire(){
        if(!magazineCartridge.isEmpty() && !fuse.isWorking()) {
            UseStock();
            TakeAim();
            trigger.setOn(true);
            System.out.println("Firing");
            printWriter.println("Firing");
            printWriter.flush();
            magazineCartridge.setCapacity(magazineCartridge.getCapacity() - 1);
            return true;
        }
        return false;
    }

    /**
     * Method of reloading that returns void
     */
    public void Reload(){
        magazineCartridge.setEmpty(false);
        magazineCartridge.setCapacity(30);
        System.out.println("Reloading");
        printWriter.println("Reloading");
        printWriter.flush();
    }

    /**
     * Method that setting fuse true
     */
    public void TurnOnTheFuse(){
        fuse.setWorking(true);
        System.out.println("Putting on the Fuse");
        printWriter.println("Putting on the Fuse");
        printWriter.flush();
    }

    /**
     * Method that setting fuse false
     */
    public void TurnOffTheFuse(){
        fuse.setWorking(false);
        System.out.println("Putting off the Fuse");
        printWriter.println("Putting off the Fuse");
        printWriter.flush();
    }

    /**
     * Method that check Magazine Capacity
     */
    public void CheckMagazineCartridge(){
        magazineCartridge.getCapacity();
        System.out.println("Checking amount of bullets: " + magazineCartridge.getCapacity());
        printWriter.println("Checking amount of bullets: " + magazineCartridge.getCapacity());
        printWriter.flush();
    }

    /**
     * Method that cleaning rifle
     */
    public void CleanRifle(){
        System.out.println("Cleaning rifle");
        printWriter.println("Cleaning rifle");
        printWriter.flush();
    }

    /**
     * Method that taking aim
     */
    public void TakeAim(){
        System.out.println("Taking aim");
        printWriter.println("Taking aim");
        printWriter.flush();
    }

    /**
     * Method that using stock
     */
    public void UseStock(){
        System.out.println("Using stock");
        printWriter.println("Using stock");
        printWriter.flush();
    }

    /**
     * Method that wearing belt
     */
    public void UseBelt(){
        System.out.println("Wearing belt");
        printWriter.println("Wearing belt");
        printWriter.flush();
    }

    /**
     * Method that regulating resistance of trigger
     * @param resistance Опір
     */
    public void RegulateResistanceOfTrigger(int resistance){
        trigger.setResistance(resistance);
        System.out.println("Setting Resistance Of Trigger");
        printWriter.println("Setting Resistance Of Trigger");
        printWriter.flush();
    }

    /**
     * Method to close file
     */
    public void ClosePrintWriter(){
        printWriter.println("Closing file");
        printWriter.flush();
        printWriter.close();
    }
}