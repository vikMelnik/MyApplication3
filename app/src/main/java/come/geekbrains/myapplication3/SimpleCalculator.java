package come.geekbrains.myapplication3;

public class SimpleCalculator {

  private String textField;
  private double numOne;
  private double numTwo;

  public double getNumOne() {
    return numOne;
  }

  public void setNumOne(double numOne) {
    this.numOne = numOne;
  }

  public double getNumTwo() {
    return numTwo;
  }

  public void setNumTwo(double numTwo) {
    this.numTwo = numTwo;
  }

  public SimpleCalculator() {
    textField = "0";

  }

  public void calculate(int id){

    switch (id) {
      case (R.id.button_0):
        textField = "0";
        break;
      case (R.id.button_1):
        textField = "1";
        break;
      case (R.id.button_2):
        textField = "2";
        break;
      case (R.id.button_3):
        textField = "3";
        break;
      case (R.id.button_4):
        textField = "4";
        break;
      case (R.id.button_5):
        textField = "5";
        break;
      case (R.id.button_6):
        textField = "6";
        break;
      case (R.id.button_7):
        textField = "7";
        break;
      case (R.id.button_8):
        textField = "8";
        break;
      case (R.id.button_9):
        textField = "9";
        break;
      case (R.id.butt_point):
        textField = ".";//???????
        break;
    }
  }

  @Override
  public String toString() {
    return textField;
  }
}
