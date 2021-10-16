public class Warrior extends JourneyLegend{

    public Warrior(int hp, int mana, int att, int def, String name) {
        super(hp, mana, att, def, name);
        this.CHARACTER_CLASS = "Warrior";
    }

    public void firstAbility(JourneyLegend target){
        System.out.println("The warrior charges at " + target.getName() + " and strikes the target for " + this.getAtt() + " damage.");
        target.setHP(target.getHp() - this.getAtt());
    }

    public void secondAbility(JourneyLegend target) {
        System.out.println("The warrior demoralizes " + target.getName() + ", reducing their attack by " + this.getDef() + ".");
        target.setAtt(target.getAtt() - this.getDef()/2);
    }


}