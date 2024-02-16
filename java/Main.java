import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Barang> listbarang = new ArrayList<Barang>();
        Scanner sc = new Scanner(System.in);

        String ID, nama, bran, harga, ukuran, bahan, gender, warna, tipe;

        System.out.println("Masukkan Jumlah Data yang ingin anda input : ");
        int n;
        n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data");
            String[] input = sc.nextLine().split(" ");

            ID = input[0];
            nama = input[1];
            bran = input[2];
            harga = input[3];
            ukuran = input[4];
            bahan = input[5];
            gender = input[6];
            warna = input[7];
            tipe = input[8];
            Barang temp = new Barang(ID, nama, bran, harga, ukuran, bahan, gender, warna, tipe);
            listbarang.add(temp);
        }

        // Menentukan lebar kolom
        int maxID = 0, maxNama = 0, maxbran = 0, maxHarga = 0, maxUkuran = 0, maxBahan = 0, maxGender = 0, maxWarna = 0, maxTipe = 0;
        for (Barang barang : listbarang) {
            maxID = Math.max(maxID, barang.getID().length());
            maxNama = Math.max(maxNama, barang.getnama().length());
            maxbran = Math.max(maxbran, barang.getbran().length());
            maxHarga = Math.max(maxHarga, barang.getharga().length());
            maxUkuran = Math.max(maxUkuran, barang.getukuran().length());
            maxBahan = Math.max(maxBahan, barang.getbahan().length());
            maxGender = Math.max(maxGender, barang.getgender().length());
            maxWarna = Math.max(maxWarna, barang.getwarna().length());
            maxTipe = Math.max(maxTipe, barang.gettipe().length());
        }

        // Mencetak header tabel
        System.out.printf("%-" + (maxID + 5) + "s%-"
                + (maxNama + 5) + "s%-"
                + (maxbran + 5) + "s%-"
                + (maxHarga + 5) + "s%-"
                + (maxUkuran + 5) + "s%-"
                + (maxBahan + 5) + "s%-"
                + (maxGender + 5) + "s%-"
                + (maxWarna + 5) + "s%-"
                + (maxTipe + 5) + "s%n", "ID", "Nama", "bran", "Harga", "Ukuran", "Bahan", "Gender", "Warna", "Tipe");

        // Mencetak isi tabel
        for (Barang barang : listbarang) {
            System.out.printf("%-" + (maxID + 5) + "s%-"
                    + (maxNama + 5) + "s%-"
                    + (maxbran + 5) + "s%-"
                    + (maxHarga + 5) + "s%-"
                    + (maxUkuran + 5) + "s%-"
                    + (maxBahan + 5) + "s%-"
                    + (maxGender + 5) + "s%-"
                    + (maxWarna + 5) + "s%-"
                    + (maxTipe + 5) + "s%n",
                    barang.getID(), barang.getnama(), barang.getbran(), barang.getharga(), barang.getukuran(), barang.getbahan(), barang.getgender(), barang.getwarna(), barang.gettipe());
        }
    }
}
