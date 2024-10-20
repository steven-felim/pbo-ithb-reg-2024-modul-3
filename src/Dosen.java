import java.util.ArrayList;

public class Dosen extends Staff {
    private String department;
    private MatkulAjar ajar;

    public Dosen(String nama, String alamat, String ttl, String telepon, int nik, String department, MatkulAjar ajar) {
        super(nama, alamat, ttl, telepon, nik);
        this.department = department;
        this.ajar = ajar;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public MatkulAjar getAjar() {
        return ajar;
    }

    public void setAjar(MatkulAjar ajar) {
        this.ajar = ajar;
    }
}
