
import java.util.Scanner;

public class Third {
    
    public static class Complex
    {
        int real;
        int imag;

        public Complex() {
            this.real=0;
            this.imag=0;
        }

        public Complex(int real,int imag)
        {
            this.real=real;
            this.imag=imag;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Complex Number");
        Complex c1=new Complex(sc.nextInt(),sc.nextInt());

        System.out.println("Enter second Complex Number");
        Complex c2=new Complex(sc.nextInt(),sc.nextInt());

        int choice = 0;

        System.out.println("Enter your choice\n1)Add\n2)Subtract\n3)compare");

        while (true) { 

            choice=sc.nextInt();
            

            switch (choice) {
                case 1:System.out.println((c1.real+c2.real)+" i"+(c1.imag+c2.imag));
                break;

                case 2:System.out.println((c1.real-c2.real)+" i"+(c1.imag-c2.imag));
                break;

                case 3:boolean res=(c1.real==c2.real ) && (c1.imag==c2.imag);
                    System.out.println(res);

                break;

                default:System.out.println("Invalid choice");
                break;


               
            }
        }



        
    }
}
