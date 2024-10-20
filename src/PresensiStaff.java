import java.util.Date;

public class PresensiStaff extends Presensi {
    long jam =  tanggal.getTime();

    public PresensiStaff(Date tanggal, int status, long jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public long getJam() {
        return jam;
    }

    public void setJam(long jam) {
        this.jam = jam;
    }
}
