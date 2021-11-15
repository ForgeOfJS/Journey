public class Priest extends JourneyLegend{

    public Priest(int hp, int mana, int att, int def, String name) {
        super(hp, mana, att, def, name);
        this.character_class = "Priest";
    }

    public void firstAbility(JourneyLegend target){
        System.out.println("The priest heals " + target.getName() + " for " + this.getMana()/2 + " hp!");
        target.setHP(target.getHp() + this.getMana() / 2);
    }

    public void secondAbility(JourneyLegend target) {
        System.out.println("The Priest invigorates " + target.getName() + " gaining them " + this.getMana()/2 + " attack.");
        target.setAtt(target.getAtt() + this.getMana()/2);
    }


}