package mtk;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        R04 obj = new R04();
        
        // Setting some data
        Map<String, Object> data = Map.of(
            "Name", "John Doe",
            "Age", 30,
            "City", "New York"
        );
        obj.setData(data);

        // Writing data to a file
        obj.writeDataToFile("output.txt");


    }
}