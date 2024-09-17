package oops3.package2;

import oops3.learnPackages.Teacher;

public class MainInPackage2 extends Teacher {
    public static void main(String[] args) {
        Teacher obj2 = new Teacher();
        obj2.teachingClass=4;
//        obj2.id = 123;
        /*degree' is not public in 'oops3.learnPackages.Teacher'. Cannot be accessed from outside package
        obj2.degree="PHD";*/
        MainInPackage2 m1 = new MainInPackage2();
          m1.studentsCount=24;






    }
}
