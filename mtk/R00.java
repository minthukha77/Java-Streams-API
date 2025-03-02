package mtk;
import java.util.Map;
import java.util.HashMap;

public class R00 {
    
    private Map<String,Object> data;
    private String jobTitle; // Normal variable
    private double salary;    // Normal variable

    public R00() {
       initialize();
    }

    private void initialize(){

         // Initialize with some data
         data = new HashMap<>();
         data.put("Name", "John Doe");
         data.put("Age", 30);
         data.put("City", "New York");
 
         jobTitle = "Software Developer";
         salary = 75000.50;
    }

    public Map<String, Object> getData() {
        return data;
    }

    // Getter methods for normal variables
    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}
