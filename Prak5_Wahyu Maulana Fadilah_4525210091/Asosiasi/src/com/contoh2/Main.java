package com.contoh2;

public class Main {
    public static void main(String[] args) {
        Pengajar p1 = new Pengajar("Pak Agus");
        Pengajar p2 = new Pengajar("Bu Lestari");

        Jurusan t1 = new Jurusan("Informatika");
        t1.tambahPengajar(p1);
        t1.tambahPengajar(p2);
        t1.tampilkan();

        t1 = null;
        System.out.println(p1.getNama() + " Masih Ada.");
        
    }
}
