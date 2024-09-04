package constructionLearn;

public class Construction_First {
    public static void main(String[] args) {
    Complex num1= new Complex(3);
    Complex num2= new Complex(4,1);
     num1.print();
     num2.print();
    }

}
class Complex {
    int a; // Real part
    int b; // Imaginary part
//Constructor
    Complex(int real){
        this.a=real;
        b=12;
    }

    // Constructor
    Complex(int real, int imaginary) {
        this.a = real;
        this.b = imaginary;
    }

    // Method to print the complex number
    void print() {
        // Handling the sign of the imaginary part
        if (b >= 0) {
            System.out.println(a + "+" + b + "i");
        } else {
            System.out.println(a + "" + b + "i");
        }
    }
}