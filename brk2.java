public class brk2 {// class name which is called brk2
    public static void main(String arg[]){
        int x, sum=0;// decralation of variables 
        for(x=1;x<=10;x++){// loop statement that will couse condition to repeat
            sum=sum+x;// line that will add numbers between 1 and 10
           System.out.println(sum +"+"+ x +"="+ sum);// this line will show the output to user
           System.out.println(sum);// this line will display the value of sum 
           if(x==7){// this is condition that will help to stop adding numbers when it reach to seven
            break;// statement that will help to stop according to condition

           }
        }

    }
    
}
