public class MatkulPilihan extends MataKuliah {
    private int minimumMhs;

    public MatkulPilihan(String kode, int sks, String nama, int minimumMhs) {
        super(kode, sks, nama);
        this.minimumMhs = minimumMhs;
    }

    public int getMinimumMhs() {
        return minimumMhs;
    }

    public void setMinimumMhs(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }
}
