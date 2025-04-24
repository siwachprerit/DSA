interface Phone {
    void powerOn();
    void powerOff();
    void osType();
    void displayBrand();
}

class AndroidPhone implements Phone {
    String brand;

    AndroidPhone(String brand) {
        this.brand = brand;
    }

    @Override
    public void powerOn() {
        System.out.println(brand + " is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println(brand + " is shutting down...");
    }

    @Override
    public void osType() {
        System.out.println(brand + " runs on Android OS.");
    }

    @Override
    public void displayBrand() {
        System.out.println("Phone brand: " + brand);
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new AndroidPhone("Samsung Galaxy");
        myPhone.displayBrand();
        myPhone.powerOn();
        myPhone.powerOff();
        myPhone.osType();
    }
}