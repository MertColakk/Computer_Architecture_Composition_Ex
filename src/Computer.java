public class Computer {
    //Attributes
    private String brand;
    private boolean isOpen;
    private Case computerCase;
    private Monitor monitor;

    //Constructor
    public Computer(String brand, Case computerCase, Monitor monitor) {
        this.brand = brand;
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.isOpen = false;
    }

    //Getters and setters
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public Case getComputerCase() {return computerCase;}
    public void setComputerCase(Case computerCase) {this.computerCase = computerCase;}
    public Monitor getMonitor() {return monitor;}
    public void setMonitor(Monitor monitor) {this.monitor = monitor;}
    public boolean isOpen() {return isOpen;}
    public void setOpen(boolean open) {isOpen = open;}

    //Other Functions
    public void openComputer(){
        if(!isOpen){
            getMonitor().openMonitor();
            getComputerCase().getMotherboard().getCpu().openCPU();
            getComputerCase().getMotherboard().openMotherboard();
        }else System.out.println("Computer is already open!");

    }
    public void closeComputer(){
        if(isOpen){
            getMonitor().closeMonitor();
            getComputerCase().getMotherboard().getCpu().closeCPU();
            getComputerCase().getMotherboard().closeMotherboard();
        }else System.out.println("Computer is already closed!");
    }
    public void DisplayInformations(){
        System.out.println("Brand: "+getBrand()
                +"\nCase: "+getComputerCase().getModel()
                +"\nPSU Watt: "+getComputerCase().getPsuWatt()
                +"\nMotherboard Brand: "+getComputerCase().getMotherboard().getBrand()
                +"\nOperating System: "+getComputerCase().getMotherboard().getOperatingSystem()
                +"\nSocket Count: "+getComputerCase().getMotherboard().getSocketCount()
                +"\nCPU: "+getComputerCase().getMotherboard().getCpu().getBrand()
                +"\nCPU Core Count: "+getComputerCase().getMotherboard().getCpu().getCoreCount()
                +"\nCPU Speed: "+getComputerCase().getMotherboard().getCpu().getSpeed());


    }
}
