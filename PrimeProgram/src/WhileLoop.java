import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }*/
        Scanner sc = new Scanner(System.in);
        /*boolean hasLearn=false;
        while (!hasLearn){
            System.out.println("Went to School , tried to learn");
            System.out.println("Have you understood ?");
            hasLearn=sc.nextBoolean();
        }*/
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
            System.out.println("out of loop");


    }
}
