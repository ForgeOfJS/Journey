public class Mage extends JourneyLegend{


    public Mage(int hp, int mana, int att, int def, String name) {
        super(hp, mana, att, def, name);
        this.CHARACTER_CLASS = "Mage";
    }

    public void firstAbility(JourneyLegend target){
        System.out.println("The mage charges and blasts a massive fireball at " + target.getName() + "for " + this.getAtt() + " damage.");
        target.setHP(target.getHp() - this.getAtt());
    }

    public void secondAbility(JourneyLegend target) {
        System.out.println("The mage enlightens " + target.getName() + "'s mind gaining them " + this.getMana()/4 + " mana.");
        target.setMana(target.getMana() + this.getMana()/4);
    }
}