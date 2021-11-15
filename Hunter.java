public class Hunter extends JourneyLegend{

    public Hunter(int hp, int mana, int att, int def, String name) {
        super(hp, mana, att, def, name);
        this.character_class = "Hunter";
    }

    public void firstAbility(JourneyLegend target){
        System.out.println("The hunter fires a piercing arrow at " + target.getName() + " for " + this.getAtt() + " damage.");
        target.setHP(target.getHp() - this.getAtt());
    }

    public void secondAbility(JourneyLegend target) {
        System.out.println("The hunter shoots a viper sting draining " + target.getName() + "'s mana by " + this.getMana()/2 + ".");
        target.setMana(target.getMana() - this.getMana()/2);
    }

}