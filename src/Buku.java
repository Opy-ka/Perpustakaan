public class Buku {
    
     String judul;
     String penulis;
     String kategori;
     String sinopsis;
     String terbit;
     String kodebuku;
     int jumlahKata;

    Buku(String judul,String penulis, String kategori,String sinopsis,String terbit,String kodebuku){
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
        this.terbit = terbit;
        this.kodebuku = kodebuku;
        this.jumlahKata = hitungJumlahKata(sinopsis);
    }

    public int hitungJumlahKata(String teks) {
        if (teks == null || teks.isEmpty()) {
            return 0;
        }

        String[] kata = teks.trim().split("\\s+");

        return kata.length;
    }
    public void perbandingan(Buku pertama, Buku kedua){
        int similarity = 0;
            pertama.displayBuku();
            kedua.displayBuku();
        
            if (pertama.judul.equalsIgnoreCase(kedua.judul)) {
                similarity += 25;
            }
            if (pertama.terbit.equalsIgnoreCase(kedua.terbit)) {
                similarity += 25;
            }
            if (pertama.kategori.equalsIgnoreCase(kedua.kategori)) {
                similarity += 25;
            }
            if (pertama.penulis.equalsIgnoreCase(kedua.penulis)) {
                similarity += 25;
            }
        
            System.out.println("Persentase kemiripan: " + similarity + "%");
      }
    Buku(Buku copyan){
        this.copyBuku(copyan);
      }

    public void copyBuku(Buku copy){
        this.judul = copy.judul;
        this.penulis = copy.penulis;
        this.kategori = copy.kategori;
        this.sinopsis = copy.sinopsis;
        this.terbit = copy.terbit;
        this.kodebuku = copy.kodebuku;
        this.jumlahKata = hitungJumlahKata(sinopsis);
        this.jumlahKata = copy.jumlahKata;
    }
    public void displayBuku() {
        
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + terbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Kode buku " + kodebuku);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis : " + jumlahKata);
        System.out.println("<===============>");
    }
}