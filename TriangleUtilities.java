 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        int width = numberOfStars;
        String outcome = "";
        StringBuilder result = new StringBuilder();
               for(int i = 0; i < width; i++){
                   
                        result.append("*");
                                    
        }
                        outcome = result.toString();
                        System.out.println(outcome);
                            return outcome;
    }
    
    public static String getTriangle(int numberOfRows) {
      StringBuilder result = new StringBuilder();
      String outcome = "";
          for (int i = 0; i < numberOfRows; i++){
    
               result.append("*");
               outcome = result.toString();         
               System.out.print(outcome + "\n");
                  }   
            return outcome;
    }


    public static String getSmallTriangle() {
     return getTriangle(4) ;
}
    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
