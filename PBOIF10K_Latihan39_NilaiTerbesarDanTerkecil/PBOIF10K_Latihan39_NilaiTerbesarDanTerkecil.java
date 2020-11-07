import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */

public class PBOIF10K10119915Latihan39 {
    public static void main(String[] args) {
        String namaPetugas;
        int jumlahMhs;

        nilai hasil = new nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======Program nilai terbesar dan nilai terkceil======");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jumlahMhs = scanner.nextInt();
        System.out.println();

        hasil.inputNilai(jumlahMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jumlahMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiTerbesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiTerkecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
}