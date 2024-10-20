public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, int nik, String department, MatkulAjar ajar, double salary) {
        super(nama, alamat, ttl, telepon, nik, department, ajar);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
