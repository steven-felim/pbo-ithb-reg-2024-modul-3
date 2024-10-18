public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MataKuliah> ambilMataKuliah = new ArrayList<MataKuliah>();

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MataKuliah> ambilMataKuliah) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambilMataKuliah = ambilMataKuliah;
    }

    public ArrayList<MataKuliah> getAmbilMataKuliah() {
        return ambilMataKuliah;
    }

    public void setAmbilMataKuliah(ArrayList<MataKuliah> ambilMataKuliah) {
        this.ambilMataKuliah = ambilMataKuliah;
    }
}
