# ![Screenshot_2025-06-10_223503-removebg-preview](https://github.com/user-attachments/assets/38a906ea-3c1d-4aab-8f52-7e3a9ed25e2d)


> Linns's Laundry adalah sistem aplikasi yang dirancang untuk mempermudah pengelolaan bisnis laundry. Dengan fitur manajemen data pelanggan, transaksi, dan laporan, aplikasi ini bertujuan untuk meningkatkan efisiensi operasional dan pelayanan pelanggan.

## 🚩 Table of Contents

- [Packages](#-packages)
- [Rancangan Database](#-rancangan-database)
- [Fitur Utama](#-fitur-utama)
- [Pengujian](#-pengujian)
- [Kontak](#-kontak)
- [License](#-license)

## 📦 Tampilan

### Dashboard
<img src="https://github.com/user-attachments/assets/6db10244-b811-4e78-af02-4c9b18b629fc" height="400"/>

### Transaksi
<img src="https://github.com/user-attachments/assets/9b978d82-5d75-4d2c-946b-27f553ca2074" height="400"/>   <img src="https://github.com/user-attachments/assets/3d3cc5dc-36f8-4be6-86be-eb83b8fff9ca" height="400"/>   <img src="https://github.com/user-attachments/assets/8cd089fa-ed15-4adc-9ac6-d0b4be69e74d" height="400"/>   <img src="https://github.com/user-attachments/assets/98dec235-7fa6-4f70-ba6d-cdf1deb6b459" height="400"/>

### Struk
<img src="https://github.com/user-attachments/assets/ef013e77-7477-4fc2-9e26-5972b476486d" height="400"/>

### Pencarian
<img src="https://github.com/user-attachments/assets/ddfaa2e3-1be2-4221-b97e-edb58d177ec3" height="400"/>

### Card
<img src="https://github.com/user-attachments/assets/16630fab-ce59-4d48-b9c0-0d50477af51a" height="400"/>

### Tambah Data
<img src="https://github.com/user-attachments/assets/22f4c275-18c3-4b4d-9ff7-7b2592ef0e9a" height="400"/>

### Edit Data
<img src="https://github.com/user-attachments/assets/0f567dd6-32ad-49a6-a825-e161e512bd1e" height="400"/>

### Hubungi
<img src="https://github.com/user-attachments/assets/2293ddad-c03f-46a0-a98a-479d61f9cb3f" height="400"/>


## 🚀 Rancangan Database

## ✨ Fitur Utama
| Fitur | Keterangan |
| --- | --- |
| Tambah Data | Menambahkan data pelanggan baru atau transaksi laundry. Validasi input otomatis (tidak boleh kosong, format benar. |
|  Edit Data | Memperbarui data pelanggan atau transaksi yang sudah ada. Contoh: mengubah nama, jenis layanan, berat cucian, atau status transaksi. |
|  Hapus Data |Menghapus data pelanggan atau transaksi yang tidak diperlukan lagi. Menampilkan konfirmasi sebelum menghapus untuk mencegah kesalahan. |
|  Hubungi Pelanggan | Menyediakan tombol atau fungsi untuk langsung menghubungi pelanggan lewat telepon dari aplikasi. Integrasi dengan aplikasi dialer/hubungi default. |
|  Pencarian & Filter | Cari data pelanggan atau transaksi berdasarkan nama, tanggal, atau status. Filter data agar memudahkan pencatatan dan monitoring. |
|  Edit Data | Memperbarui data pelanggan atau transaksi yang sudah ada. Contoh: mengubah nama, jenis layanan, berat cucian, atau status transaksi.|
|  Tampilan Data dengan Kartu (CardView) | Menampilkan transaksi atau pelanggan dalam format visual yang rapi dan menarik. Masing-masing kartu bisa di-tap untuk detail/edit/hapus. |


## 🧪 Pengujian
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


##  💬 Kontak
Untuk pertanyaan atau informasi lebih lanjut, silakan hubungi:

Email: birgitapaskalinaayu@gmail.com

GitHub: https://github.com/BirgitaPaskalina

## 📜 License

This software is licensed under the [MIT](https://github.com/nhn/tui.editor/blob/master/LICENSE) © [NHN Cloud](https://github.com/nhn).
