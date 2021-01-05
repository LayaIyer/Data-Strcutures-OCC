//Laya Iyer
//CIS 2353
//Fall 2020
//Prof. John P. Baugh

import java.util.*;

public class Main {
    ADTDictionary adt;
    public static void main(String[] args){
        
        //initial print statements
        System.out.println("Welcome to the Faculty Directory Program");
        System.out.println("Use commands:");
        System.out.println("list all");
        System.out.println("list DEPT_NAME");
        System.out.println("add DEPT_NAME, FIRST LAST");
        System.out.println("remove DEPT_NAME, FIRST LAST");
        System.out.println("exit");
        
        String input;
        Main tester = new Main();
        tester.adt = new ADTDictionary();
        
        tester.adt.readFiles();
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print(">>");
            
            input = scan.nextLine().trim();
            
            if(!input.equals("exit")){
                tester.action(input);
            }else{
                System.out.println("Goodbye! Have a nice day");
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
    
    public void action(String in){
        if(in.equalsIgnoreCase("LIST ALL")){
            adt.listAll();
            return;
        } else if (in.toUpperCase().contains("LIST")){
            in = in.substring(5, in.length());
            adt.listDeptName(in);
            return;
        }else if(in.toUpperCase().contains("ADD")){
            in = in.substring(4, in.length());
            adt.add(in);
            return;
        }else if(in.toUpperCase().contains("REMOVE")){
            in = in.substring(6, in.length());
            adt.remove(in);
        }
    }
}
