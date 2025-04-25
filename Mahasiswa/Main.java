package Mahasiswa; // Mendeklarasikan package bernama Mahasiswa

class Mahasiswa { // Membuat kelas Mahasiswa
    String nama; // Mendeklarasikan atribut/variabel instance bernama 'nama' bertipe String

    Mahasiswa(String nama) { // Constructor kelas Mahasiswa untuk menginisialisasi atribut 'nama'
        this.nama = nama; // 'this.nama' merujuk pada atribut kelas, sedangkan 'nama' adalah parameter
    }

    void perkenalanDiri() { // Method untuk memperkenalkan diri dengan mencetak nama mahasiswa
        System.out.println("Halo, Nama saya " + nama); // Mencetak pesan perkenalan ke console
    }
}

public class Main { // Kelas utama yang berisi method main
    public static void main(String[] args) { // Method utama yang akan dieksekusi pertama kali saat program dijalankan
        Mahasiswa mhs = new Mahasiswa("Budi"); // Membuat objek dari kelas Mahasiswa dengan nama "Budi"
        mhs.perkenalanDiri(); // Memanggil method 'perkenalanDiri' untuk mencetak pesan perkenalan
    }
}
