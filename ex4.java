// this program will the biggest weight between 4 weight we have, it is going to use nested IF

public class ex4 {
public static void main(String args[]){
    int wA=20;
    int wB=30;
    int wC=25;
    int wD= 40;
     
    if( wA>wB && wA>wC && wA>wD ){// this line will check if wA is the beggest among the 4
        System.out.println(" wA is big");// the message if condition is true
    }
    else if(wB>wA && wB>wC && wB>wD){//this line will check if wB is the beggest among the 4
        System.out.println(" wB is big");//the message if condition is true

    }
    else if(wC>wA && wC>wB && wC>wD){//this line will check if wC is the beggest among the 4
        System.out.println(" wC is big");//the message if condition is true
    }
    else if(wD>wA && wD>wB && wD>wC){//this line will check if wD is the beggest among the 4
        System.out.println("wD is big");//the message if condition is true
    }

}
    
}
