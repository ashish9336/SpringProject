package LearnString;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name");
        String firstName=sc.nextLine();
        System.out.println("Enter the second Name");
        String secondName=sc.nextLine();
        System.out.println("full Name="+firstName+" "+secondName)*/;

//        String name="   AshiSH123   ";
        // System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trFim());
//        System.out.println("carpet".startsWith("car"));
//        System.out.println("Carpet".endsWith("pet"));
//        System.out.println("Carpet".equals("Carpet"));
        /* char temp="Carpet".charAt(4);
        System.out.println(temp);*/
//     ==================
        /*//valueOf-this method int,float,double to change String
        int age=123;
        String strAge=String.valueOf(age);
        System.out.println(strAge+2);
        System.out.println(age+2);*/

        //replace()-rplace is String .
        /*String str= "I love java, Java is good Language";
        String newStr=str.replace("java","Python");
        System.out.println(str);
        System.out.println(newStr);
        System.out.println(str.contains("good"));*/
//        ====================
      //Substring()=where are staring and where ending between word (2, 4);
        /*String str= "I love java, Java is good Language";
        String substring=str.substring(2); //end evalue -1 search(give 5 index but take 4 index)
//        System.out.println(substring);//count space in String
        System.out.println(substring);

        //split()=space and ,
       String words[]= str.split(" ");
       for(String word:words)
       {
           System.out.println(word);
       }*/
//       ================
//        toCharArray() =toCharArray this method string to charArray convert charArray.
         /*String colors="BROAN is my favorite color";
         char latters[]  =colors.toCharArray();
         for (char latter:latters){
             System.out.println(latter);
         }*/
        //isEmpty()-chech emty or not
        String animal="saldfk";
       if(animal.isEmpty()){
           System.out.println("empty");
       }else {
           System.out.println("this is not empty");
       }

    }
}
