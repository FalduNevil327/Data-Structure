// Write a program to swap two numbers using user-defines method.



public class Swap_Number{
    int x, y;

    public void swap_Number() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Swap_Number obj1 = new Swap_Number();
        obj1.x = 1;
        obj1.y = 2;
        System.out.println("--Before swap--");
        System.out.println(" Value of x: " + obj1.x + "\n value of y : " + obj1.y);
        obj1.swap_Number();
        System.out.println("--after swap--");
        System.out.println(" Value of x: " + obj1.x + "\n value of y : " + obj1.y);
    }
}
    