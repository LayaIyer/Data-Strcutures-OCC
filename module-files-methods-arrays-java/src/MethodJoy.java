
public class MethodJoy {
    public static void main(String[] args) {
        
        int[] someArr = new int[2];
        someArr[0] = square(22);
        someArr[1] = square(10);
        
        printArray(someArr);
        
        System.out.println("\n\n");
        
        //5 is the argument
        int myNum = square(5);
        
        //myNum is the argument
        int myOtherNum = square(myNum);
        
        int anotherNum = square(square(4));
        
        System.out.println ("myNum = " + myNum);
        System.out.println("myOtherNumber = " + myOtherNum);
        System.out.println("anotherNum = " + anotherNum);
    }//end main
    
    //parameterized
    //value-returning
    
    public static int square(int n){
        return n * n;
    }//end square
    
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }
}
