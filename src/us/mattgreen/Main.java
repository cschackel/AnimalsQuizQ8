package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        //Lines to Replace
        /*
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        */

        System.out.print("Add Animal(Y/N): ");
        String addAnimalInput = keyboard.nextLine();
        while(addAnimalInput.toUpperCase().charAt(0)!='Y'&&addAnimalInput.toUpperCase().charAt(0)!='N')
        {
            System.out.print("Invalid Input\nAdd Animal(Y/N): ");
            addAnimalInput = keyboard.nextLine();
        }
        boolean addAnimal = addAnimalInput.toUpperCase().charAt(0)=='Y'?true:false;
        while(addAnimal)
        {
            ZooManagement.typeVerifiedNewAnimal(zoo);
            //ZooManagement.newAnimal(zoo);  //Although Not an instantiation, this statically calls the IO class
            System.out.print("Add Animal(Y/N): ");
            addAnimalInput = keyboard.nextLine();
            while(addAnimalInput.toUpperCase().charAt(0)!='Y'&&addAnimalInput.toUpperCase().charAt(0)!='N')
            {
                System.out.print("Invalid Input\nAdd Animal(Y/N): ");
                addAnimalInput = keyboard.nextLine();
            }
            addAnimal = addAnimalInput.toUpperCase().charAt(0)=='Y'?true:false;
        }

        //ZooManagement.newAnimal(zoo);


        //End Lines to Replace

        for (Talkable thing: zoo) {
            printOut(thing);

        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput inData = new FileInput("animals.txt");
        String line;
        while ((line = inData.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
