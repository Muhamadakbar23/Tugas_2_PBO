// Mendeklarasikan package bernama Sepatu
package Sepatu;

// Membuat kelas Sepatu
class Sepatu {
    // Mendeklarasikan atribut/variabel instance bernama 'merk' bertipe String
    String merk;

    // Constructor kelas Sepatu untuk menginisialisasi atribut 'merk'
    Sepatu(String merk) {
        // 'this.merk' merujuk pada atribut kelas, sedangkan 'merk' adalah parameter
        this.merk = merk;
    }

    // Method untuk menampilkan nilai atribut 'merk'
    void tampilkan() {
        // Mencetak nilai atribut 'merk' ke console
        System.out.println("Merk Sepatu: " + merk);
    }
}

// Kelas utama yang berisi method main
public class Main {
    // Method utama yang akan dieksekusi pertama kali saat program dijalankan
    public static void main(String[] args) {
        // Membuat objek dari kelas Sepatu dengan merk "Nike"
        Sepatu s = new Sepatu("Nike");
        // Memanggil method 'tampilkan' untuk mencetak merk sepatu
        s.tampilkan();
    }
}
