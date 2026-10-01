class hewan {
    String nama;

    public void jalan() {System.out.println("Hewan = " + this.nama + "berjalan");}
    public void terbang() {System.out.println("Hewan = " + this.nama + "terbang");}


    public static void main(String[] args){
        hewan kucing = new hewan();
        hewan burung = new hewan();
        hewan anjing = new hewan();

        kucing.nama =" Kucing ";
        burung.nama =" Burung ";
        anjing.nama =" Anjing ";


        System.out.println();
        kucing.jalan();
        burung.terbang();
        anjing.jalan();
        System.out.println();
    }
}