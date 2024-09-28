/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.demo.tpmod3;

/**
 *
 * @author jibrilnikki
 */
public class TPMOD3 {
    public static void main(String[] args) {
       
       prodi pr1 = new prodi();
       prodi pr2 = new prodi();
       Mahasiswa mhs1 = new Mahasiswa();
       Mahasiswa mhs2 = new Mahasiswa();
       
       pr1.setNama("Informatika");
       pr2.setNama("Rekayasa Perangkat Lunak");
       System.out.println(pr1.getNama());
       System.out.println(pr2.getNama());
       
       System.out.println("");
       
       mhs1.setNama("Hetisam Yuniawan");
       mhs2.setNama("Nugroho Rahmanto");
       mhs1.setProdi(pr1);
       mhs2.setProdi(pr2);
       mhs1.displayMahasiswa();
       mhs2.displayMahasiswa();
       
    }
}
