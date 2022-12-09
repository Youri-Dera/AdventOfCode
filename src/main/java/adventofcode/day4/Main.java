package adventofcode.day4;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Path PATH = Paths.get("src/main/java/adventofcode/day4/input.txt");
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );
    private static final List<String> characterList = new ArrayList<>();
    private static int first = 0;
    private static int second = 0;
    private static int third = 0;
    private static int fourth = 0;
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH.toString()))) {
            int counter = 0;
            String baseChar = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (!line.isEmpty()) {
                    for (char character : line.toCharArray()) {
                        if(Character.isDigit(character)){
                            baseChar += character;
                        }
                        else{
                            characterList.add(baseChar);
                            baseChar = "";
                        }
                    }
                    System.out.println(characterList);
                    characterList.clear();

//                    2-4,6-8
//                    2-3,4-5
//                    5-7,7-9

//                    2-8,3-7
//                    6-6,4-6

//                    2-6,4-8

//                    first   =   Integer.parseInt(characterList.get(0).toString());
//                    second  =   Integer.parseInt(characterList.get(1).toString());
//                    third   =   Integer.parseInt(characterList.get(2).toString());
//                    fourth  =   Integer.parseInt(characterList.get(3).toString());
//
//                    if(first >= third && first <= fourth){
//                        if(second >= third && second <= fourth){
//                            counter += 1;
//                            //System.out.println(characterList);
//                            characterList.clear();
//                        }
//                    }
//                    if(third >= first && third <= second){
//                        if(fourth >= first && fourth <= second){
//                            counter += 1;
//                            //System.out.println(characterList);
//                            characterList.clear();
//                        }
//                    }
//                    characterList.clear();

                } else { LOGGER.info("Check input3.txt for invalid characters."); }
            } System.out.println("\nAmount of items = " + counter);
            System.out.println("Test = " + (Integer.parseInt(characterList.get(0).toString()) + Integer.parseInt(characterList.get(0).toString())));
        } catch (Exception e) { LOGGER.info(e.toString()); }
    }
}