package animalKingdomApp;

public class Mammals extends Animals{
    private String name;

    public Mammals(String name, int discoveredYear, String move, String reproduce, String breath){
        super("Mammal", discoveredYear, move, reproduce, breath);

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String rtnStr = super.toString();
        rtnStr += "\nName: " + name + " Discovered: " + discoveredYear + ".}";
        return rtnStr;
    }
}