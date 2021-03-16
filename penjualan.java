//Import class yang dibutuhkan
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class penjualan {
    public static void main(String args[]){
        login();}
    static void login(){    
        String barang[]=new String[3];
         String data[]={"Anggun","3129"};
         String nama, sandi;
         Scanner apa=new Scanner(System.in);
        
        System.out.print("Nama Pengguna : ");
        nama=apa.nextLine();
        System.out.print("Sandi Pengguna : ");
        sandi=apa.nextLine();

        if(nama.equals(data[0])&&sandi.equals(data[1])){


            System.out.println("SELAMAT DATANG");
            menu();
        }
        else{
            System.out.println("Maaf sandi yang anda masukan salah");
            login();
        }
    }
	static void menu(){
        //Inisialisasi objek untuk masing-masing kelas
         Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
         //Deklarasi variabel
         int jum=0, i=0;
         double total_bayar=0;
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("            SELAMAT DATANG DI CAFE ANGGUN ");
        System.out.println("\n");

		//        menampilkan menu 
        System.out.println("             _________________________________________");
        System.out.println("            |                    MENU                 |");
        System.out.println("            |_________________________________________|");
        System.out.println("            |       Nama            |       Harga     |");
        System.out.println("            |1. Nasi Goreng         |   Rp 15000,00   |");
        System.out.println("            |2. Milo Dingin         |   Rp 10000,00   |");
        System.out.println("            |3. Ayam Geprek         |   Rp 25000,00   |");
        System.out.println("            |4. Green Tea Latte     |   Rp 15000,00   |");
        System.out.println("            |5. Thai Tea            |   Rp 10000,00   |");
	      System.out.println("            |6. Sup Daging          |   Rp 30000,00   |");
        System.out.println("            |7. Sup Ayam            |   Rp 25000,00   |");
        System.out.println("            |8. Jeruk Peras         |   Rp 10000,00   |");
        System.out.println("            |9. Pisang Krispi       |   Rp 10000,00   |");
        System.out.println("            |10.Chocco Latte        |   Rp 15000,00   |");
        System.out.println("            |_______________________|_________________|");
        System.out.println("");


         //Deklarasi array
         int [] kode = new int[5];
         int [] jumlah = new int[5];
         int [] harga = new int[5];
         double [] sub_total = new double[5];
         String [] barang = new String[5];
         
         System.out.println("            PROGRAM JAVA PENJUALAN BARANG");
         
         System.out.print("            Masukan Jumlah Menu        : ");
         jum=input.nextInt();
         System.out.println(" ");
         //Memasukan elemen didalam array
         for (i=0; i<jum;i++){
              System.out.print("            Masukan Kode Menu Ke-"+(i+1)+" : ");
              kode[i]=input.nextInt();
              System.out.print("            Masukan Banyak Menu Ke-"+(i+1)+" : ");
              jumlah[i]=input.nextInt();
              //Menentukan barang berdasarkan kode yang dimmasukan
              switch (kode[i]){
                  case 1 : 
                            barang[i]="Nasi Goreng  ";
                            harga[i]=15000;
                            break;
                  case 2 : 
                            barang[i]="Milo Dingin ";
                            harga[i]=10000;
                            break;
                  case 3 : 
                            barang[i]="Ayam Geprek";
                            harga[i]=25000;
                            break;
                  case 4 : 
                            barang[i]="Green Tea Latte       ";
                            harga[i]=15000;
                            break;
                  case 5 : 
                            barang[i]="Thai Tea     ";
                            harga[i]=30000;
                            break;
                  case 6 : 
                            barang[i]="Sup Daging  ";
                            harga[i]=30000;
                            break;
                  case 7 : 
                            barang[i]="Sup Ayam  ";
                            harga[i]=25000;
                            break;
                  case 8 : 
                            barang[i]="Jeruk Peras";
                            harga[i]=10000;
                            break;
                  case 9 : 
                            barang[i]="Pisang Krispi    ";
                            harga[i]=10000;
                            break;
                  case 10 : 
                            barang[i]="Chocco Latte   ";
                            harga[i]=15000;
                            break;
                  default : 
                            System.out.println("            Kode Barang Tidak Tersedia");
              }
         }
          //Pengaturan format number
          formatRp.setCurrencySymbol("            Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println(  "No  |  Nama Barang          |Harga        | Jumlah         | Sub Total     |");  
          //Menampilkan seluruh elemen di dalam array
          for (i=0; i<jum;i++){ 
             sub_total[i]=((jumlah[i]*harga[i]
              ));
             total_bayar+=sub_total[i];
              System.out.println( +i+1+"   "+barang[i]+""+kursIndonesia.format(harga[i])+"   "+jumlah[i]+" "+kursIndonesia.format(sub_total[i])); 
 
           //Menampilkan total bayar
          System.out.println("            Total Bayar : "+kursIndonesia.format(total_bayar));             
}
    }
  }