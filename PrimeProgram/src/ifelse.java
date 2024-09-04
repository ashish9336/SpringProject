import java.util.Scanner;

public class ifelse {


    public static void main(String[] args) {
        /*int age =4;
        if(age>=18) {
            System.out.println("you can vote");
            System.out.println("GOOD Morning");
        }
        else {
            System.out.println("you cannot vote");
        }*/
        /*Scanner sc = new  Scanner(System.in);
        int str=sc.nextInt();
       if(str == 1){
           System.out.println("today is sunday");
       } else if (str==2) {
           System.out.println("I went BTM");
       } else if (str==3) {
           System.out.println("I went party");

       } else {
           System.out.println("I got to office");
       }
        System.out.println("I went to somewhere");*/
    //you are given three number. find maximum number
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the third number");
        int c= sc.nextInt();    // a=10.b=20,c=30
        if (a > b) {
            if (a > c) {
                System.out.println("a is the biggest number: " + a);
            } else {
                System.out.println("c is the biggest number: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("b is the biggest number: " + b);
            } else {
                System.out.println("c is the biggest number: " + c);
            }

        }
*/
       /* int a =23;
        int b=5;
        int max=0;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        System.out.println("maximum number:" +max);*/
        int a =10;
        int b=20;
        int c=50;
        int max=a>b?a>c?a : c : b>c?b : c ;
        System.out.println("maximum number:"+max);



    }
}
