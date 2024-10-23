package model.classes;

import java.util.ArrayList;

public class MatkulPilihan extends MataKuliah {
    private ArrayList<Mahasiswa> daftar;
    private int minimumMhs;

    public MatkulPilihan(String kode, int sks, String nama, ArrayList<Mahasiswa> daftar, int minimumMhs) {
        super(kode, sks, nama);
        this.daftar = daftar;
        this.minimumMhs = minimumMhs;
    }

    public int getMinimumMhs() {
        return minimumMhs;
    }

    public void setMinimumMhs(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return daftar;
    }

    public void setMhs(ArrayList<Mahasiswa> daftar) {
        this.daftar = daftar;
    }

    public boolean daftarMahasiswa(Mahasiswa mhs) {
        if (daftar.size() < 10) {
            daftar.add(mhs);
            return true;
        }
        return false;
    }

    public boolean kuotaTerpenuhi() {
        return daftar.size() >= 10;
    }

    @Override
    public String toString() {
        return "Kode Mata Kuliah    : " + getKode() + "\n" +
                "Nama Mata Kuliah    : " + getNama() + "\n" +
                "Jumlah SKS          : " + getSks() + "\n" +
                "Jumlah Minimum Mhs  : " + getMinimumMhs();
    }
}
