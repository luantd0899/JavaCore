package backend;

import entity.CongNhan;
import entity.KySu;
import entity.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class Repository  {

    private List<CongNhan> congNhans;
    private List<KySu> kySus;
    private List<NhanVien> nhanViens;

    public Repository(){
        congNhans = new ArrayList<>();
        kySus = new ArrayList<>();
        nhanViens = new ArrayList<>();
    }

    public List<CongNhan> getCongNhans() {
        return congNhans;
    }

    public void setCongNhans(List<CongNhan> congNhans) {
        this.congNhans = congNhans;
    }

    public List<KySu> getKySus() {
        return kySus;
    }

    public void setKySus(List<KySu> kySus) {
        this.kySus = kySus;
    }

    public List<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }


}
