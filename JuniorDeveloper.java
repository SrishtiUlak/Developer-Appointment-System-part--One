/**
 * Juniorclass is sub class of Developer class
 * Juniorclass is going to be hired 
 * Extend keyword is used to conncet with parents class
 * In Private access modifier code inside the same class can access the variable, or call the method 
 * This keyword is used to passed as an argument to another method.
 * Getter and setter methodes are used for retrieving and updating value of a variable
 */
/**
 * JuniorDeveloper is sub class of Developer class
 * extend is a keyword that is used to inherite the features of parent class i.e. Developer to child class i.e. SeniorDeveloper
 * JuniorrDeveloper class is made public inherited by its subclass  which can indirect access to all of the private members(instance variable) of the superclass. 
 */
public class JuniorDeveloper extends Developer
{
      /*
       *Instance variable of juniorDeveloper class 
       *Private access modifier is used to restricts data and hide from othere class
       *Instance variable are made private to hide tha data
       *Instance variable that are private can be accessed outside the class, if public getter methods are present in the class
       */  
      private int salary;// instance variable or attribute          
      private String appointedDate;// instance variable or attribute 
      private String evaluationPeriod;// instance variable or attribute 
      private String terminationDate;// instance variable or attribute 
      private String specialization;// instance variable or attribute 
      private String appiontedBy;// instance variable or attribute 
      private boolean joined;// instance variable or attribute      
      /**
       * JuniorDeveloper is a constructors in which the value of parameter are assigned 
       * this. keyword is used to assigned the value of instance variable to the parameters
       */
      public JuniorDeveloper(int salary,String platform,String interviewerName,int workingHours,String terminationDate,String appiontedBy){//constructors 
          super(platform,interviewerName,workingHours);//super key word is used to
          this.salary = salary;//assigning value to instance variable or attribute by parameter
          this.appiontedBy=appiontedBy;
          this.appointedDate=appointedDate;
          this.terminationDate=terminationDate;
          this.evaluationPeriod=" ";
          this.specialization=" ";
          this.joined=false;
      }
      public int getSalary(){// getter method is used to return the value
            return salary;
      }
      public String getAppointedDate(){// getter method is used to return the value
            return appointedDate;
      }
      public String getEvaluationPeriod(){// getter method is used to return the value
            return evaluationPeriod;
      }
      public String getTerminationDate(){// getter method is used to return the value
            return terminationDate;
      }
      public String getSpecialization(){// getter method is used to return the value
            return specialization;
      }
      public String getAppiontedBy(){// getter method is used to return the value
            return appiontedBy;
      }
      public boolean getJoined(){// getter method is used to return the value
            return joined;
      }
      //void is nonreturn data type
      public void setSalary( int newSalary){// getter method is used to return the value
          if(!joined){
              this.salary=newSalary;              
          }else{
               System.out.println("There is no change in salary");
          }
       }
      /**
       * AppointDeveloper 
       */
      public void appointDeveloper( String developerName, String appointedDate, String terminationDate,String specialization){
         if(!joined){   
             setDeveloperName(developerName);
             this.joined = true;
             this.terminationDate=terminationDate;
             this.specialization=specialization;
             this.appointedDate=appointedDate;
             System.out.println("the developer is joined:");  
         }else{                
             System.out.println("the developer is already appointed");
         }
       }
      // Display is the method to display  
      public void display(){
          super.display();//super to call the superclass
         if(joined){
              System.out.println("Name of Developer Name : "+getDeveloperName());
              System.out.println("Appointed Date : "+appointedDate);
              System.out.println("Evaliation Period : "+evaluationPeriod);
              System.out.println("Terminated : "+terminationDate);
              System.out.println("Salary : "+salary);
              System.out.println("Specialization : "+specialization);
              System.out.println("Appionted by : "+appiontedBy);
            }
      }
}
        
          
      
      
      
        
          
        
        
            
            
          
          
          

  
  
    
            
           
            
            
      
      
      
      
  
