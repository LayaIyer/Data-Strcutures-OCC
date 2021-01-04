//Laya Iyer
//CIS 2353
//Fall 2020
//Prof. John P. Baugh
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> mainlist = new ArrayList<String>();
        Map<String, String[]> groupMap = new HashMap<String, String[]>();
        List<String> results = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        mainlist = Classify.readValuesFromFile();
        groupMap = Classify.groupList(mainlist);
        
        while(true){
            System.out.println("What would you like to search for? \n");
            String search = scan.nextLine();
            results = Classify.searchForImage(search, groupMap);
            if(results.isEmpty()){
                System.out.println("Your search returned no results.");
                break;
            }else{
                for(String str: results){
                    System.out.println(str);
                }
            }
        }
    }
}
