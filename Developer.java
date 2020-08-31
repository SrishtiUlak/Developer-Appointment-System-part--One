/**
 * Developer class is super class(parent class)
 * New Developer is going to hire
 * This class contain 4 attribiue(Platfrom, InterviewerName, DeveloperName, WorkingHours)
 * In Private access modifier code inside the same class can access the variable, or call the method
 * This keyword is used to passed as an argument to another method.
 * Getter and setter methodes are used for retrieving and updating value of a variable
 */
/**
 * Developer class is parent class(super class)
 * Developer class is made public inherited by its subclass  which can indirect access to all of the private members(instance variable) of the superclass.   
 */ 
public class Developer
    {
       /*
        *Instance variable of developer class 
        *Private access modifier is used to restricts data and hide from othere class
        *Instance variable are made private to hide tha data 
        *Instance variable that are private can be accessed outside the class, if public getter methods are present in the class
       */
       private String platform;// instance variable or attribute 
       private String interviewerName;//instance variable 
       private String developerName;//instance variable 
       private int workingHours;//instance variable 
       /**
        * Developer is a constructors  in which the value of parameter are assigned 
        * this. keyword is used to assigned the value of instance variable to the parameters   
        */
       public Developer(String platform,String interviewerName,int workingHours ){//constructors 
         this.platform =  platform;//assigning value to instance variable or attribute by parameter
         this.interviewerName = interviewerName;
         this.developerName = "";
         this.workingHours = workingHours;
       }
       /**
        * Mutator method is used to set the value of private field whereas Accessor method is used to return the of private field
        */
       public String getPlatform(){// getter method is used to return the value
           return platform;
       }   
       public String getInterviewerName(){//getter method is used to return the value
           return interviewerName;
       } 
       public String getDeveloperName(){//getter method is used to return the value
          return developerName;
        }  
       public int getWorkingHours(){//getter method is used to return the value
          return workingHours;
       }
       //void is nonreturn data type
       public void setDeveloperName(String DeveloperName){//setter method is set the value
           developerName=DeveloperName;
       }
       // Display is the method to display  
       public void display(){
            System.out.println("Name of platform:"+platform);
            System.out.println("Name of interviewer:"+interviewerName);
            System.out.println("Time for working hour:"+workingHours);
            if(!developerName.equals("")){
                System.out.println("Name of developer:"+developerName);                
         }
       }
}  
