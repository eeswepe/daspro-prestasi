import java.util.Scanner;

public class Matriks {
    public static void inputMatriks(int matriks[][], String namaMatriks) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan elemen matriks" + namaMatriks);
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("matriks1[" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }
    }

    public static void penjumlahan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        inputMatriks(matriks1, "matriks pertama : ");
        inputMatriks(matriks2, "matriks kedua : ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void pengurangan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        inputMatriks(matriks1, "matriks pertama : ");
        inputMatriks(matriks2, "matriks kedua : ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
            }
        }
        System.out.println("Hasil pengurangan adalah ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void perkalian() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        inputMatriks(matriks1, "matriks pertama : ");
        inputMatriks(matriks2, "matriks kedua : ");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < baris; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        System.out.println("Hasil perkalian adalah ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inverse() {

    }

    public static void transpose() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        int[][] matriks = new int[baris][kolom];
        int[][] transpose = new int[kolom][baris];

        System.out.println("Masukan elemen matriks : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("matriks[" + i + "][" + j + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose adalah ");
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("======================================");
            System.out.println("=                MENU                =");
            System.out.println("======================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Inverse");
            System.out.println("5. Transpose");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    penjumlahan();
                    break;
                case 2:
                    pengurangan();
                    break;
                case 3:
                    perkalian();
                    break;
                case 4:
                    inverse();
                    break;
                case 5:
                    transpose();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (pilihan != 5);
    }
}