package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooManagement {

    public static void newAnimal(ArrayList<Talkable> animalList)
    {
        System.out.print("Add Dog(D), Cat(C), or Student(S): ");
        Scanner keyboard = new Scanner(System.in);
        String addAnimal = keyboard.nextLine();
        while(addAnimal.toUpperCase().charAt(0)!='D'&&addAnimal.toUpperCase().charAt(0)!='C'&&addAnimal.toUpperCase().charAt(0)!='S')
        {
            System.out.println("Invalid Input\nAdd Dog(D), Cat(C), or Student(S): ");
            addAnimal = keyboard.nextLine();
        }
        switch(addAnimal.toUpperCase().charAt(0))
        {
            case 'D':
                System.out.print("Dog's Name: ");
                String name = keyboard.nextLine();
                System.out.print("Is Dog Friendly(Y/N): ");
                String friendlyInput = keyboard.nextLine();
                while(friendlyInput.toUpperCase().charAt(0)!='Y'&&friendlyInput.toUpperCase().charAt(0)!='N')
                {
                    System.out.print("Invalid Input\nIs Dog Friendly(Y/N): ");
                    friendlyInput = keyboard.nextLine();
                }
                boolean friendly;
                if(friendlyInput.toUpperCase().charAt(0)=='Y')
                {
                    friendly=true;
                }
                else
                {
                    friendly=false;
                }
                Dog addDog = new Dog(friendly,name);
                animalList.add(addDog);
                break;
            case 'C':
                System.out.print("Cat's Name: ");
                name = keyboard.nextLine();
                System.out.print("Number of Mice Killed: ");
                String miceInput = keyboard.nextLine();
                boolean validInput = true;
                int miceKilled=0;
                try
                {
                    miceKilled = Integer.parseInt(miceInput);
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("Invalid Input");
                    validInput=false;
                }
                while(!validInput)
                {
                    System.out.print("Number of Mice Killed: ");
                    miceInput = keyboard.nextLine();
                    validInput = true;
                    try
                    {
                        miceKilled = Integer.parseInt(miceInput);
                    }
                    catch (NumberFormatException nfe)
                    {
                        System.out.println("Invalid Input");
                        validInput=false;
                    }
                }

                Cat addCat = new Cat(miceKilled,name);
                animalList.add(addCat);
                break;
            case 'S':
                System.out.print("Student's Name: ");
                name = keyboard.nextLine();
                System.out.print("Student Age: ");
                String ageInput = keyboard.nextLine();
                validInput = true;
                int age=0;
                try
                {
                    age = Integer.parseInt(ageInput);
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("Invalid Input");
                    validInput=false;
                }
                while(!validInput)
                {
                    System.out.print("Student Age: ");
                    ageInput = keyboard.nextLine();
                    validInput = true;
                    try
                    {
                        age = Integer.parseInt(ageInput);
                    }
                    catch (NumberFormatException nfe)
                    {
                        System.out.println("Invalid Input");
                        validInput=false;
                    }
                }

                Student addStudent = new Student(age,name);
                animalList.add(addStudent);
                break;

        }
    }

}
