package model.classes;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah ajar;
    private ArrayList<PresensiStaff> presensi = new ArrayList<PresensiStaff>();

    public MatkulAjar(MataKuliah ajar, ArrayList<PresensiStaff> presensi) {
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

        return getAjar().toString() + "\n" +
                absen.toString();
    }
}
