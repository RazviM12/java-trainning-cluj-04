public class BoxingMatch {

    public String winner;

    BoxingMatch(){
        Fighter a = new Fighter("Tyson",100,30);
        Fighter b = new Fighter("Douglas", 100, 30);

        if(a.attack(a.getDamagePerAttack()) > b.attack(b.getDamagePerAttack()))
            winner = b.getName();
        else if(a.attack(a.getDamagePerAttack()) < b.attack(b.getDamagePerAttack()))
            winner = a.getName();
        else
            winner = "It's a tie!";

        }

    public String fight(){
        return winner;
    }

}
