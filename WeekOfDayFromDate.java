import java.util.*;
import java.text.SimpleDateFormat;

public class Program
{
    public static void main(String[] args) throws Exception{
        
        //hard-coded data
        int x = 4; //day
        int y= 5; //month
        int z = 1998; //year
        
        String str = Integer.toString(x)+"/"+Integer.toString(y)+"/"+Integer.toString(z);
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date = sdf.parse(str);
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
        
        String day = sdf2.format(date);
        
        System.out.println("day :"+day);
        
    }
}
