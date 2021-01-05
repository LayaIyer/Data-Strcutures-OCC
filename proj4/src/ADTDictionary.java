//Laya Iyer
//CIS 2353
//Fall 2020
//Prof. John P. Baugh

import java.io.*;
import java.util.*;

public class ADTDictionary {
    
    Map<String, List<String>> adtdict;
    
    public void readFiles(){
        try{
            Scanner depFile = new Scanner(new File("departments.txt"));
            Scanner facFile = new Scanner(new File("faculty.txt"));
            
            adtdict = new HashMap<String, List<String>>();
        
            while(depFile.hasNext()){
                String dep = depFile.nextLine().trim();
                adtdict.put(dep, new ArrayList<String>());
            }
        
            while(facFile.hasNext()){
                String fac = facFile.nextLine();
                String[] val = fac.split(",");
                adtdict.get(val[1].trim()).add(val[0]);
            }
            
            depFile.close();
            facFile.close();
        
        }catch(FileNotFoundException ex){
            System.out.println("Error opening file.");
        }//end try-catch
    }
    
    
    //to list all the faculty members
    public void listAll(){
        
        for(String key: adtdict.keySet()){
            for(String value: adtdict.get(key)){
                System.out.println(value + ", " + key);
            }
        }
    }
    
    //list based on the department
    public void listDeptName(String dep){
        if(null != adtdict.get(dep)){
            for(String name: adtdict.get(dep)){
                System.out.println(name);
            }
        }
    }
    
    public void add(String newFac){
        String [] deptandname = newFac.split(",");
        String dept = deptandname[0].trim();
        String fac = deptandname[1].trim();
        
        for(String name: adtdict.get(dept)){
            if(name.equalsIgnoreCase(fac)){
                System.out.println("Cannot add " + name + " to " + dept + " because they already exist there");
                return;
            }
        }
        
        adtdict.get(dept).add(fac);
        System.out.println("OK, added " + fac);
    }
    
    public void remove(String oldFac){
        String [] deptandname = oldFac.split(",");
        String dept = deptandname[0].trim();
        String fac = deptandname[1].trim();
        
        adtdict.get(dept).remove(fac);
        System.out.println("Removed " + fac + " from " + dept);
    }
}
