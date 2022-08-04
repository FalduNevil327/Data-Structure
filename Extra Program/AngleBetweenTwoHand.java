import java.util.*;
public class AngleBetweenTwoHand{
    public static void main(String[ ] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Hour And Minute : ");

        int h = s.nextInt();
        int m = s.nextInt();

        double angle= ((30*h)+(m*0.5))-(m*60);

        if(angle<0){
            angle = (m*6) - ((30*h)-(m*0.5));
        }

        System.out.println(+angle);
    }
}