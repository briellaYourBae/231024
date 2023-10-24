// Class utama
public class allin {
    public static void main(String[] args) {
        // Membuat objek persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
    }
}

// Class bentuk geometri (superclass)
class BentukGeometri {
    // Konstruktor
    public BentukGeometri() {
    }

    // Method hitungLuas (akan di-override oleh subclass)
    public double hitungLuas() {
        return 0;
    }
}

// Subclass Persegi (inheritance)
class Persegi extends BentukGeometri {
    private double sisi;

    // Konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

// Subclass Lingkaran (inheritance)
class Lingkaran extends BentukGeometri {
    private double jariJari;

    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}