/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan26;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan26 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        // Dapatkan zona waktu sistem saat ini
                // Dapatkan waktu saat ini sesuai dengan zona waktu sistem
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        
        // Dapatkan nama hari dalam bahasa Indonesia
        String namaHari = waktuSaatIni.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
        // Format tampilan waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy  hh:MM:SS"
                + "");
        String waktuDiformat = waktuSaatIni.format(formatter);
        
        // Tampilkan waktu saat ini dengan hari sesuai dengan zona waktu sistem
        System.out.println("Hari ini adalah hari " + ": " + namaHari +", " + waktuDiformat);
    }
}
