package animalKingdomApp;

public class Fish extends Animals{
    private String name;

    public Fish(String name, int discoveredYear, String move, String reproduce, String breath){
        super("Fish", discoveredYear, move, reproduce, breath);

        this.name = name;

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String rtnStng = super.toString();
        rtnStng += "\nName: " + name + " Discovered: " + discoveredYear + ".}";
        return rtnStng;
    }
}