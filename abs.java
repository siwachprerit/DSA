abstract class Phone {
    String brand;
    Phone(String brand) {
        this.brand = brand;
    }
    void displayBrand() {
        System.out.println("Phone brand: " + brand);
    }
    abstract void powerOn();
    abstract void powerOff();
    abstract void osType();
}
class AndroidPhone extends Phone {
    AndroidPhone(String brand) {
        super(brand);
    }
    @Override
    void powerOn() {
        System.out.println(brand + " is powering on...");
    }
    @Override
    void powerOff() {
        System.out.println(brand + " is shutting down...");
    }
    @Override
    void osType() {
        System.out.println(brand + " runs on Android OS.");
    }
}
public class abs {
    public static void main(String[] args) {
        Phone myPhone = new AndroidPhone("Samsung Galaxy");
        myPhone.displayBrand();
        myPhone.powerOn();
        myPhone.powerOff();
        myPhone.osType();
    }
}