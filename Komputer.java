public class Komputer extends Pemain{
    private String nama;
    public Komputer(){
        super();
        nama = "";
    }
    public Komputer(String nama,Integer nyawa){
        super(nyawa);
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public Integer getAction(){
        Integer i = 1 + (int)(Math.random()*3);
        return i;
    }
    public String toString(){
        return "Nyawa " + this.nama + " : " + this.nyawa;
    }
}
