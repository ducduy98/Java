package HCN;

public class hinhChuNhat {
    private float chieu_Dai;
    private float chieu_Rong;

    public float getChieu_Dai() {
        return chieu_Dai;
    }

    public void setChieu_Dai(float chieu_Dai) {
        this.chieu_Dai = chieu_Dai;
    }

    public float getChieu_Rong() {
        return chieu_Rong;
    }

    public void setChieu_Rong(float chieu_Rong) {
        this.chieu_Rong = chieu_Rong;
    }
    public float tinhDienTich(){
        return this.chieu_Dai*this.chieu_Rong;
    }
    public float tinhChuVi(){
        return (this.chieu_Dai+this.chieu_Rong)*2;
    }
    public String toString(){
        return "chieu dai ="+this.chieu_Dai+",chieu rong = "+
                this.chieu_Rong+"Dien Tich= "+tinhDienTich()+"Chu vi= "+tinhChuVi();

    }
}
