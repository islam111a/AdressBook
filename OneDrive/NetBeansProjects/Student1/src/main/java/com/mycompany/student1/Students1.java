
package com.mycompany.student1;

/**
 *
 * @author Microsoft
 */
public class Students1 {
     private int Id ;
     private String Name ;
     private double Avg  ; 
   
    public Students1(int id , String name , double avg)
     {
      this.Avg=avg;
      this.Id=id;
      this.Name=name;
     }
   
    
     
    public String getName (){ return Name ; }
    
    public int gatId() { return Id ;  }

    public void getAvg() { 
         if ( Avg > 100)
            System.out.println(" avg not correct ");
         else if (50 > Avg)
            System.out.println(" avg not correct ");
         else  
            System.out.print("avg = " + Avg ) ;
    }
    
    public void setName(String name){ this.Name=name; }
    
    public void setId(int id){ this.Id=id; }
    
    public void setAvg(double avg )
    { 
        this.Avg=avg;
     }
     public void getInfo (){
     
        System.out.println(" id = "+ Id);
     
        System.out.println(" name = "+ Name );
      
        getAvg() ;
         
     }
}
