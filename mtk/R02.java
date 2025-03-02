package mtk;

import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

class R02 extends R00 {

    // This method will extend the behavior and output data to a text file using StringBuilder
    public void writeDataToFile(String filename) {
        Map<String, Object> data = getData(); // Inherit data from R00
        StringBuilder sb = new StringBuilder();

        // Use StringBuilder to append the data
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue().toString()).append("\n");
        }

        // Append the normal variables first
        sb.append("Job Title: ").append(getJobTitle()).append("\n");
        sb.append("Salary: ").append(getSalary()).append("\n\n");

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



