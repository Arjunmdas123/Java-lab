
import java.util.Scanner;

class ComplexNumber {

	int real;
	int image;

	public ComplexNumber(int r, int i) {

		this.real = r;
		this.image = i;
	}

	public void display(String s) {

		System.out.println("The " + s + " complex Number is : " + this.real + " +i" + this.image);

	}

	public static ComplexNumber add(ComplexNumber k, ComplexNumber p) {
		ComplexNumber r = new ComplexNumber(0, 0);
		r.real = k.real + p.real;
		r.image = k.image + p.image;
		return r;
	}

	public static void main(String[] args) {

		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 Complex Number");
		System.out.println("Enter the real part : ");
		m = sc.nextInt();
		System.out.println("Enter the imaginary part : ");
		n = sc.nextInt();
		ComplexNumber c1 = new ComplexNumber(m, n);

		
		System.out.println("Enter the 2 Complex Number");
		System.out.println("Enter the real part : ");
		m = sc.nextInt();
		System.out.println("Enter the imaginary part : ");
		n = sc.nextInt();
		ComplexNumber c2 = new ComplexNumber(m, n);

		ComplexNumber res = add(c1, c2);

		c1.display("First");
		c2.display("Second");
		res.display("Result");
	}

}
