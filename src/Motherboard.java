public class Motherboard {
    //Attributes
    private String brand;
    private String operatingSystem;
    private int socketCount;
    private CPU cpu;
    private boolean isOpen;

    //Constructor
    public Motherboard(String brand, String operatingSystem, int socketCount, CPU cpu) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.socketCount = socketCount;
        this.cpu = cpu;
        this.isOpen = false;
    }

    //Getters and Setters
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getOperatingSystem() {return operatingSystem;}
    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}
    public int getSocketCount() {return socketCount;}
    public void setSocketCount(int socketCount) {this.socketCount = socketCount;}
    public CPU getCpu() {return cpu;}
    public void setCpu(CPU cpu) {this.cpu = cpu;}
    public boolean isOpen() {return isOpen;}
    public void setOpen(boolean open) {isOpen = open;}
    public void openMotherboard(){
        if(!isOpen) System.out.println("Monitor is opening!");
        else System.out.println("Monitor is already open!");
    }
    public void closeMotherboard(){
        if(isOpen) System.out.println("Monitor is closing!");
        else System.out.println("Monitor is already closed!");
    }
}
