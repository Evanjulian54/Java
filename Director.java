import java.util.*;
import static java.lang.System.*;
public class Director {
    public Director(){
        Scanner sc = new Scanner(in);
        List<Orang> teamorang = new ArrayList<Orang>();
        List<Komputer> teamkomputer = new ArrayList<Komputer>();
        out.println("Welcome to Suit");
        out.print("Masukan jumlah pemain: ");
        Integer jumlah = sc.nextInt();
        Orang orang1 = null;
        Komputer komputer1 = null;
        for(int i = 0; i<jumlah; i++){
            out.print("Nama Pemain " + (i+1) + " : ");
            String nama = sc.next();
            orang1 = new Orang(nama, 5);
            teamorang.add(orang1);
            komputer1 = new Komputer("Komputer "+(i+1),10);
            teamkomputer.add(komputer1);
        }
        Integer r = 1;
        while(true){
            if(!teamorang.isEmpty() && !teamkomputer.isEmpty()){
                Integer p = 0;
                Integer h = 1;
                out.println("=====================");
                out.println("Ronde " + r);
                out.println(teamorang.get(p).getNama() + " vs " + teamkomputer.get(p).getNama());
                out.println("=====================");
                while(true){
                    if(teamorang.get(p).getNyawa()!=0 && teamkomputer.get(p).getNyawa()!=0){
                        Integer o = teamorang.get(p).getAction();
                        Integer k = teamkomputer.get(p).getAction();
                        /*
                        1. Gunting
                        2. Kertas
                        3. Batu
                        */
                        if ((o==1 && k==1)|| (o==2 && k==2)|| (o==3 && k==3)){
                            out.println("=====================");
                            out.println("Hasil : Imbang");
                            out.println("=====================");
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==1 && k==2){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih gunting, " + teamkomputer.get(p).getNama() + " pilih kertas");
                            out.println("=====================");
                            out.println("Hasil : "+teamorang.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamkomputer.get(p).setNyawa(teamkomputer.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==2 && k==1){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih kertas, " + teamkomputer.get(p).getNama() + " pilih gunting");
                            out.println("=====================");
                            out.println("Hasil : "+teamkomputer.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamorang.get(p).setNyawa(teamorang.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==1 && k==3){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih gunting, " + teamkomputer.get(p).getNama() + " pilih batu");
                            out.println("=====================");
                            out.println("Hasil : "+teamkomputer.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamorang.get(p).setNyawa(teamorang.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==3 && k==1){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih batu, " + teamkomputer.get(p).getNama() + " pilih gunting");
                            out.println("=====================");
                            out.println("Hasil : "+teamorang.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamkomputer.get(p).setNyawa(teamkomputer.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==2 && k==3){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih kertas, " + teamkomputer.get(p).getNama() + " pilih batu");
                            out.println("=====================");
                            out.println("Hasil : "+teamorang.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamkomputer.get(p).setNyawa(teamkomputer.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                        else if(o==3 && k==2){
                            out.println("=====================");
                            out.println(teamorang.get(p).getNama() + " pilih batu, " + teamkomputer.get(p).getNama() + " pilih kertas");
                            out.println("=====================");
                            out.println("Hasil : "+teamkomputer.get(p).getNama()+" Menang");
                            out.println("=====================");
                            teamorang.get(p).setNyawa(teamorang.get(p).getNyawa()-1);
                            out.println(teamorang.get(p).toString());
                            out.println(teamkomputer.get(p).toString());
                            out.println("=====================");
                        }
                    }
                    else if(teamorang.get(p).getNyawa()==0){
                        out.println("\t=====================");
                        out.println("\tRonde ke-" + r + " Dimenangkan oleh: ");
                        out.println("\t=====================");
                        out.println("\tTeam Komputer");
                        out.println("\t=====================");
                        teamorang.remove(teamorang.get(p));
                        break;
                    }
                    else{
                        out.println("\t=====================");
                        out.println("\tRonde ke-" + r + " Dimenangkan oleh: ");
                        out.println("\t=====================");
                        out.println("\tTeam Orang");
                        out.println("\t=====================");
                        teamkomputer.remove(teamkomputer.get(p));
                        h++;
                        break;
                    }
                }
            r++;
            }
            else if(teamorang.isEmpty()){
                out.println("=====================");
                out.println("Permainan Dimenangkan oleh : ");
                out.println("=====================");
                out.println("Team Komputer");
                out.println("=====================");
                exit(0);
                break;
            }
            else{
                out.println("=====================");
                out.println("Permainan Dimenangkan oleh : ");
                out.println("=====================");
                out.println("Team Orang");
                out.println("=====================");
                exit(0);
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Director();
    }
}
