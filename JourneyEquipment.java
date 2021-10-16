public class JourneyEquipment {
    private final int hp;
    private final int mana;
    private final int att;
    private final int def;
    private final String NAME;
    //slot num describes what area it belongs in set
    private final int slotN;
    //constructor
    public JourneyEquipment(int hp, int mana, int att, int def, int slotN, String name) {
        this.hp = hp;
        this.mana = mana;
        this.att = att;
        this.def = def;
        this.slotN = slotN;
        this.NAME = name;
    }
    //getters
    public int getHp() {return this.hp;}
    public int getMana() {return this.mana;}
    public int getAtt() {return this.att;}
    public int getDef() {return this.def;}
    public int getSlotN() {return this.slotN;}
    public String getName() { return NAME; }

}


