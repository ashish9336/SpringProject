import java.util.Scanner;

public class LearnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*for (int i =1;i<=10;i++)
        {
            System.out.println(n+" * "+i+"="+n*i);
        }*/
        //1+2+3+4+5=15;
       /* int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Natural of sum Number"+sum);*/
        //Natural Number of avg
        /*int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Natural nuber of avg= "+sum/n);*/

        //even number multiple
        int sum =0;
        for(int i=1;i<=n;i++){
//            sum=sum+2*i;
            sum+=2*i;
        }
        System.out.println("Even number of multiple  ="+sum
        );

    }
}
