public class expw6 {// line that show the class name
    public static void main(String[] arg) { // this is like library that tell compiler the definition of keywords that are used in java 
        int a=1,product=1;  // declaration and initialization of two integer variable 
        while(a<=10){  // while statement that show condtion
            if(a%2==1){// is statement that test if entered number are odd
                product=product*a;// line that will give product of odd numbers
              
            }
              a++;// this line will increment a
              
        }  
        System.out.println("the product of odd numbers between 1 and 10 are: " );//this line will output the words that are in quatation
        System.out.println(product);// tthis line will output the value of product
    }  
    }  
    

