import java.util.ArrayList;

public class MatkulPilihan extends MataKuliah {
    private ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
    private int minimumMhs;

    public MatkulPilihan(String kode, int sks, String nama, ArrayList<Mahasiswa> mhs, int minimumMhs) {
        super(kode, sks, nama);
        this.mhs = mhs;
        this.minimumMhs = minimumMhs;
    }

    public int getMinimumMhs() {
        return minimumMhs;
    }

    public void setMinimumMhs(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }

    public void setMhs(ArrayList<Mahasiswa> mhs) {
        this.mhs = mhs;
    }
}
