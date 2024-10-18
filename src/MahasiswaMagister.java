public class MahasiswaMagister extends Mahasiswa{
    private ArrayList<MataKuliah> ambilMataKuliah = new ArrayList<MataKuliah>();
    private String judulPenelitianTesis;

    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MataKuliah> ambilMataKuliah, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambilMataKuliah = ambilMataKuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MataKuliah> getAmbilMataKuliah() {
        return ambilMataKuliah;
    }

    public void setAmbilMataKuliah(ArrayList<MataKuliah> ambilMataKuliah) {
        this.ambilMataKuliah = ambilMataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
}
