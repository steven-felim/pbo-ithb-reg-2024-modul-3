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
}
