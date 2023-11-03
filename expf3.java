public class expf3 {// this line show class name
    public static void main(String arg[]){// this is like library that tell compiler the definition of keywords that are used in java
        int a,sum=0;// declaration of two interger variable
        for(a=10;a<=30;a++){// for loop statement that will cause condition to repeat 
            if(a%2==0){// condition that will tell computer to only add even numbers between 10 to 30
                sum=sum+a;// line that add even number between 10 and 30
            }
        }
        System.out.println("the sum of even numbers between 10 and 30 are: ");// this line will output the words that are in quatation

        System.out.println(sum);// the line that will show the value that are in sum

    }
    
}
