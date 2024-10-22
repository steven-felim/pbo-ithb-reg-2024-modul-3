package model.classes;

import java.util.ArrayList;

public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> ambil = new ArrayList<MatkulAmbil>();

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MatkulAmbil> ambil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambil = ambil;
    }

    public ArrayList<MatkulAmbil> getAmbil() {
        return ambil;
    }

    public void setAmbil(ArrayList<MatkulAmbil> ambil) {
        this.ambil = ambil;
    }

    @Override
    public String toString() {
        return super.getString() + "\n " + "NIM                    : ";
    }
}