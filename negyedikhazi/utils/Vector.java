package negyedikhazi.utils;

public class Vector {
  double[] array;

  public Vector(double[] inputArray) {
    this.array = new double[inputArray.length];

    for (int i = 0; i < inputArray.length; i++)
      this.array[i] = inputArray[i];
  }

  public double multiplyArray(double [] arrayToMultiply) {

    if(this.array.length != arrayToMultiply.length)
      throw new IllegalArgumentException("Arrays have different sizes");

    double sum = 0;
    for (int i = 0; i < this.array.length; i++)
      sum += this.array[i] * arrayToMultiply[i];

    return sum;
  }

  public void multByScalar(double n) {
    for (int i = 0; i < this.array.length; i++)
      this.array[i] *= n;
  }

  public void addArray(double [] arrayToAdd) {

    if(this.array.length != arrayToAdd.length)
      throw new IllegalArgumentException("Arrays have different sizes");

    for (int i = 0; i < this.array.length; i++)
      this.array[i] += arrayToAdd[i];
  }

  public void subtractArray(double [] arrayToSubtract) {

    if(this.array.length != arrayToSubtract.length)
      throw new IllegalArgumentException("Arrays have different sizes");

    for (int i = 0; i < this.array.length; i++)
      this.array[i] -= arrayToSubtract[i];
  }
  public String toString() {
    String str = "";
    for (int i = 0; i < this.array.length; i++)
      str += this.array[i] + " ";
    return str;
  }
}