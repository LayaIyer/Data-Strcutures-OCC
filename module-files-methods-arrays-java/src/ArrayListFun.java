import java.util.ArrayList;
public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList <String> myAL = new ArrayList<>();
        ArrayList <Integer> myIntAL = new ArrayList<>();
        myIntAL.add(15); //auto-boxing
        int myFavInt = myIntAL.get(0); //auto-unboxing
        System.out.println("My favorite int: " + myFavInt);
        
        myAL.add("John");
        myAL.add("Bob");
        myAL.add("Ksenia");
        myAL.add("Sally");
        
//        for(int i =0; i < myAL.size(); i++){
//            System.out.println(myAL.get(i));
//        }//end for
        
        //enhanced for loop!
        for(String name: myAL){
            System.out.println(name);
        }//end for
        
        
        
    }//end main
}
