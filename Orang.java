import java.util.Scanner;
import static java.lang.System.*;
public class Orang extends Pemain {
    private String nama;
    
    public Orang(){
        super();
        nama = "";
    }
    public Orang(String nama, Integer nyawa){
        super(nyawa);
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public Integer getAction(){
        Scanner sc = new Scanner(in);
        out.println("1. Gunting");
        out.println("2. Kertas");
        out.println("3. Batu");
        out.println();
        out.print("Pilihan: ");
        Integer pilihan = sc.nextInt();
        if (pilihan<=1){
            return 1;
        }
        else if(pilihan==2){
            return 2;
        }
        else{
            return 3;
        }
    }
    public String toString(){
        return "Nyawa " + this.nama + " : " + this.nyawa;
    }
}
