public class IntegerMatrix {

  private int rowNumber;
  private int colNumber;
  private int [][] data;

  public IntegerMatrix(int rows, int cols, int[] lineardata) {
    if (rows*cols != lineardata.length) throw new IllegalArgumentException("Incorrect dimensions");
    for (int i = 0; i < lineardata.length; i++) {
      int col = i % colNumber;
      int row = (int)Math.floor(i/colNumber);
      data[row][col] = lineardata[i];
    }
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < rowNumber; i++) {
      for (int j = 0; j < colNumber; j++) {
        sb.append(this.data[i][j]).append(", ");
      }
      sb.append(";");
    }
    return sb.toString();
  }
}