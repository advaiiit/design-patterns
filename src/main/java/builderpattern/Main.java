package builderpattern;

public class Main {

  public static void main(String[] args) {
//    Problem: We have to pass 5 parameters in the correct sequence
    Phone phone = new Phone("Android", "Qualcomm", 5.5, 4000, 48);
    System.out.println(phone);

//     Builder Pattern: Every setter returns the object of itself and a method which returns the required object.
//    No need to pass all parameters and correct sequence is not required
    Phone phone1 = new PhoneBuilder().setOs("iOS").setProcessor("A12").setScreenSize(6).getPhone();
    System.out.println(phone1);

  }
}
