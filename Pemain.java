public abstract class Pemain{
    protected Integer nyawa;

    protected Pemain(){
        nyawa = 0;
    }
    protected Pemain(Integer nyawa){
        this.nyawa = nyawa;
    }
    protected Integer getNyawa(){
        return nyawa;
    }
    protected void setNyawa(Integer nyawa){
        this.nyawa = nyawa;
    }
    protected abstract Integer getAction();
}