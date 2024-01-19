public class CPU {
    //Attributes
    String brand;
    boolean isOpen;
    private int coreCount;
    private float speed;

    //Constructor
    public CPU(String brand,int coreCount, float speed) {
        this.coreCount = coreCount;
        this.speed = speed;
        this.brand = brand;
        this.isOpen = false;
    }

    //Getters and setters
    public int getCoreCount() {return coreCount;}
    public void setCoreCount(int coreCount) {this.coreCount = coreCount;}
    public float getSpeed() {return speed;}
    public void setSpeed(float speed) {this.speed = speed;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public boolean isOpen() {return isOpen;}
    public void setOpen(boolean open) {isOpen = open;}

    //Other Functions
    public void openCPU(){
        if(!this.isOpen()){
            System.out.println("CPU is opening!");
            this.setOpen(true);
        }else System.out.println("CPU is already open!");
    }
    public void closeCPU(){
        if(this.isOpen()){
            System.out.println("CPU is closing!");
            this.setOpen(false);
        } else System.out.println("CPU is already closed!");
    }
}
