package contoh02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Handphone redmiNote8 = new Xiaomi();
        Pengguna dian = new Pengguna(redmiNote8);

        dian.nyalakanHP();

        Scanner input = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\n=== Menu ===");
            System.out.println("[1] Besarkan Volume");
            System.out.println("[2] Kecilkan Volume");
            System.out.println("[3] Matikan HP");
            System.out.println("[0] Keluar");
            System.out.println("Pilih: ");
            pilihan = input.nextInt();

            switch(pilihan) {
                case 1 -> dian.besarkanSuaraHP();
                case 2 -> dian.kecilkanSuaraHP();
                case 3 -> dian.matikanHP();
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak ada");
            }
        } while (pilihan != 0);
        input.close();
        
    }
}
