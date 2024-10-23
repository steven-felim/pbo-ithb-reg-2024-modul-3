package model.classes;

import java.util.Date;
import model.enums.Status;

public class PresensiStaff extends Presensi {
    long jam;

    public PresensiStaff(Date tanggal, Status status, long jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public long getJam() {
        return jam;
    }

    public void setJam(long jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return getTanggal().toString() + " - " + getJam() + " - " + getStatus() + "\n";
    }
}
