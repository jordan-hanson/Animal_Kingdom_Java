package animalKingdomApp;

public class Birds extends Animals{
    private String name;

    public Birds(String name, int discoveredYear, String move, String reproduce, String breath){
        super("Birds", discoveredYear, move, reproduce, breath);

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