package arrays;

public class BasicOfArray {
    public static void main(String[] args) {
        /*int age[]; //declaration
        age= new int[5];//memory allocation
        */
        /*int age[]= new int[5];
        age[0]=5;
        age[1]=2;
        age[2]=3;
        age[3]=10;
        System.out.println(age[0]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        System.out.println(age.length);*/
        //direct store Array
        /*int marks[]={98,45,60,80};
        System.out.println(marks[3]);
        */
        String names[]={"Ram","shayam","karan","Montey"};
       /* for (int i=0;i< name.length;i++){
            System.out.println("all names="+name[i]);
        }*/
        for(String name:names){
            System.out.println(names);
        }




    }
}
