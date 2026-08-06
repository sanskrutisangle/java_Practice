package encapsulation;
class laptopInfo{
	private String brand;
    private double price;
    private int ram;
    
    public laptopInfo(String brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }
 // Setter (Only for RAM)
    public void setRam(int ram) {
        this.ram = ram;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
    
}
public class Laptop {
	public static void main(String[] args) {
	laptopInfo laptop= new laptopInfo("Dell", 65000, 8);
	laptop.setRam(16);

    System.out.println("Brand : " + laptop.getBrand());
    System.out.println("Price : " + laptop.getPrice());
    System.out.println("RAM   : " + laptop.getRam() + " GB");
	}
	
}
