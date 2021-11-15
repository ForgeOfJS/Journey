import java.util.Scanner;

//this file is just for testing out library, not much to be seen here
public class Main {

    //this is what you would call the 'Journey'
    public static void main(String[] args) {
        //create the party
        Scanner input = new Scanner(System.in);
        JourneyLegend[] myParty = createParty(input);
        //Display the characters.
        for (JourneyLegend legend : myParty) {
            legend.display();
        }
        //party finds new loot
        encounterItem(myParty, input);

        input.close();

    }

    public static JourneyLegend[] createParty (Scanner input) {
        System.out.println("Let's create all members of your party of differing class types to join your party.");
        System.out.println("(Diversity of Legends will likely lead to success.)");

        //every party must have 5
        JourneyLegend[] myParty = new JourneyLegend[5];
        //Creating the characters
        int i = 0;
        while (i < 5) {
            System.out.println("Which class will member " + String.valueOf(i + 1) + " of your party be?");
            System.out.println("1. Mage\n2. Warrior\n3. Rouge\n4. Hunter\n5. Priest");
            String classCheck = input.nextLine();
            System.out.println("Their name?");
            String name = input.nextLine();
            switch (classCheck) {
                case "1":
                    myParty[i] = new Mage(10, 10, 10, 10, name);
                    i++;
                    break;
                case "2":
                    myParty[i] = new Warrior(10, 10, 10, 10, name);
                    i++;
                    break;
                case "3":
                    myParty[i] = new Rouge(10, 10, 10, 10, name);
                    i++;
                    break;
                case "4":
                    myParty[i] = new Hunter(10, 10, 10, 10, name);
                    i++;
                    break;
                case "5":
                    myParty[i] = new Priest(10, 10, 10, 10, name);
                    i++;
                    break;
                default:
                    System.out.println("!!Please type the number associated with the class of your choice!!\n");
                    break;
            }
        }
        return myParty;
    }

    public static JourneyEquipment encounterItem (JourneyLegend[] myParty, Scanner input) {
        JourneyEquipment ironShortSword = new JourneyEquipment(10, 10, 10, 10, 10, "Iron Short-sword");

        System.out.println("You have found a new item: " + ironShortSword.getName() + "!" );

        System.out.println("Which party member to give this to?");
        String partyMember = input.nextLine();
        String name = "";
        switch (partyMember) {
            case "1":
                name = myParty[0].getName();
                break;
            case "2":
                name = myParty[1].getName();
                break;
            case "3":
                name = myParty[2].getName();
                break;
            case "4":
                name = myParty[3].getName();
                break;
            case "5":
                name = myParty[4].getName();
                break;
            default:
                System.out.println("Invalid party member");
                return ironShortSword;
        }
        JourneyEquipment equipment = myParty[Integer.parseInt(partyMember)-1].equip(ironShortSword);
        if (name != "") {
            myParty[Integer.parseInt(partyMember)-1].display();
        }
        return equipment;
    }




}