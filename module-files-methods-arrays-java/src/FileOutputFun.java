import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args){
        PrintWriter pw; //variable capable of holding the address
                        //of a PrintWriter object
                
        try{
            pw = new PrintWriter("output.txt"); //create the PW object
            
            pw.println("Hello there!");
            pw.print("John Baugh\tSamantha Snuggles\tAli Oxenfree\n");
            pw.println("\n\n");
            pw.println("File done writing");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Cannot find file!");
        }//end try-catch
        
        System.out.println("Done!");
    }
}
