package ntu.httt_65.appmonan;

public class MonAn {
    private String tenMonAn;
    private double donGia;
    private  String moTa;
    private  int idAnhMinhHoa;
    // hàm tạo

    public MonAn(String tenMonAn, double donGia,  String moTa, int idAnhMinhHoa) {
        this.donGia = donGia;
        this.tenMonAn = tenMonAn;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
    // các getter, setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
