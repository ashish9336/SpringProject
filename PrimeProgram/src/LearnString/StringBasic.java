package LearnString;

public class StringBasic {
    public static void main(String[] args) {
        /*String name="Anuj";
        String strName="Anuj";
        String sc= new String("Anuj");
        System.out.println(name);
        System.out.println(strName);*/
//        =============
      // check is reference
       /* if(name==strName){
            System.out.println("Both are same");
        }*/
//=======================================

        //1-primitive data type check the value
        //int,double is primitive date type check the value(int a =10;
        // int b =10
         //  if(a==b)?a:b
        //2-string iss non Primitive data type..(non primitive check is references)
        /*if(name==sc){
            System.out.println("Both are same");
        }
        else {
            System.out.println("both are not some");
        }*/
//        ====================================
//    equals()= check tha value
        /*String name="Anuj";
        String strName="Anuj";
        String sc= new String("Anuj");
        if(name.equals(sc)){
            System.out.println("both are equals");
        }else {
            System.out.println("Both are not same");
        }*/
//        ============================================
//        equalsIgnoreCase()- This method is ignore the Casesentive value
        String name="Anuj";
        String strName="Anuj";
        String sc= new String("ANUJ");
        if(name.equalsIgnoreCase(sc)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
        }


    }

}
