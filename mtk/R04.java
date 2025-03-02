package mtk;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class R04 extends R03 {

   
    // Method to write data to a file using StringBuilder
    public void writeDataToFile(String filename) {
        Map<String, Object> data = getData(); // Inherit and use getData() from R01
        StringBuilder sb = new StringBuilder();

        // Use StringBuilder to format data
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue().toString()).append("\n");
        }

        // Write the contents of StringBuilder to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(sb.toString());
            System.out.println("Data successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    
}
