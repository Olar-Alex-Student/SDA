package Ex_3;

import Ex_2.Punct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poligon {
    public List<String> lines = new ArrayList<>();
    public String filePath = ".././Lab1.txt";
    public List<int[]> valuesList = new ArrayList<>();
    public List<Punct> varfuri = new ArrayList<>();

    public Poligon() throws Exception {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Read each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public void Prelucreaza() {
        for (String line : lines) {
            String[] parts = line.split(" ");
            int[] values = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                values[i] = Integer.parseInt(parts[i]);
            }
            this.valuesList.add(values);
        }
    }
}
