package animalKingdomApp;

public abstract class Animals{
    private static int maxId = 0;
    private int id;
    private String name;
    private int discoveredYear;
    private int fuel;

    // Constructor
    public Animal(String name, int discoveredYear, int fuel){
        maxId++;
        id = maxId;
        this.fuel = fuel;
        this.name = name;
        this.discoveredYear = discoveredYear;
    };
    // Getter and Setter

    public int getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public String setName(String name) {
        this.name = name;
    }

    public int getDiscoveredYear() {
        return discoveredYear;
    };

    public void setDiscoveredYear(int discoveredYear) {
        this.discoveredYear = discoveredYear;
    };

    public int getFuel() {
        return fuel;
    };

    public void setFuel(int fuel) {
        this.fuel = fuel;
    };

    // Use in the subclasses for abstrct animals
    //public void movement(){
    // System.out.println("They move like this."}

    @Override
    public String toString() {
       String rtnString = "AnimalName: " + name + "\n"
                + "Discovered in: " + discoveredYear + "\n"
                + "Fuel Level: " + fuel + ".";
        return rtnString;
    }
}