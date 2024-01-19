public class Case {
    //Attributes
    String model;
    int psuWatt;
    private Motherboard motherboard;

    //Constructor
    public Case(String model, int psuWatt, Motherboard motherboard) {
        this.model = model;
        this.psuWatt = psuWatt;
        this.motherboard = motherboard;
    }

    //Getters and Setters
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getPsuWatt() {return psuWatt;}
    public void setPsuWatt(int psuWatt) {this.psuWatt = psuWatt;}
    public Motherboard getMotherboard() {return motherboard;}
    public void setMotherboard(Motherboard motherboard) {this.motherboard = motherboard;}
}
