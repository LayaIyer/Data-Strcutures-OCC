//Laya Iyer
//proj1
//October 10th, 2020
public class Employee {
    //initializing variables
    private String degree;
    private String firstName;
    private String lastName;
    private int experience;
    
    //constructors
    public Employee(){
        degree = "None";
        firstName = "Stan";
        lastName = "Dupp";
        experience = 0;
    }
    
    public Employee(String deg, String fn, String ln, int exp){
        degree = deg;
        firstName = fn;
        lastName = ln;
        experience = exp;
    }
    
    //set methods
    public void setDegree(String d){
        degree = d;
    }
    
    public void setFirstName(String f){
        firstName = f;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    public void setExperience(int e){
        experience = e;
    }
    
    //get methods
    public String getDegree(){
        return degree;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getExperience(){
        return experience;
    }
    
    //used internally to make things simpler:)
    private int getDegreeValue(){
        if (degree.equals("None")){
            return 1;
        }else if(degree.equals("Associate")){
            return 2;
        }else if(degree.equals("Bachelors")){
            return 3;
        }else if(degree.equals("Masters")){
            return 4;
        }else if(degree.equals("Doctorate")){
            return 5;
        }
        return 0;
    }
    
    //overriding the toString method
    public String toString(){
        return (firstName + " " + lastName + " has been with the company for " 
                + experience + " years and has a degree level of " + degree);
    }
    
    //checking if 2 employee objects have the same ValuePoints
    public boolean equals(Employee e){
        
        int thisValPoints = this.experience*this.getDegreeValue();
        int eValPoints = e.getExperience()*e.getDegreeValue();
        
        if (thisValPoints == eValPoints){
            return true;
        }else{
            return false;
        }
    }
    
    //Comparing two employee classes' ValuePoints
    public int compareTo(Employee otherEmp){
        if(this.getDegreeValue() < otherEmp.getDegreeValue()){
            return -1;
        }else if(this.equals(otherEmp)){
            return 0;
        }else{
            return 1;
        }
    }
    
    
    
}//end of employee class
