/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

import Percobaan2.*;

/**
 *
 * @author RIZAL
 */
public class PascaSarjana1841720218Rizal extends Mahasiswa1841720218Rizal implements ICumlaude1841720218Rizal, IBerprestasi1841720218Rizal {

    public PascaSarjana1841720218Rizal(String mNama) {
        super(mNama);
    }

    @Override
    public void lulusRizal() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiRizal() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisiRizal() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahRizal() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
