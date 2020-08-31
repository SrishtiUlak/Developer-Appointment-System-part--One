/**
 * SeniorDeveloper is sudclass of developer class parent class
 * SeniorDeveloper is going to be hired
 * In this class there is information for SeniorDeveloper
 * Extend keyword is used to conncet with parents class
 * In Private access modifier code inside the same class can access the variable, or call the method
 * This class contains 7 instance variable(salary, joiningDate, staffRoomNumber, contractPeriod, advanceSalary, appointed, terminated)
 * This keyword is used to passed as an argument to another method.
 * Getter and setter methodes are used for retrieving and updating value of a variable
 */
/**
 * SeniorDeveloper is sub class of Developer class
 * extend is a keyword that is used to inherite the features of parent class i.e. Developer to child class i.e. SeniorDeveloper
 * SeniorDeveloper class is made public inherited by its subclass  which can indirect access to all of the private members(instance variable) of the superclass. 
 */
public class SeniorDeveloper extends Developer
{
      /*
       *Instance variable of SuperDeveloper class 
       *Private access modifier is used to restricts data and hide from othere class
       *Instance variable are made private to hide tha data
       *Instance variable that are private can be accessed outside the class, if public getter methods are present in the class
       */
      private int salary;// instance variable or attribute 
      private String joiningDate;// instance variable or attribute 
      private String staffRoomNumber;// instance variable or attribute 
      private int contractPeriod;// instance variable or attribute 
      private int advanceSalary;// instance variable or attribute 
      private boolean appointed;// instance variable or attribute 
      private boolean terminated;// instance variable or attribute 
      /**
       * SeniorDeveloper is a constructors in which the value of parameter are assigned 
       * this. keyword is used to assigned the value of instance variable to the parameters
       */
      public SeniorDeveloper( int contractPeriod, int salary, String platform, String interviewerName, int workingHours ){//constructors 
           super(platform, interviewerName, workingHours);
           this.salary = salary;//assigning value to instance variable or attribute by parameter
           this.joiningDate = "";
           this.staffRoomNumber = "";
           this.contractPeriod = contractPeriod;
           this.advanceSalary = (int)0.0;
           this.appointed = false;
           this.terminated = false;
      }
      /**
       * Mutator method is used to set the value of private field whereas Accessor method is used to return the of private field
       */
      public int getSalary(){// getter method is used to return the value
            return salary;
      }
      public String getJoiningDate(){// getter method is used to return the value
            return joiningDate;
      }
      public String getStaffRoomNumber(){// getter method is used to return the value
            return staffRoomNumber;
      }
      public int getContractPeriod(){// getter method is used to return the value
            return contractPeriod;
      }
      public int getAdvanceSalary(){// getter method is used to return the value
            return advanceSalary;
      }
      public boolean getAppointed(){// getter method is used to return the value
            return appointed;
      }
      public boolean getTerminated(){// getter method is used to return the value
            return terminated;
      }
      //void is nonreturn data type
      public void setSalary(int newSalary){//setter method is set the value
        this.salary = newSalary;
      } 
      public void setContractPeriod(int newContractPeriod){//setter method is set the value
        this.contractPeriod = newContractPeriod;
      }
      /**
       * Hire methode is made to see the developer is appointed or not
       * It contains the informations in parameter 
       */
      public void hire(String developerName, String joiningDate, int advanceSalary, String staffRoomNumber){         
            if(appointed){
                System.out.println("Developer already hired");
                System.out.println("Developer Name : "+getDeveloperName());
                System.out.println("Room no : "+staffRoomNumber);
            }else{
                setDeveloperName(developerName);            
                this.joiningDate=joiningDate;
                this.staffRoomNumber=staffRoomNumber;
                this.advanceSalary=advanceSalary;
                this.appointed=true;
                this.terminated=false;
            }   
      }
      /**
       *Termination is a methode 
       *If developer isn;t hired then new value ares set
       */
      public void termination(){
            if(terminated){
                System.out.println(" Employee is already terminated you can hire new Developer");
            }else{                
                setDeveloperName("");
                this.joiningDate = "";                 
                this.advanceSalary = (int)0.0;//0.0 float/decimal value/double - holds decimal value  // integer = 0......                    
                this.appointed = false;
                this.terminated = true;
             }
      }
      // print methode is used to print or to get output
      public void print(){
          System.out.println("Name of platform : "+getPlatform());
          System.out.println("Name of the InterviewerName : "+getInterviewerName());    
          System.out.println("Salary of developer : "+ salary); 
      }
      // Display is the method to display
      public void display(){                        
          super.display();//super to call the superclass               
          if(appointed){                     
              System.out.println("Terminated : "+terminated);                     
              System.out.println("Joining Date : "+joiningDate);                     
              System.out.println("Advance Salary : "+advanceSalary);                     
              System.out.println("Developer Name : "+getDeveloperName());
          }       
      }   
}   
                
        
        
         
    
    

       