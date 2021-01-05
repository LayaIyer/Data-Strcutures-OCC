
public class ArrayFun {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        int[] yourArr;
        
        myArr[0] = 150;
        myArr[1] = 22;
        myArr[2] = 37;
        myArr[3] = 44;
        myArr[4] = 400;
        
        yourArr = myArr;
        
        yourArr[2] = -1000;
        
        for(int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }//end for
             
    }//end main
}
