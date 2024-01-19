//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Classes for Computer Class
        Resolution myResolution = new Resolution(1920,1080);
        Monitor myMonitor = new Monitor("MSI",myResolution);
        CPU myCPU = new CPU("Ryzen 5 5500x",6,3.90f);
        Motherboard myMotherboard  = new Motherboard("AMD B550","Manjaro Linux",6,myCPU);
        Case myCase = new Case("Gamebooster",750,myMotherboard);

        Computer myComputer = new Computer("MSI",myCase,myMonitor);

        //Open Computer
        myComputer.openComputer();

        //Display Information of My Computer
        System.out.println(); //For \n
        myComputer.DisplayInformations();
        System.out.println(); //For \n

        //Close Computer
        myComputer.closeComputer();

    }
}