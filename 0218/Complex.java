import java.lang.Math;
class Complex {

  double real, imag;

  Complex(double r, double i) {
    this.real = r;
    this.imag = i;
  }

  Double abs() {
    return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
  }

  void add(Complex c) {
    this.real += c.real;
    this.imag += c.imag;
  }

  void sub(Complex c) {
    this.real = this.real - c.real;
    this.imag = this.imag - c.imag;
  }

  void mul(Complex c) {
    this.real = (this.real*c.real - this.imag*c.imag);
    this.imag = (this.imag*c.imag - this.imag*c.real);
  }

  public static void main(String[] args) {

    Complex c1 = new Complex(3,-3);
    Complex c2 = new Complex(-3, 3);

    double res = c1.abs();
    System.out.println(res);

    c1.add(c2);
    System.out.println("Res of add is " + c1.real + " " + c1.imag);

    c1.sub(c2);
    System.out.println("Res of sub is " +c1.real + " " + c1.imag);

    c1.mul(c2);
    System.out.println("Res mult add is " + c1.real + " " + c1.imag);
  }
}
