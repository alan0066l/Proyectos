
public class CalculateDays {
    public int month=0;
    public void daysinMonth(){
        
    int days=0;
    /*if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) days = 31
    else if (month==4 || month==6 || month==9 || month==11) days = 30;
        else days = 28;    
            */
            
            switch( month ){
  
            case 2: days = 28;
                break;
          
            case 4: 
            case 6:  
            case 9:  
            case 11: days = 30;
                break;   
            default: days = 31;
            }      
    System.out.println( days );
    
       
    }
}
