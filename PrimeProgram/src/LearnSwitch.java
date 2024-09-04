import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
       /* switch (day){
            case 1:
                System.out.println("Today is sunday");
                break;
            case 2:
                System.out.println("Today is monday");
                System.out.println("Today is monday");
                System.out.println("Today is monday");
                System.out.println("Today is monday");
                break;
            case 3:
                System.out.println("Today is tusaday");
                break;
            default:
                System.out.println("Please Enter the correct day");

*/          int time=10;
           /*if(day>=10){
               if(day<=20)
               {
                   System.out.println("Office is Open");
               }
               else {
                   System.out.println("Office is close");
               }
           }
           else {
               System.out.println("office is close");
           }
*/
        /*if(day >=10 && day<=20){
            System.out.println("Office is Open");
        }
        else{
            System.out.println("Office is close");
        }
*/
        if(day ==12 || day ==18){
            System.out.println("Snacks at  time");
        }
        else {
            System.out.println("time is working in office");
        }

    }
}
