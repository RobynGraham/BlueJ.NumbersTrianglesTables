 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";

        for(int i=0; i< numberOfStars; i++) {
        
        result = result + "*";

    }
    return result;
    }
    
    public static String getTriangle(int numberOfRows) {
        String result = "";
        
        for(int i=1; i<= numberOfRows; i++) {
         for(int j=1; j<=i; j++){
            if(j <= i){
                result = result + "*";
            }
            }
        result = result +"\n";
    }
    return result;
    }


    public static String getSmallTriangle() {
        String result = "";
        
        for(int i=1; i <= 4; i++) {
            for(int j = 1; j<=i; j++){
                if(j<=i){
        result = result + "*";
    }
}
    result = result + "\n";
}
    return result;
}

    public static String getLargeTriangle() {
        String result = "";
        
        for(int i =1; i<=9; i++) {
            for (int j = 1; j<=i; j++){
                if(j<=i){
                    result = result + "*";
                }
            }
                result = result + "\n";
            }
            
        return result;
    }
}

