import java.util.Scanner;
public class InputFun {
    public static void main(String[] args){
        Scanner keyboard; //declaraction - no scanner object yet!
                          // only a variable capable of holding 
                          //the address of a Scanner object
        keyboard = new Scanner(System.in); //initialitization
        
        String name;
        int age;
        int favNum;
        String city;
        
        System.out.println("Please enter your name");
        name = keyboard.nextLine();
        
        System.out.println("Please enter your age!");
        age = keyboard.nextInt();
        
        System.out.println("Enter your favorite number");
        favNum = keyboard.nextInt();
        keyboard.nextLine(); //consume newline character
        
        System.out.println("Enter your city");
        city = keyboard.nextLine();
        
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Fav num:  " + favNum);   
        System.out.println("City: " + city);
    }//end main
}
