# ![Screenshot_2025-06-10_223503-removebg-preview](https://github.com/user-attachments/assets/38a906ea-3c1d-4aab-8f52-7e3a9ed25e2d)


> Aplikasi Laundry adalah sistem informasi berbasis web yang dirancang untuk mempermudah pengelolaan bisnis laundry. Dengan fitur manajemen data pelanggan, transaksi, dan laporan, aplikasi ini bertujuan untuk meningkatkan efisiensi operasional dan pelayanan pelanggan.

## 🚩 Table of Contents

- [Packages](#-packages)
- [Rancangan Database](#-rancangan-database)
- [Fitur Utama](#-fitur-utama)
- [Pengujian](#-pengujian)
- [Kontak](#-kontak)
- [License](#-license)

## 📦 Tampilan

### Transaksi
### Card
### Tambah Data
### Cabang
### Tambahan

## 🚀 Rancangan Database

## Fitur Utama
| Fitur | Keterangan |
| --- | --- |
| Tambah Data | Menambahkan data pelanggan baru atau transaksi laundry. Validasi input otomatis (tidak boleh kosong, format benar. |
|  Edit Data | Memperbarui data pelanggan atau transaksi yang sudah ada. Contoh: mengubah nama, jenis layanan, berat cucian, atau status transaksi. |
|  Hapus Data |Menghapus data pelanggan atau transaksi yang tidak diperlukan lagi. Menampilkan konfirmasi sebelum menghapus untuk mencegah kesalahan. |
|  Hubungi Pelanggan | Menyediakan tombol atau fungsi untuk langsung menghubungi pelanggan lewat telepon dari aplikasi. Integrasi dengan aplikasi dialer/hubungi default. |
|  Pencarian & Filter | Cari data pelanggan atau transaksi berdasarkan nama, tanggal, atau status. Filter data agar memudahkan pencatatan dan monitoring. |
|  Edit Data | Memperbarui data pelanggan atau transaksi yang sudah ada. Contoh: mengubah nama, jenis layanan, berat cucian, atau status transaksi.|
|  Tampilan Data dengan Kartu (CardView) | Menampilkan transaksi atau pelanggan dalam format visual yang rapi dan menarik. Masing-masing kartu bisa di-tap untuk detail/edit/hapus. |


## Pengujian
1. Pengujian Unit
  Model Test: Cek validasi data seperti nama pelanggan tidak boleh kosong, harga tidak negatif.
  Database Test:

    - Cek input & retrieve data.
    - Cek update status transaksi.
    - Hapus data dan pastikan tidak muncul lagi.

2. Pengujian Fungsional
    - Form pelanggan harus menyimpan data ke database.

3. Pengujian UI (Instrumented Test - Android)
  Gunakan Espresso atau UI Automator:

    - Input data lengkap, tekan submit → muncul notifikasi sukses.

    - Tekan tombol “Laporan” → tampil semua transaksi.


##  Kontak
Untuk pertanyaan atau informasi lebih lanjut, silakan hubungi:

Email: birgitapaskalinaayu@gmail.com

GitHub: https://github.com/BirgitaPaskalina

## 📜 License

This software is licensed under the [MIT](https://github.com/nhn/tui.editor/blob/master/LICENSE) © [NHN Cloud](https://github.com/nhn).
