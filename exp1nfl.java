public class exp1nfl { // this line that define class name
    public static void main (String[] args) {// this is like library that tell compiler the definition of keywords that are used in java
        int row = 5, colmn;// the declaration of two integer variable 
        for(row =1; row<= 5; row++){// for loop statement that couse condition to repeat
            for(colmn = 1; colmn <= row; colmn++){// foor loop number two that will be executed if for loop one is true
                System.out.print("*");// this line will display star(*)
                
            }
             System.out.println();// this line will end a line each time when 5 column ends
            
        }
       
    
    }
}
