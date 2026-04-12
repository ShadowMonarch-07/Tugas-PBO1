/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.muhammadfata.tugas1;

import akademi.matakuliah;

/**
 *
 * @author mhmmd
 */
public class main {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        matakuliah mk = new matakuliah();

        System.out.println("======= DATA =======");
        System.out.println("NPM          : " + mhs.getNpm());
        System.out.println("Nama         : " + mhs.getNama());
        System.out.println("IPK          : " + mhs.getIpk());
        System.out.println("Semester     : " + mhs.getSemester());
        System.out.println("------------------------------------------");
        System.out.println("Kode MK      : " + mk.getKodeMK());
        System.out.println("Mata Kuliah  : " + mk.getNamaMK());
        System.out.println("==========================================");
    }
}