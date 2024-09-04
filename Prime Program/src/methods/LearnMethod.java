package methods;



public class LearnMethod {
    public static void main(String[] args) {
//     LearnMethod as= new LearnMethod();
//     as.greet();
        System.out.println(1);
        System.out.println(2);
//        greet();
        avg(10,20,false);
        int avgDOSome= avg(2,13,true);
        double avgDouble=avgDOSome *2;
        System.out.println(avgDouble);

        avg(2,7,true);
    }

     static void greet(){
         System.out.println(5);
        System.out.println("Hi, how are you");
         System.out.println(6);
    }

    public static int avg(int a,int b,boolean shoudAvg){
        int avarge =(a+b)/2;
//        System.out.println("Two Number Of averege="+avarge);
        return avarge;
    }
}
