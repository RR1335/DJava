package biz.baijing.beging.pojo;

public class Address {
    private String sheng;
    private String shi;

    public Address() {

    }

    public Address(String sheng, String shi) {
        this.sheng = sheng;
        this.shi = shi;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    @Override
    public String toString() {
        return "Address{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                '}';
    }
}
