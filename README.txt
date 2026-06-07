Ujian Tengah Semester (UTS)
===========================================================================================================

Mata Kuliah		:	Struktur Data dan Algoritma
Dosen Pengampu	:	Alun Sujjada, S.Kom., M.T

===========================================================================================================

Nama			:	Aditya Nanda
NIM				:	250401010388
Kelas			:	IF207

===========================================================================================================
===========================================================================================================

Soal Ujian Tengah Semester Nomor 2 (Array)
Representasikan data berikut kedalam bentuk Program JAVA menggunakan array:
Menu makanan :
*	Soto : 15.000
*	Rawon : 20.000
*	Pecel : 10.000
*	Bakso : 12.500
*	Siomay : 25.000

Dari data tersebut program akan menerima input berupa nama makanan yang akan dipesan
dan jumlah porsi, dimana setiap orang boleh memesan makanan lebih dari 1. Program harus
lolos dari beberapa test case seperti contoh berikut ini:

===========================================================================================================

Deskripsi Program

Program ini dibuat untuk memenuhi soal UTS mata kuliah Struktur Data dan Algoritma dengan materi Array.  
Data menu makanan direpresentasikan menggunakan array String (nama menu) dan array Integer (harga menu).

Fitur utama:
- Menampilkan daftar menu makanan beserta harga.  
- Menerima input berupa nama makanan dan jumlah porsi.  
- Menghitung subtotal dan total harga pesanan.  
- Validasi input: menolak menu yang tidak tersedia atau format input yang salah.  
- Menampilkan kembali daftar menu jika ada kesalahan input.

Struktur Data:
- `String[] namaMenu` → menyimpan nama makanan.  
- `int[] hargaMenu` → menyimpan harga makanan.  
- Fungsi `formatRupiah()` → mengubah angka menjadi format rupiah (contoh: 15000 → "15.000").  
- Fungsi `tampilkanDaftarMenu()` → menampilkan daftar menu ke layar.

Cara Menjalankan Program:
1. Pastikan **Java Development Kit (JDK)** sudah terpasang.  
2. Simpan file dengan nama `UTSSDA_MenuMakanan.java`.  
3. Compile program:  
   ```bash
   javac UTSSDA_MenuMakanan.java
   
===========================================================================================================

Contoh Input dan Output

Case 1 (Pesanan Valid)
Input: Soto 2 Rawon 1

Output:
Total Harga :
 Soto @15.000 * 2 = 30.000
 Rawon @20.000 * 1 = 20.000
Total = 50.000

Case 2 (Menu tidak tersedia)
Input: Miso 3

Output:
Maaf, "Miso" tidak tersedia dalam menu kami.
Total = 0

Silakan simak pilihan menu kami berikut ini :
  --------------------------------
       Daftar Menu Makanan       
  --------------------------------
  1. Soto    - Rp 15.000 / porsi
  2. Rawon   - Rp 20.000 / porsi
  3. Pecel   - Rp 10.000 / porsi
  4. Bakso   - Rp 12.500 / porsi
  5. Siomay  - Rp 25.000 / porsi
  --------------------------------

===========================================================================================================
===========================================================================================================
Soal Ujian Tengah Semester Nomor 3 (Stack)

Buatlah program menggunakan bahasa JAVA untuk melakukan pengecekan 2 buah stack memiliki nilai
yang Sama atau tidak.

===========================================================================================================

Deskripsi Program

Program ini dibuat untuk memenuhi soal UTS mata kuliah Struktur Data dan Algoritma dengan materi Stack.  
Data riwayat pasien direpresentasikan menggunakan struktur data Stack, dimana setiap tindakan medis pasien
disimpan secara LIFO (Last In First Out).

Fitur utama:
- Menyimpan riwayat tindakan medis pasien menggunakan Stack.
- Membandingkan riwayat antara beberapa pasien (misalnya pasien 1–5).
- Menampilkan apakah riwayat pasien Sama atau Berbeda.

Struktur Data:
- `Stack<String>` → menyimpan riwayat tindakan pasien.
- Fungsi `isEqual()` → membandingkan dua stack apakah memiliki isi yang Sama.
- Riwayat pasien diisi dengan tindakan medis seperti "Registrasi", "Cek Tekanan Darah", 
  "Pemeriksaan Dokter", dll.

Cara Menjalankan Program:
1. Pastikan **Java Development Kit (JDK)** sudah terpasang.  
2. Simpan file dengan nama `UTSSDA_RiwayatPasien.java`.  
3. Compile program:  
   ```bash
   javac UTSSDA_StackPasien.java
   java UTSSDA_StackPasien
   
===========================================================================================================

Contoh Output

Case 1 (Pasien 1 vs Pasien 2)
Output:
Pasien 1 vs Pasien 2: Sama

Case 2 (Pasien 1 vs Pasien 3)
Output:
Pasien 1 vs Pasien 3: Berbeda

Case 3 (Pasien 2 vs Pasien 4)
Output:
Pasien 2 vs Pasien 4: Berbeda

Case 4 (Pasien 3 vs Pasien 5)
Output:
Pasien 3 vs Pasien 5: Berbeda

Case 5 (Pasien 4 vs Pasien 5)
Output:
Pasien 4 vs Pasien 5: Berbeda

===========================================================================================================
