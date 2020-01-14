/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ainun.najib;

/**
 *
 * @author DD
 */
public class AinunNajib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //data ktp
        long nik = 351407060197001L;
        long nim = 201969040059L;
        
        String nama = "Ainun Najib";
        String ttl = "Pasuruan,  18 Maret 1997";
        String alamat = "madurejo";
        String kelurahan = "madurejo";
        String kecamatan = "wonorejo";
        String agama = "Islam";
        String status = "Belum Menikah";
        String pekerjaan ="Pelajar/Mahasiswa";
        String kewarganegaraan = "WNI";
        String berlaku = "Seumur Hidup";
        String prodi = "Teknik Informatika 1";
        
        
        int rt = 003;
        int rw = 002;
        int angkatan = 2019;
        
        System.out.println("--->UNIVERSITAS YUDHARTA<---");
        System.out.println("NIM         = "+nim);
        System.out.println("Prodi       = "+prodi);
        System.out.println("Angkatan    = "+angkatan);
        System.out.println("NIK                   = "+nik);
        System.out.println("Nama                  = "+nama);
        System.out.println("Tempat, Tanggal Lahir = "+ttl);
        System.out.println("Alamat                = "+alamat);
        System.out.println("Rt/Rw                 = "+rt+"/"+rw);
        System.out.println("Desa                  = "+kelurahan);
        System.out.println("Kecamatan             = "+kecamatan);
        System.out.println("Agama                 = "+agama);
        System.out.println("Status                = "+status);
        System.out.println("Pekerjaan             = "+pekerjaan);
        System.out.println("Kewarganegaraan       = "+kewarganegaraan);

        
    }
    
}
