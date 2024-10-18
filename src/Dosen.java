public class Dosen extends Staff {
    private String department;
    private ArrayList<MatkulAjar> ajarMataKuliah = new ArrayList<MatkulAjar>();

    public Dosen(String nama, String alamat, String ttl, String telepon, int nik, String department, ArrayList<MatkulAjar> ajarMataKuliah) {
        super(nama, alamat, ttl, telepon, nik);
        this.department = department;
        this.ajarMataKuliah = ajarMataKuliah;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<MatkulAjar> getAjarMataKuliah() {
        return ajarMataKuliah;
    }

    public void setAjarMataKuliah(ArrayList<MatkulAjar> ajarMataKuliah) {
        this.ajarMataKuliah = ajarMataKuliah;
    }
}
