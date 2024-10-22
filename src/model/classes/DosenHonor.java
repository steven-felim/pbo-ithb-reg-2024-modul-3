package model.classes;

import java.util.ArrayList;

public class DosenHonor extends Dosen{
    private double honorPerSKS;

    public DosenHonor(String nama, String alamat, String ttl, String telepon, int nik, String department, ArrayList<MatkulAjar> ajar, double honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, department, ajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
}