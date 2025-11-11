package aplikasiresep;

import resep.Resep;
import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiResepMasakan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Resep> daftarResep = new ArrayList<>();

        while (true) {
            System.out.println("\n=== APLIKASI RESEP MASAKAN ===");
            System.out.println("1. Tambah Resep");
            System.out.println("2. Lihat Semua Resep");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // biar nggak nyangkut

            if (pilihan == 1) {
                System.out.print("Nama masakan: ");
                String nama = input.nextLine();
                System.out.print("Bahan-bahan: ");
                String bahan = input.nextLine();
                System.out.print("Langkah-langkah: ");
                String langkah = input.nextLine();

                daftarResep.add(new Resep(nama, bahan, langkah));
                System.out.println("✅ Resep berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.println("\n--- Daftar Resep ---");
                for (Resep r : daftarResep) {
                    System.out.println("Nama: " + r.getNama());
                    System.out.println("Bahan: " + r.getBahan());
                    System.out.println("Langkah: " + r.getLangkah());
                    System.out.println("--------------------");
                }
                if (daftarResep.isEmpty()) {
                    System.out.println("(Belum ada resep)");
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}

