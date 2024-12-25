package OrganizingJUnitTestsIntoSuites;

public class Car {
    String name;
    String model;


    public Car() {}
    
    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Car: " + name + " " + model );
    }

    public void display2() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
    }
}
