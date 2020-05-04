public class karyawan {
    //Atribute
    String nama;
    int umur;
    String jabatan;
    int gaji;
    String idkaryawan;
    int a;

    public karyawan(){

    }

    //Behavior
    void absen(){
        System.out.println("Absen terlebih dahulu sebelum memasuki ruangan kerja");

    }

    void bekerja(){
        System.out.println("senin - jum'at");
    }

    void istirahat(){
        System.out.println("Makan Siang");
    }


    void cetak(){
        System.out.println("Nama		: " + nama);
        System.out.println("Umur		: " + umur);
        System.out.println("Id Karyawan	: " + idkaryawan);
        System.out.println("Gaji		: " + gaji);
        System.out.println("jabatan		: " + jabatan);
        System.out.println("======================================================");
    }

}
