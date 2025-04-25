// Mendeklarasikan package bernama SESI_2.Mobil
package SESI_2.Mobil;

// Membuat kelas Mobil
class Mobil {
    // Mendeklarasikan atribut/variabel instance bernama 'merk' bertipe String
    String merk;

    // Constructor kelas Mobil untuk menginisialisasi atribut 'merk'
    Mobil(String merk) {
        // 'this.merk' merujuk pada atribut kelas, sedangkan 'merk' adalah parameter
        this.merk = merk;
    }

    // Method untuk menampilkan nilai atribut 'merk'
    void tampilkan() {
        // Mencetak nilai atribut 'merk' ke console
        System.out.println("Merk Mobil: " + merk);
    }
}

// Kelas utama yang berisi method main
public class Main {
    // Method utama yang akan dieksekusi pertama kali saat program dijalankan
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil dengan merk "Toyota"
        Mobil m = new Mobil("Toyota");
        // Memanggil method 'tampilkan' untuk mencetak merk mobil
        m.tampilkan();
    }
}