import java.util.ArrayList;

public class Dosen extends Staff {
    private String department;
    private ArrayList<MatkulAjar> ajar = new ArrayList<MatkulAjar>();

    public Dosen(String nama, String alamat, String ttl, String telepon, int nik, String department, ArrayList<MatkulAjar> ajar) {
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

    public ArrayList<MatkulAjar> getAjar() {
        return ajar;
    }

    public void setAjar(ArrayList<MatkulAjar> ajar) {
        this.ajar = ajar;
    }
}
