package pakaian;

class Pakaian {
    String bahan;
    String warna;
    int ukuran;

    public Pakaian(String bahan, String warna, int ukuran) {
        this.bahan = bahan;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    void display() {
        System.out.println("Bahan: " + bahan);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
    }
}

