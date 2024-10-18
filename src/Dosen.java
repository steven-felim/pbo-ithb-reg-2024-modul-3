public class Dosen extends Staff {
    private String department;
    private ArrayList<MataKuliah> ajarMataKuliah = new ArrayList<MataKuliah>();

    public Dosen(String nama, String alamat, String ttl, String telepon, int nik, String department, ArrayList<MataKuliah> ajarMataKuliah) {
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

    public ArrayList<MataKuliah> getAjarMataKuliah() {
        return ajarMataKuliah;
    }

    public void setAjarMataKuliah(ArrayList<MataKuliah> ajarMataKuliah) {
        this.ajarMataKuliah = ajarMataKuliah;
    }
}
