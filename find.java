   class finding {//creating class finding
    public double calculate(double p, double t, double rate){//method declaration
        return p*t*rate;// returning value of of simple interest
    }
    
}
 public class find {// main class called find
    public static void main(String[] args) {
        finding myfinding= new finding();//object
        double result;// variable declarition
        result= myfinding.calculate(100000,5,0.05);// calling method
        System.out.println("the simple interest of Mr Bob is: " + result);// display simple interest
    }
}
