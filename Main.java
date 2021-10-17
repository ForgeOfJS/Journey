import java.util.Scanner;

//this file is just for testing out library, not much to be seen here
public class Main {

    //this is what you would call the 'Journey'
    public static void main(String[] args) {
        //create the party
        JourneyLegend[] myParty = createParty();
        //Display the characters.
        for (JourneyLegend legend : myParty) {
            legend.display();
        }
        //party finds new loot
        encounterItem(myParty);

    }

    public static JourneyLegend[] createParty () {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's create all members of your party of differing class types to join your party.");
        System.out.println("(Diversity of Legends will likely lead to success.)");

        //every party must have 5
        JourneyLegend[] myParty = new JourneyLegend[5];
        //Creating the characters
        int i = 0;
        while (i < 5) {
            System.out.println("Which class will member " + String.valueOf(i+1) + " of your party be?");
            System.out.println("1. Mage\n2. Warrior\n3. Rouge\n4. Hunter\n5. Priest");
            String input = userInput.nextLine();
            System.out.println("It's name?");
            String name = userInput.nextLine();
            switch (input) {
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
        userInput.close();
        return myParty;
    }

    public static JourneyEquipment encounterItem (JourneyLegend[] myParty) {
        JourneyEquipment item = new JourneyEquipment(10, 10, 10, 10, 11, "Iron short-sword");

        System.out.println("You have found a new item: " + item.getName() + "!" );
        Scanner input = new Scanner(System.in);
        System.out.println("Which party member to give this to?");
        String userInput = input.nextLine();
        String name = "";
        switch (userInput) {
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
                return item;
        }
        JourneyEquipment equipment = myParty[Integer.parseInt(userInput)-1].equip(item);
        if (name != "") {
            System.out.println("Item was equipped by " + myParty[Integer.parseInt(userInput)-1].getName());
            myParty[Integer.parseInt(userInput)-1].display();
            if (equipment != null) {
                System.out.println(equipment.getName() + " was also unequipped.");
            }
            myParty[Integer.parseInt(userInput)-1].display();
        }
        else {
            System.out.println("Invalid party member");
        }

        input.close();
        return equipment;
    }




}