public class Vehicle {

    private String brand;
    private String model;

    public Vehicle(String brand, String model, String color, String type, double price, int shacyNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.shacyNumber = shacyNumber;
    }

    private String color;
    private String type;
    private double price;
    private int shacyNumber;

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShacyNumber() {
        return shacyNumber;
    }

    public void setShacyNumber(int shacyNumber) {
        this.shacyNumber = shacyNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", shacyNumber=" + shacyNumber +
                '}';
    }
}
