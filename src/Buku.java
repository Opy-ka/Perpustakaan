public class Buku {
    
     String judul;
     String penulis;
     String kategori;

    Buku(String judul,String penulis, String kategori){
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    // public void setJudul(String judul) {
    //     this.judul = judul;
    // }

    // public void setPenulis(String penulis) {
    //     this.penulis = penulis;
    // }

    // public void setKategori(String kategori) {
    //     this.kategori = kategori;
    // }

    public void displayBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Kategori: " + kategori);
        System.out.println("<===============>");
    }
}