public class inheritannceassign {
    public static void main(String[] args) {
        A mywork= new A();
        mywork.find();
        mywork.display();
        mywork.calculate();
        mywork.interfacetest();
        mywork.show(); 
        
    }}
    class D{
        float radius=4;
        double pi=3.14;
        public void find(){
        double area=radius*radius*pi;
        System.out.println(area);
        }
    
    }
    class C extends D{
        public static void display(){
            System.out.println("the above number is area of circle");
        }
    }
    class B extends C{
        public static void calculate(){
            int radius=6;
            double pi=3.14;
            double circumference=(radius*2)*pi;
            System.out.println(circumference);
    
        }
    }
    interface E {
         void interfacetest();
    }
    class A extends B implements E{
        public  void show(){
            
        System.out.println(radius*radius*3.14);
        }
        public void interfacetest(){
    
    System.out.println("This is Interface's method");
    }
    }
    

