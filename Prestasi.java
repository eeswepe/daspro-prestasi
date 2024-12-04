import java.util.Scanner;
public class Prestasi {
    static Scanner sc = new Scanner(System.in);
    static int counter = 0;
    
    public static void inputPrestasi(String arr[][], int tahun_prestasi[]){
        System.out.println("======================================");
        System.out.println("=    Pencatatan Prestasi Mahasiswa   =");
        System.out.println("======================================");
        System.out.print("> Masukkan Nama Mahasiswa: : ");
        arr[0][counter] = sc.nextLine();
        System.out.print("> Masukkan NIM Mahasiswa: : ");
        arr[1][counter] = sc.nextLine();
        System.out.print("> Masukkan Jenis Prestasi Mahasiswa: : ");
        arr[2][counter] = sc.nextLine();
        String tingkat_prestasi;

        do {
            System.out.print("> Masukkan Tingkat Prestasi Mahasiswa(Lokal/Nasional/Internasional): ");
            tingkat_prestasi = sc.nextLine();
            if (!tingkat_prestasi.equalsIgnoreCase("Lokal") && !tingkat_prestasi.equalsIgnoreCase("Nasional") && !tingkat_prestasi.equalsIgnoreCase("Internasional")) {
                System.out.println("! Error: Tingkat Prestasi tidak valid");
            }
        } while (!tingkat_prestasi.equalsIgnoreCase("Lokal") && !tingkat_prestasi.equalsIgnoreCase("Nasional") && !tingkat_prestasi.equalsIgnoreCase("Internasional"));
        arr[3][counter] = tingkat_prestasi;

        do {
            System.out.print("> Masukkan Tahun Prestasi Mahasiswa: ");
            tahun_prestasi[counter] = sc.nextInt();
            if (tahun_prestasi[counter] < 2010 || tahun_prestasi[counter] > 2024) {
                System.out.println("! Error: Tahun tidak berada dalam jangkauan");
            }
        } while(tahun_prestasi[counter] < 2010 || tahun_prestasi[counter] > 2024);
        System.out.print("==== Program Pencatatan Prestasi Berhasil ====\n");
        counter++;
    }

    public static void outputPrestasi(String arr[][]){
        
    }

    public static String[] analisisPrestasi(int arr[][]){
        return null;
    }

    public static void main(String[] args) {

    }    
}