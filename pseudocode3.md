Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan
harga barang}
Deklarasi:
harga, jumlah : int
dis=0.1, total, bayar, jmlDis : double
Deskripsi:
1. print "Masukkan merk buku"
2. read merkBuku
3. print "Masukkan jumlah halaman"
4. read jumlahHalamanBuku
5. print "Masukkan harga barang yang dibeli”
6. read harga
7. print " Masukkan Jumlah jumlah barang yang dibeli”
8. read jumlah
9. total = harga *jumlah
10. jmlDis=total*dis
11. bayar=total-jmlDis
12. print “Diskon yang anda dapatkan adalah”
13. print jmlDiskon
14. print "Jumlah yang harus dibayar adalah”
15. print bayar
