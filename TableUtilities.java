
 import java.util.Formatter;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String outcome = "";      
              for(int i = 1; i <= 5; i++){
               
                  for(int x = 1; x <= 5; x++){
                      
                      int output = (x * i);
                    
                      outcome += String.format("%3d |", output);
                    }
                    outcome += "\n";
                    
                } return outcome;
    }

    public static String getLargeMultiplicationTable() {
        String outcome = "";      
              for(int i = 1; i <= 10; i++){
               
                  for(int x = 1; x <= 10; x++){
                      
                      int output = (x * i);
                    
                      outcome += String.format("%3d |", output);
                    }
                    outcome += "\n";
                    
                } return outcome;
    }

    public static String getMultiplicationTable(int tableSize) {
      
      String outcome = "";      
              for(int i = 1; i <= tableSize; i++){
               
                  for(int x = 1; x <= tableSize; x++){
                      
                      int output = (x * i);
                    
                      outcome += String.format("%3d |", output);
                    }
                    outcome += "\n";
                    
                } return outcome;
}  
    }   
