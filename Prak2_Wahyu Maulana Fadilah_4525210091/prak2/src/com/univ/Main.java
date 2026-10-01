package com.univ;

public class Main {
    public static void main(String[] args) {
        //objek pertama: Diana
        mahasiswa wahyu = new mahasiswa(
            "4525210091",
            "Wahyu",
            "Fadilah",
            "05 Desember 2006",
            "jl.swadata",
            21,
            "Teknik Informatika"
        );

        wahyu.displayInfo();

        wahyu.belajar();
    }
}
