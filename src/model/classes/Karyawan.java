package model.classes;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private double salary;
    private ArrayList<Presensi> presensiStaff = new ArrayList<Presensi>();

    public Karyawan(String nama, String alamat, String ttl, String telepon, int nik, double salary, ArrayList<Presensi> presensiStaff) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public ArrayList<Presensi> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<Presensi> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nama                   : " + getNama() + "\n" +
                "Alamat                 : " + getAlamat() + "\n" +
                "Tempat & Tanggal Lahir : " + getTtl() + "\n" +
                "Telepon                : " + getTelepon() + "\n" +
                "NIK                    : " + getNik() + "\n" +
                "Gaji                   : " + getSalary();
    }
}
