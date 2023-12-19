package ki307.Trofymenko.Lab6;

public class Shoes  implements Item
{

    private double volume;
    private String material;

    public Shoes(double volume, String material)
    {
        this.volume = volume;
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double getVolume()
    {
        return volume;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Shoes: volume - " + volume + "; material - " + material + ";");
    }
}