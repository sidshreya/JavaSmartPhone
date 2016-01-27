/* 
 * @author Shreyansi Kumar
 */
package driver;

import model.Automotive;
import util.FileIO;



public class Driver {
	public static void main(String [] args) {
		
		FileIO file = new FileIO();
		//Create Automobile Object from a file.
		Automotive auto = file.buildAutomotiveObject("C:/Users/Shreyanshi/Desktop/FordZTW.txt");		
		//Attributes before serialization
        System.out.println("Before serialization!\n");
		auto.print();
		
		
        FileIO fio = new FileIO();
      //Serialize
        Automotive FordZTW = fio.serializeAutomotive(auto);
        System.out.println("After Serialization !\n");
       // Print new attributes
        FordZTW.print();
        
        
        /**
         * Finding
         */
        System.out.println("Find Power Moonroof & present\n");
        FordZTW.findOptionSet("Power Moonroof");
        FordZTW.findOption("present ");        
        FordZTW.print();
        System.out.println("Finished Finding \n");
        /**
         * Updating
         */
        System.out.println("Now update standard, $0.0 of automatic and Transmission!\n");
        FordZTW.updateOption("standard ", "classic");
        FordZTW.updateOption("automatic ", 400);
		FordZTW.updateOptionSet("Transmission", "Transmission Control");
		FordZTW.print();
		System.out.println("Finished Updating!\n");
		 /**
         * Deleting
         */
		System.out.println("\nNow delete ABS with Advance Trac and Side Impact Air Bags!\n");
        FordZTW.deleteOption("ABS with Advance Trac ");
		FordZTW.deleteOptionSet("Side Impact Air Bags");
		FordZTW.print();
		System.out.println("Finished Deleting!\n"); 
	}
}