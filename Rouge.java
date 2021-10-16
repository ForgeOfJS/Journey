public class Rouge extends JourneyLegend{

    public Rouge(int hp, int mana, int att, int def, String name) {
        super(hp, mana, att, def, name);
        this.CHARACTER_CLASS = "Rouge";
    }

    public void firstAbility(JourneyLegend target){
        System.out.println("The Rouge sinisterly strikes at " + target.getName() + " from behind for " + this.getAtt() + " damage.");
        target.setHP(target.getHp() - this.getAtt());
    }

    public void secondAbility(JourneyLegend target) {
        System.out.println("The Rouge shows a weak spot in " + target.getName() + "'s armor, reducing def by" + this.getAtt() / 2 + ".");
        target.setDef(target.getDef() - this.getAtt()/2);
    }

}