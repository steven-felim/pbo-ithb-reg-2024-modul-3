public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> ambilMataKuliah = new ArrayList<MatkulAmbil>();

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MatkulAmbil> ambilMataKuliah) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambilMataKuliah = ambilMataKuliah;
    }

    public ArrayList<MatkulAmbil> getAmbilMataKuliah() {
        return ambilMataKuliah;
    }

    public void setAmbilMataKuliah(ArrayList<MatkulAmbil> ambilMataKuliah) {
        this.ambilMataKuliah = ambilMataKuliah;
    }
}
