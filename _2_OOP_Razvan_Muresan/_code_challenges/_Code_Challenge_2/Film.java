public class Film {

    private Integer anAparitie;
    private String nume;
    Actor[] actori;

    public Film(){
    }

    public Film(Integer anAparitie, String nume, Actor[] actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public Actor[] getActori() {
        return actori;
    }
}
