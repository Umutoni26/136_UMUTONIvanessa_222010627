 class comp {// creating class student
    public double cal(double p,double t, double rate, double n){//method declaration
       double amount;// variable declaration that will contain result
       amount=p*(Math.pow((1+rate/n),t*n));// formula to find compound interest
     

        return amount;// this line return the value of compound interest
    }
    
}
public class compound{// another class called compount on main
    public static void main(String[] args) {
        comp mycomp= new comp();//create object
        double result;// variable declaration
        result= mycomp.cal(500000,3,0.18,12);// calling method
        System.out.println(" after 3 years Mr Bob will pay: " +result);// displaying result
       
        
    }
}
