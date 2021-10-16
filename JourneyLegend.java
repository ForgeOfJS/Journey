public class JourneyLegend {
    //private int[] stats
    private int hp;
    private int mana;
    private int att;
    private int def;
    private final String NAME;
    private JourneyEquipment[] set;
    protected String CHARACTER_CLASS;


    //constructor
    public JourneyLegend(int hp, int mana, int att, int def, String name) {
        this.hp = hp;
        this.mana = mana;
        this.att = att;
        this.def = def;
        this.NAME = name;
        this.set = new JourneyEquipment[11];
        this.CHARACTER_CLASS = "Default";
    }

    //to equip equipment and altar legend stats accordingly
    //returns null if equipment was equipped in empty slot else returns piece that was replaced
    public JourneyEquipment equip(JourneyEquipment piece) {
        JourneyEquipment unequipItem = null;
        if (set[piece.getSlotN()] != null) {
            unequipItem = unEquip(piece.getSlotN());
        }else{
            set[piece.getSlotN()] = piece;
            this.hp += piece.getHp();
            this.mana += piece.getMana();
            this.att += piece.getAtt();
            this.def += piece.getDef();
        }
        System.out.println(piece.getName() + " has been equipped.");
        return unequipItem;
    }
    //to unequip equipment and altar legend stats accordingly
    //returns either the selected item or null if there was no item to unequip and adjusts legend stats
    public JourneyEquipment unEquip(int slotN) {
        JourneyEquipment piece = set[slotN];
        if(this.set[slotN] != null) {
            this.hp -= piece.getHp();
            this.mana -= piece.getMana();
            this.att -= piece.getAtt();
            this.def -= piece.getDef();
            this.set[slotN] = null;
            System.out.println(piece.getName() + " has been unequipped.");
        } else {
            System.out.println("No item in that slot.");
        }
        return piece;
    }
    //alternate method to unEquip(), unequip a whole set instead of just one piece
    //always returns set of armor that was removed (including empty spaces)
    public JourneyEquipment[] unEquip(JourneyLegend legend) {
        JourneyEquipment[] equipSet = legend.getSet();
        for (JourneyEquipment piece : legend.getSet()) {
            if (piece != null) {
                legend.unEquip(piece.getSlotN());
            }
        }
        return equipSet;
    }
    //display character stats, name and class depending on subclass
    public void display() {
        System.out.println(this.getCHARACTER_CLASS() + " " + this.getName() + " stats:");
        System.out.println("Health: " + this.getHp() + " | " + "Mana: " + this.getMana() + " | " + "Attack: " + this.getAtt() + " | " + "Def: " + this.getDef());
    }

    //perform first specific action depending on subclass
    public void firstAbility(JourneyLegend target) {
        System.out.println("This attack sucks");
    }

    //perform second specific action depending on subclass
    public void secondAbility(JourneyLegend target) {
        System.out.println("This attack sucks");
    }

    //getters
    public int getHp() {return this.hp;}
    public int getMana() {return this.mana;}
    public int getAtt() {return this.att;}
    public int getDef() {return this.def;}
    public String getName() {return this.NAME;}
    public JourneyEquipment[] getSet() {return this.set;}
    public String getCHARACTER_CLASS() { return CHARACTER_CLASS;}

    //setters
    public void setHP(int hp){this.hp = hp;}
    public void setMana(int mana){this.mana = mana;}
    public void setAtt(int att){this.att = att;}
    public void setDef(int def){this.def = def;}
    public void setSet(JourneyEquipment[] set) {this.set = set;}


}
