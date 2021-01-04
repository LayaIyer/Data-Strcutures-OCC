//Laya Iyer
//CIS 2353
//Fall 2020
//Prof. John P. Baugh

import java.io.*;
import java.util.*;
public class Classify {
    
    public static List<String> searchForImage(String search, Map<String, String[]> groupMap){
        String [] searchFor;
        List<String> result = new ArrayList<>();
        //if there is an or in the line
        if(search.toLowerCase().contains(" or ")){
            searchFor = search.toLowerCase().split(" or ");
            if(searchFor.length > 2){
                System.out.println("Your search is not valid.");
            }//end of notValid if
            
            for (String key: groupMap.keySet()){
                String[] values = groupMap.get(key);
                    
                for(String value: values){
                    int i = 0;
                    for(String str: searchFor){
                        if(str.toLowerCase().equals((value.toLowerCase()))){
                            result.add(key);
                            i=1;
                            break;
                        }
                    }//end of values for loop
                    if (i == 1){
                        break;
                    }
                }
            }//end of groupMap for loop
                
        //if there is an and in the line
        }else if (search.toLowerCase().contains(" and ")){
            searchFor = search.toLowerCase().split(" and ");
            if(searchFor.length > 2){
                System.out.println("Your search is not valid");
            }
            
            
            for(String key: groupMap.keySet()){
                int count1 = 0;
                int count2 = 0;
                String[] values = groupMap.get(key);
                for(String value: values){
                    if(searchFor[0].toLowerCase().equals((value.toLowerCase()))){
                        count1 ++;
                    }
                    if(searchFor[1].toLowerCase().equals(value.toLowerCase())){
                        count2 ++;
                    }
                }
                if(count1 > 0 && count2 > 0){
                    result.add(key);
                }
            }
        //if there is not an or or an and in the line 
        } else{
            for(String key: groupMap.keySet()){
                String[] values = groupMap.get(key);
                for(String value: values){
                    if(search.toLowerCase().equals(value.toLowerCase())){
                        result.add(key);
                    }
                }
            }
        }
        
        return result;
    }//end of searchForImage method
    
    //reading each of the values of lines in the file provided and storing the data
    public static List<String> readValuesFromFile(){
        List<String> file = new ArrayList <String>();
        BufferedReader buffreader;
        
        //try-catch block
        try{
            buffreader = new BufferedReader(new FileReader("image_info.txt"));
            String nxtLine = buffreader.readLine();
            //keep reading until there is a line with no values
            while(nxtLine != null){
                file.add(nxtLine);
                nxtLine = buffreader.readLine();
            }
            buffreader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return file;
    }
    
    public static Map<String, String[]> groupList(List<String> file){
        Map<String, String[]> groupMap = new HashMap<String, String[]>();
        for(String item:file){
            String[] word = item.split(" ");
            String[] keys = new String[word.length - 1];
            for(int a = 0; a < word.length - 1; a++){
                keys[a] = word[a+1];
                groupMap.put(word[0], keys);
            }
        }
        
        return groupMap;
    }
    
}//end of classify
