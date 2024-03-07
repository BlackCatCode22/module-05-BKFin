package ZooApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // local variables
        String name = "NeedName";
        String species;
        int age;

        // ArrayList of Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // HashMap will be holding animal count

        HashMap<String, Integer> animalCount = new HashMap<>();

        // Open an external file, parse it line by line, and get age and species
        String filePath = "./ZooApp/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Age is in the first element of the array named parts
                String[] parts = line.split(", ");

                // Check if the line has at least 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    // System.out.println("ageAndSpecies: " + ageAndSpecies);

                    // Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split(" ");
                    for (int i = 0; i < 5; i++) {
                        // System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    // Create a new animal object.
                    Animal myAnimal = new Animal(name, age, species);

                    // Add the new Animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

        // We now have an arrayList of Animals. Let's output them!
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Animal name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: "
                    + animal.getSpecies());
        }
        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);

        // Parse the animalNames.txt file and pull the names separated by commas
        // Then use the setter to overwrite the names in the ArrayList

        // ArrayList of Hyena names.
        ArrayList<String> hyenaNames = new ArrayList<>();
        // ArrayList of Lion names.
        ArrayList<String> lionNames = new ArrayList<>();
        // ArrayList of Tiger names.
        ArrayList<String> tigerNames = new ArrayList<>();
        // ArrayList of Bear names.
        ArrayList<String> bearNames = new ArrayList<>();

        // try {
        // Scanner scanner = new Scanner(new
        // File("./ZooApp/animalNames.txt")).useDelimiter(",");
        // String result = scanner.next();
        // for (Animal animal : animals) {
        // if (result != null) {
        // animal.setName(result);
        // result = scanner.next();
        // }
        // }
        // scanner.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // Open an external file, parse it line by line, and fill the name arrayLists
        String aFilePath = "./ZooApp/animalNames.txt";
        File aFile = new File(aFilePath);

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                System.out.println("\n aLine = " + aLine);

                if (aLine.contains("Hyena")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the hyena names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myHyenaNamesArray = scanner.nextLine().split(", ");
                    // Output the names to see if this works.
                    for (String someName : myHyenaNamesArray)
                        System.out.println(someName);
                    // Use the same for loop to get the array into the proper ArrayList.
                    for (String someName : myHyenaNamesArray)
                        hyenaNames.add(someName);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                System.out.println("\n aLine = " + aLine);

                if (aLine.contains("Lion")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the lion names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myLionsNamesArray = scanner.nextLine().split(", ");
                    // Output the names to see if this works.
                    for (String someName : myLionsNamesArray)
                        System.out.println(someName);
                    // Use the same for loop to get the array into the proper ArrayList.
                    for (String someName : myLionsNamesArray)
                        lionNames.add(someName);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                System.out.println("\n aLine = " + aLine);

                if (aLine.contains("Tiger")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the tiger names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myTigerNamesArray = scanner.nextLine().split(", ");
                    // Output the names to see if this works.
                    for (String someName : myTigerNamesArray)
                        System.out.println(someName);
                    // Use the same for loop to get the array into the proper ArrayList.
                    for (String someName : myTigerNamesArray)
                        tigerNames.add(someName);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                System.out.println("\n aLine = " + aLine);

                if (aLine.contains("Bear")) {
                    // Skip the next line because it is a blank line.
                    scanner.nextLine();
                    // Now... this line will have the bear names!
                    // Split this line on a comma and a space and save the hyena names to a String
                    // array.
                    String[] myBearsNamesArray = scanner.nextLine().split(", ");
                    // Output the names to see if this works.
                    for (String someName : myBearsNamesArray)
                        System.out.println(someName);
                    // Use the same for loop to get the array into the proper ArrayList.
                    for (String someName : myBearsNamesArray)
                        bearNames.add(someName);

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
            e.printStackTrace();
        }


        for (Animal animal : animals) {
            if (animal.species.equals("hyena")) {
                animal.setName(hyenaNames.getFirst());
                // Pop the first hyena name off the list
                hyenaNames.remove(0);
            }
            if (animal.species.equals("lion")) {
                animal.setName(lionNames.getFirst());
                // Pop the first lion name off the list
                lionNames.remove(0);
            }
            if (animal.species.equals("tiger")) {
                animal.setName(tigerNames.getFirst());
                // Pop the first tiger name off the list
                tigerNames.remove(0);
            }
            if (animal.species.equals("bear")) {
                animal.setName(bearNames.getFirst());
                // Pop the first bear name off the list
                bearNames.remove(0);
            }


        }


        // Write the report, iterating through the animal objects and outputting the
        // data by species with name and age
        // At the end of the report, pull the HashMap data to show a tally of animals
        // per species

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./ZooApp/newAnimals.txt"));
            String animalReport;
            writer.write(" -+- Super Snazzy New Animal Report -+- \n");
            for (Animal animal : animals) {
                animalReport = ("\n" + "[Animal] " + animal.getSpecies() + " [Name] " + animal.getName() + " [Age] "
                        + animal.getAge());
                writer.write(animalReport);
            }
            writer.write("\n\n" + "Current Species Count: ");
            for (Animal animal : animals) {
                String animalType = animal.getSpecies();
                animalCount.put(animalType, animalCount.getOrDefault(animalType, 0) + 1);
            }
            writer.write(animalCount.toString());
            writer.write("\n" + "Total Number of Animals: " + Animal.numOfAnimals);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
