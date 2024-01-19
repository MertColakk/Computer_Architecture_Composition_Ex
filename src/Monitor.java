public class Monitor {
    //Attributes
    private String model;
    private Resolution resolution;
    private boolean isOpen;

    //Constructor
    public Monitor(String model, Resolution resolution) {
        this.model = model;
        this.resolution = resolution;
        this.isOpen = false;
    }

    //Getter and setters
    public String getModel() {return this.model;}
    public void setModel(String model) {this.model = model;}
    public Resolution getResolution() {return this.resolution;}
    public void setResolution(Resolution resolution) {this.resolution = resolution;}
    public boolean getIsOpen() {return this.isOpen;}
    public void setIsOpen(boolean isOpen) {this.isOpen = isOpen;}

    //Other Functions
    public void openMonitor(){
        if(!this.getIsOpen()){
            System.out.println("Monitor is opening!");
            setIsOpen(true);
        } else System.out.println("Monitor is already open!");
    }
    public void closeMonitor(){
        if(this.getIsOpen()){
            System.out.println("Monitor is closing!");
            setIsOpen(false);
        } else System.out.println("Monitor is already close!");
    }
    public void DisplayInformation(){System.out.println("Model: "+getModel()+"\nResolution: "+getResolution());}
}
