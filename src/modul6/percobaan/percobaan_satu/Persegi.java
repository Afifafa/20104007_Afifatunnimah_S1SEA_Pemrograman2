package modul6.percobaan.percobaan_satu;

public class Persegi extends Bentuk {
    protected int p, l;

    public void setSupperP(int p){
        super.p = p;
    }

    public void setSuperL(int l){
        super.l = l;
    }

    public void setP(int p) {
        super.p = p;
    }

    public void setL(int l) {
        super.l = l;
    }

    public void getLuas(){
        System.out.println("Luas super : " + (super.p * super.l));
        System.out.println("Luas : " + (this.p * this.l));
    }
}
