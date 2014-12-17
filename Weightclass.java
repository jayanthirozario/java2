
public class Weightclass
{
    // instance variables - replace the example below with your own
int weight;
    
    public Weightclass(int weight1)
    {
        // initialise instance variables
        weight = weight1;
    }

 
    public void getw(){ 
        String results1;
        if(weight >=150){
            
            results1= "over weight";
        }
        else if (weight <=150){
                results1= "You are ok";
           
        }
        
         /*String results1;
        if(weight >=150){
            results1= "over weight";
        }
        else {
                results1= "You are ok";
        }
        */
        
         System.out.println("Weight =" + results1);

    }
    public int gethalfweight(){
        int halfweight;
        halfweight=weight/2;
System.out.println("Half weight="+halfweight);
        return halfweight;
    }
}
        