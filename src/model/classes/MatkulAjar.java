package model.classes;

import java.util.ArrayList;

public class MatkulAjar extends MataKuliah {
    private MataKuliah ajar;
    private ArrayList<PresensiStaff> presensi = new ArrayList<PresensiStaff>();

    public MatkulAjar(String kode, int sks, String nama, MataKuliah ajar, ArrayList<PresensiStaff> presensi) {
        super(kode, sks, nama);
        this.ajar = ajar;
        this.presensi = presensi;
    }

    public MataKuliah getAjar() {
        return ajar;
    }

    public void setAjar(MataKuliah ajar) {
        this.ajar = ajar;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        StringBuilder absen  = new StringBuilder("Presensi            : ");

        for (PresensiStaff p : presensi) {
            absen.append(" - ").append(p.toString()).append("\n");
        }

        return "Kode Mata Kuliah    : " + getKode() + "\n" +
                "Nama Mata Kuliah    : " + getNama() + "\n" +
                "Jumlah SKS          : " + getSks() + "\n" +
                absen.toString();
    }
}
