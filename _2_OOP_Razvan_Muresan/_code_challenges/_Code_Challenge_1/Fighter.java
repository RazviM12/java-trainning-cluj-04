public class Fighter {

    private String name;
    private int health;
    private int damagePerAttack;
    private int calc = 0;

    public Fighter(String name, int health, int damagePerAttack){
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
    }

    public int attack(int damage){
        while(damage <= this.health) {
            damage = damage + this.damagePerAttack;
            this.calc++;
            //System.out.println(calc);
        }
        return calc;

    }

    public String getName() {
        return name;
    }

  //  public void setName(String name) {
  //      this.name = name;
  //  }

    public int getHealth() {
        return health;
    }

    //   public void setHealth(int health) {
    //      this.health = health;
    //  }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

   // public void setDamagePerAttack(int damagePerAttack) {
   //      this.damagePerAttack = damagePerAttack;
   // }
}
