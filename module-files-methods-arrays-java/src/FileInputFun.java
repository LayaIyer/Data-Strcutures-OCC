import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args){
        Scanner infile;
        String name;
        
        try{
            infile = new Scanner(new File("input.txt"));
            
            while(infile.hasNext()){
                name = infile.nextLine();
                System.out.println(name);
            }//end while
            
            infile.close(); //close the file!
        }
        catch (FileNotFoundException ex){
            System.out.println("Error opening file.");
        }//end try-catch
        
    }//end main
}
