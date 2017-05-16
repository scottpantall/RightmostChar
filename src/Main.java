/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            //System.out.println(line);
            rightMostChar(line);
            
            
        }
    }
    
    public static void rightMostChar(String line) {
        String[] input = line.split(",");
        int index;
        
        if(input.length > 1)
            index = input[0].lastIndexOf(input[1]);
        else
            index = input[0].lastIndexOf(" ");
        
        System.out.println(index);
    }
}
