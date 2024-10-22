package model.classes;

import java.util.ArrayList;

public class MahasiswaMagister extends Mahasiswa{
    private ArrayList<MatkulAmbil> ambil = new ArrayList<MatkulAmbil>();
    private String judulPenelitianTesis;

    public MahasiswaMagister(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MatkulAmbil> ambil, String judulPenelitianTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambil = ambil;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getAmbil() {
        return ambil;
    }

    public void setAmbil(ArrayList<MatkulAmbil> ambil) {
        this.ambil = ambil;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
}