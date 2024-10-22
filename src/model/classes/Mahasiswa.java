package model.classes;

public class Mahasiswa extends User {
    private int nim;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, int nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.getString() + "\n " + "NIM                    : " + nim;
    }
}
