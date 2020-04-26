public class Premiu {

    private  String nume;
    private  Integer an;

    public Premiu(){
        //default vallues
        this("oscar",1990);
    }

    public Premiu(String nume, Integer an){
        this.nume = nume;
        this.an = an;
    }

    public  Integer getAn() {
        return this.an;
    }

    public String getNume() {
        return this.nume;
    }
}
