package com.demo.tpmod3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jibrilnikki
 */
public class Mahasiswa {
        private String _nama;
        private prodi _prodi;
        
        void setNama(String nama) {
            _nama = nama;
        }
        
        void setProdi(prodi prodi) {
            _prodi = prodi;
        }
        
        String getNama() {
            return _nama;
        }
        
        String getProdi() {
            return _prodi.getNama();
        }
        
        void displayMahasiswa() {
            System.out.println("Nama: " + getNama());
            System.out.println("Prodi: " + getProdi());
        }
}
