import java.util.Scanner;

public class UTSSDA_MenuMakanan {

    // FORMAT RUPIAH: 15000 → "15.000"
    static String formatRupiah(int angka) {
        return String.format("%,d", angka).replace(',', '.');
    }

    // TAMPILKAN DAFTAR MENU
    static void tampilkanDaftarMenu(String[] namaMenu, int[] hargaMenu) {
        System.out.println("  --------------------------------");
        System.out.println("       Daftar Menu Makanan       ");
        System.out.println("  --------------------------------");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("  %d. %-7s - Rp %s / porsi%n",
                    (i + 1), namaMenu[i], formatRupiah(hargaMenu[i]));
        }
        System.out.println("  --------------------------------");
    }

    public static void main(String[] args) {

        String[] namaMenu  = {"Soto", "Rawon", "Pecel", "Bakso", "Siomay"};
        int[]    hargaMenu = {15000,  20000,   10000,  12500,   25000};

        Scanner scanner = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("       UJIAN TENGAH SEMESTER ARRAY         ");
        System.out.println("============================================");
        System.out.println("Dosen Pengampu : Alun Sujjada, S.Kom., M.T");
        System.out.println("--------------------------------------------");
        System.out.println("Nama           : Aditya Nanda");
        System.out.println("NIM            : 250401010388");
        System.out.println("Kelas          : IF207");
        System.out.println("============================================\n");

        String konfirmasi;

        do {
            System.out.print("Isikan Makanan yang dipesan : ");
            String inputLine = scanner.nextLine();
            String[] tokens  = inputLine.trim().split("\\s+");

            int     grandTotal        = 0;
            boolean adaMenuTidakValid = false;

            System.out.println("\nTotal Harga :");

            // Konfirmasi input menu
            if (tokens.length % 2 != 0) {
                adaMenuTidakValid = true;
            }

            for (int i = 0; i + 1 < tokens.length; i += 2) {

                String namaPesanan = tokens[i];
                int    jumlah      = Integer.parseInt(tokens[i + 1].replace(".", ""));

                boolean ditemukan = false;

                for (int j = 0; j < namaMenu.length; j++) {
                    if (namaMenu[j].equalsIgnoreCase(namaPesanan)) {
                        int subtotal = hargaMenu[j] * jumlah;
                        System.out.println(" " + namaMenu[j]
                                + " @" + formatRupiah(hargaMenu[j])
                                + " * " + jumlah
                                + " = " + formatRupiah(subtotal));
                        grandTotal += subtotal;
                        ditemukan   = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Maaf, \"" + namaPesanan
                            + "\" tidak tersedia dalam menu kami.");
                    adaMenuTidakValid = true;
                }
            }

            System.out.println("Total = " + formatRupiah(grandTotal));

            if (adaMenuTidakValid) {
                System.out.println("\nSilakan simak pilihan menu kami berikut ini :");
                tampilkanDaftarMenu(namaMenu, hargaMenu);
            }

            System.out.print("\nInput data baru? (Y/T) : ");
            konfirmasi = scanner.nextLine().trim();
            System.out.println();

        } while (konfirmasi.equalsIgnoreCase("Y"));

        System.out.println("============================================");
        System.out.println("       Terima kasih telah menggunakan       ");
        System.out.println("          Program Menu Makanan ini!         ");
        System.out.println("        Semoga harimu menyenangkan :)       ");
        System.out.println("============================================");

        scanner.close();
    }
}