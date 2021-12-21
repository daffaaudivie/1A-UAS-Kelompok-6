//Mengimpor Scanner ke Program
import java.util.Scanner; 
public class yteam {
	static Scanner sc=new Scanner(System.in);
	static String namaBarang[]; static String kategori[]; 
	static int stok[]; static int masuk[]; 
	static int keluar[]; static int rusak[]; 
	static int jumlah; static int harga[];

public static void main(String[] args){ 
Scanner sc = new Scanner(System.in); 
 
int pilih; 
do { 
//Menampilkan menu 
System.out.println(" ");
System.out.println("\t===============================");
System.out.println("\t|| Menu Inventory Toko Firga ||");
System.out.println("\t===============================");
System.out.println("1.Input Data Barang");  
System.out.println("2.Input Barang Masuk"); 
System.out.println("3.Input Barang Keluar"); 
System.out.println("4.Input Barang Rusak");  
System.out.println("5.Pencarian Data Barang");  
System.out.println("6.Laporan Data Barang"); 
System.out.println("0.Keluar"); 
//Memilih pilihan
System.out.print("Masukkan Pilihan Anda \t: ");//menampilakan untuk input pilihan 
pilih = sc.nextInt(); 
//Pemilihan menggunakan switch..case
switch (pilih) { 
case 1: 
dataBarang();         
break; 
case 2: 
barangMasuk();         
break;   
case 3: 
barangKeluar();         
break; 
case 4: 
barangRusak();          
break; 
case 5: 
pencarianData();          
break; 
case 6: 
LaporanData();          
break; 
case 0:

System.out.print("Apakah anda yakin ingin keluar? (Y/T) : ");//menampilkan stop/lanjut.
String a = sc.next();
//Pemilihan menggunakan if.. else
if(a.equalsIgnoreCase("Y")){
	System.out.println("Terima Kasih !"); //menampilkan 
    System.exit(0);//jika menginputkan 0 maka selesai
}
    break;
    default:
    System.out.println("Kode yang anda masukkan salah!!");//menampilkan
} } 
//Ekspresi logika
while ((pilih!=0)||(pilih<7)); //mengevaluasi
}

static void dataBarang(){ 
System.out.print("Masukkan jumlah barang \t: "); 
jumlah = sc.nextInt(); 
namaBarang = new String[jumlah]; //Instansiasi objek array
kategori = new String[jumlah]; //Instansiasi objek array
stok = new int[jumlah]; //Instansiasi objek array
harga = new int[jumlah];

for(int i=0; i
	<namaBarang.length; i++){ 
System.out.println("Barang ke " +(i+1)); 
System.out.print("Masukkan nama barang \t: "); 
namaBarang[i]=sc.next(); 
System.out.print("Kategori barang \t: "); 
kategori[i]=sc.next(); 
System.out.print("Stok barang \t\t: "); 
stok[i]=sc.nextInt(); 
System.out.print("Harga barang \t\t: ");
harga[i]=sc.nextInt();
} } 
//deklarasi fungsi
static void barangMasuk(){ 
System.out.println("================== Input Barang Masuk =================="); 
masuk = new int[jumlah]; //Instansiasi objek array
for(int i=0; i<namaBarang.length; i++){ 
System.out.print("Masukkan jumlah "+ namaBarang[i] +" yang masuk \t\t: "); 
masuk[i] = sc.nextInt(); 
} }   
//deklarasi fungsi
static void barangKeluar(){ 
System.out.println("================== Input Barang Keluar =================="); 
keluar =new int[jumlah]; //Instansiasi objek array
for(int i=0; i<namaBarang.length; i++){ 
System.out.print("Masukkan jumlah "+ namaBarang[i] +" yang keluar \t\t: "); 
keluar[i] = sc.nextInt(); 
} } 
//deklarasi fungsi
static void barangRusak(){
System.out.println("================== Input Barang Rusak =================="); 
rusak = new int[jumlah]; //Instansiasi objek array
for(int i=0; i<namaBarang.length; i++){ 
System.out.print("Masukkan jumlah "+ namaBarang[i] +" yang rusak \t\t: "); 
rusak[i] = sc.nextInt(); 
} } 
//deklarasi fungsi
static void pencarianData(){ 
	//Menampilkan pencarian barang
     System.out.println("================== Cari Data Barang ==================");
     System.out.print("Masukkan barang yang ingin dicari: ");
     String nama = sc.next();
     for(int i=0; i< namaBarang.length; i++){
     	if(nama.equalsIgnoreCase(namaBarang[i])){
     		System.out.println("Nama \t\t\t: "+namaBarang[i]);                 
            System.out.println("Kategori \t: "+kategori[i]); 
            System.out.println("Jumlah masuk \t: "+masuk[i]); 
            System.out.println("Jumlah keluar \t: "+keluar[i]); 
            System.out.println("Jumlah Rusak \t: " +rusak[i]);

            } 
        } 
    } 
 //deklarasi fungsi
static void LaporanData(){         
	int hasil=0;
	for(int i=0; i<namaBarang.length; i++){
		hasil=(stok[i]+masuk[i])-(keluar[i]+rusak[i]);
		//Menampilkan data barang
		System.out.println("\t-----------------------");
		System.out.println("\t| LAPORAN DATA BARANG |"); 
		System.out.println("\t-----------------------");
        System.out.println("Barang ke "+(i+1)); 
        System.out.println("Nama Barang \t\t\t: "+namaBarang[i]); 
        System.out.println("Kategori \t\t\t: "+kategori[i]); 
		System.out.println("Harga Barang \t\t\t: "+harga[i]);
        System.out.println("Jumlah barang yang masuk \t: "+masuk[i]); 
        System.out.println("Jumlah barang yang keluar \t: "+keluar[i]); 
        System.out.println("Jumlah barang yang rusak \t: "+rusak[i]);  
        System.out.println("Total keseluruhan stok barang \t: "+hasil); 
        } 
    } 
} 
