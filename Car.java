public class Car {
    
    private String make;
    private String model;
    private int year;
    private double price;
    
    // default constructor
    public Car() {
        this.make = "Toyota";
        this.model = "Camry";
        this.year = 2022;
        this.price = 25000;
    }
    
    //Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }    

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }       

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }           

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {  
        return "Car: " + make + " " + model + " " + year + " " + price;
    }
    
    //main method
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car("Toyota", "Camry", 2022, 25000);
        System.out.println(car.toString());

        Car car1 = new Car("Toyota", "Camry", 2022, 25000);
        System.out.println(car1.toString());

        
    }
}
