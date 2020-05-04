public class main {
    public static void main(String[] args){

        karyawan karyawan = new karyawan();

        karyawan.nama		= "Ahmad Yasir";
        karyawan.umur		= 25;
        karyawan.idkaryawan	= "18765420";
        karyawan.gaji		= 10000000;
        karyawan.jabatan 	= "CO Leader";

        karyawan.cetak();
        karyawan.absen();
        karyawan.bekerja();
        karyawan.istirahat();

    }
}
