package org.d3if.rumahadatindonesia;

import java.io.Serializable;

public class Rumah implements Serializable {
    private String nama;
    private String asal;
    private String detail;
    private int image;

    public Rumah(String nama, String asal, String detail, int image) {
        this.nama = nama;
        this.asal = asal;
        this.detail = detail;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
