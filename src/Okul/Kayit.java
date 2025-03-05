package Okul;

public class Kayit {
    public int okulNo;
    public String ad;
    public String soyad;
    public String bolum;
    public int sinif;
    public String cinsiyet;
    public String dogumTarihi;
    public String dogumYeri;
    public String telefon;
    public String email;

    public Kayit(int okulNo, String ad, String soyad, String bolum, int sinif, String cinsiyet, String dogumTarihi, String dogumYeri, String telefon, String email) {
        setOkulNo(okulNo);
        setAd(ad);
        setSoyad(soyad);
        setBolum(bolum);
        setSinif(sinif);
        setCinsiyet(cinsiyet);
        setDogumTarihi(dogumTarihi);
        setDogumYeri(dogumYeri);
        setTelefon(telefon);
        setEmail(email);
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kayit{" +
                "okulNo=" + okulNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", bolum='" + bolum + '\'' +
                ", sinif=" + sinif +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", dogumYeri='" + dogumYeri + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
