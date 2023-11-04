   class finding {
    public double calculate(double p, double t, double rate){
        return p*t*rate;
    }
    
}
 public class find {
    public static void main(String[] args) {
        finding myfinding= new finding();
        double result;
        result= myfinding.calculate(100000,5,0.05);
        System.out.println("the simple interest of Mr Bob is: " + result);
    }
}
