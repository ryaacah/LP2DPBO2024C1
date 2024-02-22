import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Baju> listbarang = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Data yang ingin anda input : ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        int maxIDLength = 3; // Inisialisasi panjang maksimum untuk ID
        int maxNamaLength = 4; // Inisialisasi panjang maksimum untuk nama
        int maxBranLength = 4; // Inisialisasi panjang maksimum untuk brand
        int maxHargaLength = 5; // Inisialisasi panjang maksimum untuk harga
        int maxUkuranLength = 6; // Inisialisasi panjang maksimum untuk ukuran
        int maxBahanLength = 5; // Inisialisasi panjang maksimum untuk bahan
        int maxGenderLength = 6; // Inisialisasi panjang maksimum untuk gender
        int maxWarnaLength = 5; // Inisialisasi panjang maksimum untuk warna
        int maxTipeLength = 4; // Inisialisasi panjang maksimum untuk tipe

        // Memproses input untuk setiap data
        for(int i = 0; i < n; i++) {
            System.out.println("Masukkan detail untuk produk " + (i + 1) + ":\n");
            System.out.println("Masukkan ID :");
            String ID = sc.next();
            System.out.println("Masukkan Nama :");
            String nama = sc.next();
            System.out.println("Masukkan Brand :");
            String bran = sc.next();
            System.out.println("Masukkan Harga :");
            String harga = sc.next();
            System.out.println("Masukkan Ukuran :");
            String ukuran = sc.next();
            System.out.println("Masukkan Bahan :");
            String bahan = sc.next();
            System.out.println("Masukkan Gender :");
            String gender = sc.next();
            System.out.println("Masukkan Warna :");
            String warna = sc.next();
            System.out.println("Masukkan Tipe Lengan :");
            String tipe = sc.next();

            // Update panjang maksimum jika diperlukan
            maxIDLength = Math.max(maxIDLength, ID.length());
            maxNamaLength = Math.max(maxNamaLength, nama.length());
            maxBranLength = Math.max(maxBranLength, bran.length());
            maxHargaLength = Math.max(maxHargaLength, harga.length());
            maxUkuranLength = Math.max(maxUkuranLength, ukuran.length());
            maxBahanLength = Math.max(maxBahanLength, bahan.length());
            maxGenderLength = Math.max(maxGenderLength, gender.length());
            maxWarnaLength = Math.max(maxWarnaLength, warna.length());
            maxTipeLength = Math.max(maxTipeLength, tipe.length());

            // Membuat objek Baju baru untuk setiap produk
            Baju baju = new Baju();
            baju.setID(ID);
            baju.setnama(nama);
            baju.setbran(bran);
            baju.setharga(harga);
            baju.setukuran(ukuran);
            baju.setbahan(bahan);
            baju.setgender(gender);
            baju.setwarna(warna);
            baju.settipe(tipe);

            listbarang.add(baju);
        }

        // Menampilkan tabel
        // System.out.println("============================================================================================================================================");
        System.out.printf("| %-"+ (maxIDLength + 2) + "s| %-"+ (maxNamaLength + 2) + "s| %-"+ (maxBranLength + 2) + "s| %-"+ (maxHargaLength + 2) + "s| %-"+ (maxUkuranLength + 2) + "s| %-"+ (maxBahanLength + 2) + "s| %-"+ (maxGenderLength + 2) + "s| %-"+ (maxWarnaLength + 2) + "s| %-"+ (maxTipeLength + 2) + "s|\n", "ID", "Nama", "Brand", "Harga", "Ukuran", "Bahan", "Gender", "Warna", "Tipe");
        // System.out.println("============================================================================================================================================");
        for(Baju baju : listbarang) {
            System.out.printf("| %-"+ (maxIDLength + 2) + "s| %-"+ (maxNamaLength + 2) + "s| %-"+ (maxBranLength + 2) + "s| %-"+ (maxHargaLength + 2) + "s| %-"+ (maxUkuranLength + 2) + "s| %-"+ (maxBahanLength + 2) + "s| %-"+ (maxGenderLength + 2) + "s| %-"+ (maxWarnaLength + 2) + "s| %-"+ (maxTipeLength + 2) + "s|\n", baju.getID(), baju.getnama(), baju.getbran(), baju.getharga(), baju.getukuran(), baju.getbahan(), baju.getgender(), baju.getwarna(), baju.gettipe());
        }
        // System.out.println("============================================================================================================================================");

        sc.close();
    }
}
