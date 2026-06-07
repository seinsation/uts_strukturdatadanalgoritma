import java.util.Stack;

public class UTSSDA_RiwayatPasien {
    // Method untuk mengecek apakah dua riwayat pasien Sama
    public static boolean isEqual(Stack<String> s1, Stack<String> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }

        Stack<String> temp1 = (Stack<String>) s1.clone();
        Stack<String> temp2 = (Stack<String>) s2.clone();

        while (!temp1.isEmpty()) {
            String tindakan1 = temp1.pop();
            String tindakan2 = temp2.pop();
            if (!tindakan1.equals(tindakan2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Buat 5 stack untuk 5 pasien
        Stack<String> pasien1 = new Stack<>();
        Stack<String> pasien2 = new Stack<>();
        Stack<String> pasien3 = new Stack<>();
        Stack<String> pasien4 = new Stack<>();
        Stack<String> pasien5 = new Stack<>();

        // Riwayat pasien 1
        pasien1.push("Registrasi");
        pasien1.push("Cek Tekanan Darah");
        pasien1.push("Pemeriksaan Dokter");
        pasien1.push("Pemberian Obat");

        // Riwayat pasien 2
        pasien2.push("Registrasi");
        pasien2.push("Cek Tekanan Darah");
        pasien2.push("Pemeriksaan Dokter");
        pasien2.push("Pemberian Obat");

        // Riwayat pasien 3
        pasien3.push("Registrasi");
        pasien3.push("Cek Tekanan Darah");
        pasien3.push("Pemeriksaan Dokter");
        pasien3.push("Laboratorium");
        pasien3.push("Pemberian Obat");

        // Riwayat pasien 4
        pasien4.push("Registrasi");
        pasien4.push("Cek Tekanan Darah");
        pasien4.push("Pemeriksaan Dokter");
        pasien4.push("Pemberian Obat");

        // Riwayat pasien 5
        pasien5.push("Registrasi");
        pasien5.push("Cek Tekanan Darah");
        pasien5.push("Pemeriksaan Dokter");
        pasien5.push("Laboratorium");
        pasien5.push("Pemberian Obat");

        // Perbandingan antar pasien
        System.out.println("Pasien 1 vs Pasien 2: " + (isEqual(pasien1, pasien2) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 1 vs Pasien 3: " + (isEqual(pasien1, pasien3) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 1 vs Pasien 4: " + (isEqual(pasien1, pasien4) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 1 vs Pasien 5: " + (isEqual(pasien1, pasien5) ? "Sama" : "Berbeda"));

        System.out.println("Pasien 2 vs Pasien 3: " + (isEqual(pasien2, pasien3) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 2 vs Pasien 4: " + (isEqual(pasien2, pasien4) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 2 vs Pasien 5: " + (isEqual(pasien2, pasien5) ? "Sama" : "Berbeda"));

        System.out.println("Pasien 3 vs Pasien 4: " + (isEqual(pasien3, pasien4) ? "Sama" : "Berbeda"));
        System.out.println("Pasien 3 vs Pasien 5: " + (isEqual(pasien3, pasien5) ? "Sama" : "Berbeda"));

        System.out.println("Pasien 4 vs Pasien 5: " + (isEqual(pasien4, pasien5) ? "Sama" : "Berbeda"));
    }
}
