package exercises.technology;

public class Program {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(1024, "arm", 2048, "Verizon");
        Laptop laptop = new Laptop(2048, "Intel i7", 200000, 17.5);

        System.out.println(phone.toString());
        System.out.println(laptop.toString());
    }
}
