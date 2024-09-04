package arrays;

public class ProblemOfArrays {
    public static void main(String[] args) {
//        int numbers[]={23,12,6,7,15,3,2,56};
       // int sum=0;
        //for each
        /*for (int number:numbers){
            sum+=number;
        }
        System.out.println("Total number of sum "+sum);*/

        //for loop
        /*for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        System.out.println("Total number of sum"+sum);
        */
       // System.out.println(Integer.MAX_VALUE);
//        int numbers[]={23,12,6,7,15,3,2,56};
//         int min =Integer.MAX_VALUE;
//        for (int number:numbers){
//            if(number<min){   // 23<222222,12<23,6<12,7<6, 15<6,3<6,2<3,2<56
//                min=number;  //23,12,6,6,6,3,2,2
//            }
//        }
//        System.out.println(min);
//        int numbers[]={23,12,6,7,15,3,2,56};
//        int min =Integer.MAX_VALUE;
//        for (int i=0;i<numbers.length;i++){
//            if (numbers[i]<min){
//                min=numbers[i];
//            }
//        }
//        System.out.println("Minimum Number="+min);
       /* int numbers[]={23,12,6,7,15,3,2,56};
        int max =Integer.MIN_VALUE;
        for (int number:numbers){
            if (number>max){
                max=number;
            }
        }
        System.out.println("Maximum Number="+max);*/
        //2D Array
//        int marks[][]=new int [3][4];
        int marks[][]= {
            {12,98,34}, {12,67,87}, {12,98,23}, {14,67,36}
        };
        System.out.println(marks[2][1]);

    }
}
