import java.util.Scanner;
public class ControlStatementFun {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int age;
        
        System.out.println("What is your age");
        age = keyboard.nextInt();
        
        if(age >= 21){
            System.out.println("Here, have a beer!");
        }else if(age >= 16){
            System.out.println("Here's your driver's license and a Coke.");
        }else{
            System.out.println("Here's a Coca-Cola!");
        }
    }//end main
}
