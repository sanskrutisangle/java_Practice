package inherits;
class Product {

    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        System.out.println("Product Constructor");
        System.out.println("Product : " + productName);
        System.out.println("Price : " + price);
    }
}

class Electronics extends Product {

    String brand;

    Electronics(String productName, double price, String brand) {
        super(productName, price);
        this.brand = brand;

        System.out.println("Electronics Constructor");
        System.out.println("Brand : " + brand);
    }
}

class Laptop extends Electronics {

    int ram;
    int storage;

    Laptop(String productName, double price, String brand, int ram, int storage) {

        super(productName, price, brand);

        this.ram = ram;
        this.storage = storage;

        System.out.println("Laptop Constructor");
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }
}

public class ProductMain {

    public static void main(String[] args) {

        Laptop l = new Laptop("ThinkPad", 85000, "Lenovo", 16, 512);

    }
}



