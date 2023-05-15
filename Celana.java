
package pakaian;

class Celana extends Pakaian {
    String model;

    public Celana(String bahan, String warna, int ukuran, String model) {
        super(bahan, warna, ukuran);
        this.model = model;
    }

    // Overriding method display() pada kelas Pakaian
    @Override
    void display() {
        System.out.println("Celana");
        super.display();
        System.out.println("Model: " + model);
    }

    // Overloading method display() pada kelas Celana
    void display(String type) {
        System.out.println("Celana " + type);
        super.display();
        System.out.println("Model: " + model);
    }
}

    