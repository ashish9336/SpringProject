import java.io.PrintStream;

public class BreakCondicton {
    public static void main(String[] args) {
        /*for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);
            if (i>=10)break;
        }*/
        /*int i=0;
        while (i<=5){
            System.out.println(i);
            i++;
            if(i==3)break;
        }*/
        /*for(int i=1;i<=20;i++){
            if(i==2 || i==8)continue;
            if(i>15)break;
            System.out.println(i);}*/
        /*for (int count = 1; count <=10 ; count++) {
            for (int i = 1; i <6 ; i++) {
                System.out.println(i);
            }
            System.out.println("Printed "+count);
        }*/
       /* for(int i=0;i<8;i++){
            for (int j = 0; j <=i ; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }*/
        outerloop:
        for(int i=0;i<=10;i++){
            int j=0;
            while (j<=5){
                if(j==3)break outerloop;
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }



    }
}
