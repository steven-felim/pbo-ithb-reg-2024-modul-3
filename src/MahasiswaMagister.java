public class MahasiswaMagister extends Mahasiswa{
    private ArrayList<MatkulAmbil> ambilMataKuliah = new ArrayList<MatkulAmbil>();
    private String judulPenelitianTesis;

    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MatkulAmbil> ambilMataKuliah, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambilMataKuliah = ambilMataKuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getAmbilMataKuliah() {
        return ambilMataKuliah;
    }

    public void setAmbilMataKuliah(ArrayList<MatkulAmbil> ambilMataKuliah) {
        this.ambilMataKuliah = ambilMataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
}
