Ujian Tengah Semester (UTS)
===========================================================================================================

Mata Kuliah		:	Struktur Data dan Algoritma
Dosen Pengampu	:	Alun Sujjada, S.Kom., M.Tengah

===========================================================================================================

Nama			:	Aditya Nanda
NIM				:	250401010388
Kelas			:	IF207

===========================================================================================================

Soal Ujian Tengah Semester
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

Terimakasih.