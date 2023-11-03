public class brk1 {// class name which is called brk1
    public static void main(String arg[]){// this is like library that tell compiler the definition of keywords that are used in java
        int a;// declaration of one integer variable
        for(a=2;a<=20;a++){// tfor loop statement will cause condition to repeat
            if(a%2==0){// if statement that will check the even number betweeen 2 and 20
                System.out.println(a);// this line will display value of a
                if(a==10){// condition which will tell computer where the break statement will be excuted , when a reach 10 it will stop
                    break;// break statement that will stop when a=10 
                }
            }
        }
    }
    
}
