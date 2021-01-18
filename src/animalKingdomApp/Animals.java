package animalKingdomApp;

public abstract class Animals{
    protected static int maxId = 0;
    protected int id;
    protected String type;
    protected int discoveredYear;
    protected String move;
    protected String reproduce;
    protected String breath;


    // Constructor
    public Animals(String type, int discoveredYear, String move, String reproduce, String breath){
        maxId++;
        id = maxId;
        this.type = type;
        this.discoveredYear = discoveredYear;
        this.move = move;
        this.reproduce = reproduce;
        this.breath = breath;

    };
    // Getter and Setter

    public int getId() {
        return id;
    };

    public String getName() {
        return type;
    };

    public void setName(String type) {
        this.type = type;
    };

    public int getDiscoveredYear() {
        return discoveredYear;
    };

    public void setDiscoveredYear(int discoveredYear) {
        this.discoveredYear = discoveredYear;
    };

    public String getMove() {
        return move;
    };

    public String getReproduce() {
        return reproduce;
    };

    public String getBreath() {
        return breath;
    };

    // Use in the subclasses for abstrct animals
    //public void movement(){
    // System.out.println("They move like this."}

    public void setMove(String move){
        System.out.println(move);
    };

    public void setReproduce(String move){
        System.out.println(move);
    };

    public void setBreath(String move){
        System.out.println(move);
    };

    @Override
    public String toString() {
       String rtnString = "AnimalType: " + type + ".";
        return rtnString;
    }
}