import java.util.Scanner;
public class Resolution {
    //Attributes
    private int width,height;
    private String resolution;

    //Constructor
    public Resolution(int width,int height) {
        this.width = width;
        this.height = height;
        this.resolution = width+"x"+height;
    }

    //Getters and setters
    public int getWidth() {return this.width;}
    public int getHeight() {return this.height;}
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}
    void setResolution(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        setWidth(width);
        setHeight(height);
        this.resolution = getWidth()+"x"+getHeight();

        scanner.close();

        System.out.println("Resolution updated to "+getResolution()+"!");
    }
    String getResolution(){return this.resolution;}

}
