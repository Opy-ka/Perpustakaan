import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    String kode;
    Scanner masuk = new Scanner(System.in);

    Buku tekno1 = new Buku(
      "Pemprograman Java",
      "Bayu Rahayudi",
      "Teknologi",
      "Belajar bahasa pemrograman Java untuk pengembangan aplikasi desktop, mobile, dan web yang bersifat multiplatform. Java dikenal dengan konsep OOP (Object-Oriented Programming) yang kuat dan library yang lengkap.",
      "2003",
      "tekno1"
    );
    Buku tekno2 = new Buku(
      "Pemprograman C++",
      "Bayu Rahayudi",
      "Teknologi",
      "Menguasai bahasa C++ untuk membuat software berkinerja tinggi seperti game, sistem operasi, dan aplikasi yang membutuhkan manajemen memori efisien. C++ juga mendukung pemrograman berbasis objek dan prosedural.",
      "2021",
      "tekno2"
    );
    Buku tekno3 = new Buku(
      "Pemprograman PHP",
      "Si itu itu",
      "Teknologi",
      "Menguasai PHP untuk membuat website dinamis dan interaktif. PHP sering digunakan bersama MySQL untuk membangun sistem seperti CMS, blog, atau aplikasi web berbasis server.",
      "1998",
      "tekno3"
    );
    Buku tekno4 = new Buku(
      "Pemprograman SQL",
      "Bayu Rahayudi",
      "Teknologi",
      "Belajar SQL (Structured Query Language) untuk mengelola, memanipulasi, dan menganalisis data dalam database. SQL penting untuk pengembangan aplikasi berbasis data seperti sistem informasi dan e-commerce.",
      "1997",
      "tekno4"
    );
    Buku tekno5 = new Buku(
      "Pemprograman WEB",
      "Mas Rusdi",
      "Teknologi",
      "Memahami dasar-dasar pembuatan website interaktif menggunakan HTML, CSS, dan JavaScript. Pelajari juga framework modern seperti React atau Angular untuk pengembangan web yang lebih dinamis.",
      "2003",
      "tekno5"
    );

    Buku fil1 = new Buku(
      "Filosofi Teras",
      "Miko Helo",
      "Filsafat",
      "Menjelajahi makna teras sebagai ruang transisi antara dunia luar dan dalam, simbol penyambutan dan refleksi kehidupan sehari-hari.",
      "2018",
      "fil1"
    );
    Buku fil2 = new Buku(
      "Filosofi Tembok",
      "Miko HaloHalo",
      "Filsafat",
      "Tembok sebagai pembatas fisik dan metafora perlindungan, privasi, serta batasan dalam hubungan sosial dan personal.",
      "2009",
      "fil2"
    );
    Buku fil3 = new Buku(
      "Filosofi Ruang Tamu",
      "Mik*ntol",
      "Filsafat",
      "Ruang tamu sebagai pusat interaksi sosial, mencerminkan identitas pemilik dan tempat pertukaran ide serta cerita.",
      "2022",
      "fil3"
    );
    Buku fil4 = new Buku(
      "Filosofi Kamar",
      "Miko Mika",
      "Filsafat",
      "Kamar sebagai ruang pribadi untuk istirahat, introspeksi, dan ekspresi diri, mencerminkan kenyamanan dan kedamaian batin.",
      "2019",
      "fil4"
    );
    Buku fil5 = new Buku(
      "Filosofi Pager",
      "Mikodok",
      "Filsafat",
      "sebagai simbol batas dan keamanan, melambangkan perlindungan sekaligus keterpisahan antara dunia privat dan publik.",
      "2010",
      "fil5"
    );

    Buku sej1 = new Buku(
      "History of Islam",
      "Hazel ty",
      "Sejarah",
      "Sejarah perkembangan Islam dari masa Nabi Muhammad hingga menjadi salah satu agama terbesar di dunia, mencakup budaya, ilmu pengetahuan, dan politik.",
      "2004",
      "sej1"
    );
    Buku sej2 = new Buku(
      "History of Ambatron",
      "Akhmad Oli Samping",
      "Sejarah",
      "Kisah peradaban atau organisasi Ambatron yang memengaruhi dunia melalui teknologi atau kekuatan misterius.",
      "2003",
      "sej2"
    );
    Buku sej3 = new Buku(
      "History of Jews",
      "Hazelol",
      "Sejarah",
      "YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHUDI YAHOODIIE",
      "2001",
      "sej3"
    );
    Buku sej4 = new Buku(
      "History of Nazi",
      "Hazel miring",
      "Sejarah",
      "Bangkit dan jatuhnya rezim Nazi Jerman pimpinan Adolf Hitler, termasuk Perang Dunia II dan Holocaust yang mengubah sejarah dunia.",
      "1945",
      "sej4"
    );
    Buku sej5 = new Buku(
      "History of Ambatron",
      "Akhmad Oli Samping",
      "Sejarah",
      "Kisah peradaban atau organisasi Ambatron yang memengaruhi dunia melalui teknologi atau kekuatan misterius.",
      "2003",
      "sej5"
    );

    Buku agama1 = new Buku(
      "Tata Cara Sholat Cepet",
      " Gus Hazel",
      "Agama",
      "Panduan praktis sholat dalam waktu singkat tanpa mengabaikan syarat dan rukun, cocok untuk situasi darurat.",
      "2024",
      "agama1"
    );
    Buku agama2 = new Buku(
      "Mafia  Sholawat",
      "Gus Hazel",
      "Agama",
      " Kelompok atau komunitas yang giat menyebarkan sholawat namun sering dianggap memiliki agenda terselubung.",
      "2025",
      "agama2"
    );
    Buku agama3 = new Buku(
      "Gus Akira",
      "Gilbert duri",
      "Agama",
      "Kisah inspiratif atau kontroversial tentang seorang tokoh bernama Gus Akira dalam konteks sosial atau keagamaan.",
      "1567",
      "agama3"
    );
    Buku agama4 = new Buku(
      "Wong liyo ngerti opo (Islam perspection)",
      "Ahza Melu",
      "Agama",
      "Perspektif Islam tentang bagaimana non-Muslim memandang ajaran dan praktik keagamaan umat Islam.",
      "2008",
      "agama4"
    );
    Buku agama5 = new Buku(
      "Bagaimana cara tidur ketika solat",
      "Ahza MRP",
      "Agama",
      "Tips menghindari kantuk saat sholat atau refleksi tentang konsentrasi dalam ibadah.",
      "2011",
      "agama5"
    );

    Buku psiko1 = new Buku(
      "Psychology of Money",
      "Wedanta",
      "Psikologi",
      "Eksplorasi psikologi manusia dalam mengelola uang, termasuk kebiasaan, keserakahan, dan kebahagiaan finansial.",
      "2099",
      "psiko1"
    );
    Buku psiko2 = new Buku(
      "Psychology of lowkey",
      "Yuri",
      "Psikologi",
      "Studi tentang kepribadian introvert atau orang yang memilih hidup sederhana dan tidak mencolok.",
      "2022",
      "psiko2"
    );
    Buku psiko3 = new Buku(
      "Psychology of love",
      "Valent",
      "Psikologi",
      "Analisis psikologis tentang cinta, termasuk faktor biologis, emosional, dan sosial yang memengaruhi hubungan.",
      "2003",
      "psiko3"
    );
    Buku psiko4 = new Buku(
      "Lover but not in love",
      "Master G",
      "Psikologi",
      "Fenomena psikologis di mana seseorang berada dalam hubungan tetapi kehilangan perasaan cinta romantis.",
      "2002",
      "psiko4"
    );
    Buku psiko5 = new Buku(
      "ILY3000 but my mind broke",
      "Master G",
      "Psikologi",
      "Konflik batin antara perasaan cinta yang mendalam dan tekanan mental yang mengganggu stabilitas emosional.",
      "2010",
      "psiko5"
    );

    Buku poli1 = new Buku(
      "Dynasti Jokowi",
      "Uun Hariyanti",
      "Politik",
      "Analisis tentang pengaruh dan warisan politik Jokowi serta kemungkinan terbentuknya dinasti politik dalam keluarganya.",
      "2003",
      "poli1"
    );
    Buku poli2 = new Buku(
      "Dynasti Gibran",
      "Hasan Kopling",
      "Politik",
      "Eksplorasi peran Gibran Rakabuming Raka dalam politik Indonesia dan potensi dinasti keluarga Jokowi.",
      "2005",
      "poli2"
    );
    Buku poli3 = new Buku(
      "Pergolakan NKRI",
      "Jamrud gg",
      "Politik",
      "Sejarah dan tantangan yang dihadapi Negara Kesatuan Republik Indonesia, termasuk konflik internal dan upaya mempertahankan persatuan.",
      "2000",
      "poli3"
    );
    Buku poli4 = new Buku(
      "Reformasi emas",
      "Intan Gaming",
      "Politik",
      "Refleksi tentang era Reformasi 1998 dan dampaknya terhadap demokrasi, ekonomi, dan sosial di Indonesia.",
      "1997",
      "poli4"
    );
    Buku poli5 = new Buku(
      "Penghancur Negara",
      "Uun Hariyanti",
      "Politik",
      "Analisis faktor-faktor internal dan eksternal yang dapat mengancam keutuhan dan stabilitas suatu negara.",
      "2025",
      "poli5"
    );

    Buku fiksi1 = new Buku(
      "Aldebaran",
      "Tere Liye",
      "Fiksi",
      "menceritakan Raib dan Seli yang kembali ke Klan Bumi setelah petualangan di Klan Matahari Minor, persahabatan mereka terancam, Seli sakit dan Ali memutuskan pulang, serta perjalanan menuju Klan Aldebaran dimula",
      "2024",
      "fiksi1"
    );
    Buku fiksi2 = new Buku(
      "Komet Minor",
      "Tere Liye",
      "Fiksi",
      "petualangan mencari Klan Komet Minor, bagaimana persahabatan antara Ali, Seli, dan Raib melewati setiap tantangan dalam mendapatkan tombak pusaka",
      "2022",
      "fiksi2"
    );

    Buku fiksi3 = new Buku(
      "Matahari Minor",
      "Tere Liye",
      "Fiksi",
      "menceritakan kisah Seli, seorang remaja perempuan yang memiliki kekuatan istimewa untuk mengeluarkan petir",
      "2023",
      "fiksi3"
    );

    Buku fiksi4 = new Buku(
      "Bibigill",
      "Tere Liye",
      "Fiksi",
      "seorang gadis bernama Bibi Gill yang berjuang mengalahkan monster dalam hidupnya",
      "2021",
      "fiksi4"
    );

    Buku fiksi5 = new Buku(
      "Si Putih",
      "Tere Liye",
      "Fiksi",
      "Si Putih adalah seekor kucing kuno yang hidup pada ribuan tahun yang lalu di klan Polaris. Pada cerita ini penulis menggambarkan ikatan persahabatan antara manusia dengan hewan. Arti persahabatan yang sangat tulus. Manusia memiliki perasan begitu juga dengan hewan",
      "2021",
      "fiksi5"
    );

    for (int x = 0; x < 1;) {
      System.out.println("==================================================");
      System.out.printf("%18s%s%10s", " ", "PERPUSTAKAAN", " ");
      System.out.println(
        "\n=================================================="
      );
      System.out.println(
        "Selamat datang di \"PERPUSTAKAAN\", tempat untuk menemukan buku-buku yang tepat. " +
        "\nKategori dan KODE-nya: " +
        "\n1.Teknologi (TEKNO)" +
        "\n2.Filsafat (FIL)" +
        "\n3.Sejarah (SEJ)" +
        "\n4.Agama (AGAMA)" +
        "\n5.Psikologi (PSIKO)" +
        "\n6.Politik (POLI)" +
        "\n7.Fiksi (FIKSI)" +
        "\nPerbandingan buku (BANDING)" +
        "\nPanggil Copy (COPY)"+
        "\nKELUAR PERSPUSTAKAAN (KELUAR)" +
        "\nMasukan KODE : "
      );
      kode = masuk.nextLine();
      switch (kode.toUpperCase()) {
        case "TEKNO":
          System.out.println(
            "=================================================="
          );
          tekno1.displayBuku();
          tekno2.displayBuku();
          tekno3.displayBuku();
          tekno4.displayBuku();
          tekno5.displayBuku();
          break;
        case "FIL":
          System.out.println(
            "=================================================="
          );
          fil1.displayBuku();
          fil2.displayBuku();
          fil3.displayBuku();
          fil4.displayBuku();
          fil5.displayBuku();
          break;
        case "SEJ":
          System.out.println(
            "=================================================="
          );
          sej1.displayBuku();
          sej2.displayBuku();
          sej3.displayBuku();
          sej4.displayBuku();
          sej5.displayBuku();
          break;
        case "AGAMA":
          System.out.println(
            "=================================================="
          );
          agama1.displayBuku();
          agama2.displayBuku();
          agama3.displayBuku();
          agama4.displayBuku();
          agama5.displayBuku();
          break;
        case "PSIKO":
          System.out.println(
            "=================================================="
          );
          psiko1.displayBuku();
          psiko2.displayBuku();
          psiko3.displayBuku();
          psiko4.displayBuku();
          psiko5.displayBuku();
          break;
        case "POLI":
          System.out.println(
            "=================================================="
          );
          poli1.displayBuku();
          poli2.displayBuku();
          poli3.displayBuku();
          poli4.displayBuku();
          poli5.displayBuku();
          break;
        case "FIKSI":
          System.out.println(
            "=================================================="
          );
          fiksi1.displayBuku();
          fiksi2.displayBuku();
          fiksi3.displayBuku();
          fiksi4.displayBuku();
          fiksi5.displayBuku();
          break;
        case "COPY":
        Buku copyan = new Buku(poli1);
        copyan.displayBuku();
        break;
        case "BANDING":
          tekno1.perbandingan(sej2, sej5);
          break;
        
        case "KELUAR":
          System.out.println(
            "=================================================="
          );
          masuk.close();
          System.exit(0);
          break;
        default:
          System.out.println(
            "=================================================="
          );
          System.out.println("Tolong masukan KODE yang benar");

          break;
      }
    }

  }
  
  
}
