package pakaian;
/**
 *
 * @author Asus
 */
class Kaos extends Pakaian {
    String model;

    public Kaos(String bahan, String warna, int ukuran, String model) {
        super(bahan, warna, ukuran);
        this.model = model;
    }

    // Overriding method display() pada kelas Pakaian
    @Override
    void display() {
        System.out.println("Kaos");
        super.display();
        System.out.println("Model: " + model);
    }

    // Overloading method display() pada kelas Kaos
    void display(String type) {
        System.out.println("Kaos " + type);
        super.display();
        System.out.println("Model: " + model);
    }
}
