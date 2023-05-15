
package pakaian;

class Kemeja extends Pakaian {
    String jenisKancing;

    public Kemeja(String bahan, String warna, int ukuran, String jenisKancing) {
        super(bahan, warna, ukuran);
        this.jenisKancing = jenisKancing;
    }

    // Overriding method display() pada kelas Pakaian
    @Override
    void display() {
        System.out.println("Kemeja");
        super.display();
        System.out.println("Jenis Kancing: " + jenisKancing);
    }

    // Overloading method display() pada kelas Kemeja
    void display(String type) {
        System.out.println("Kemeja " + type);
        super.display();
        System.out.println("Jenis Kancing: " + jenisKancing);
    }
}

    