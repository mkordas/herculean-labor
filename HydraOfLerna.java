import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class HydraOfLerna {

    public static void main(String[] args) throws IOException {
        FileInputStream stream = null;
        try {
            for (String name : args) {
                stream = new FileInputStream(name);
            }
        } finally {
            if (stream != null) {
                stream.close();
            }
        }

    }
}
