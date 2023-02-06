
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PruebaApi {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/ditto");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            if (status == 200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println(content.toString());
            
            } else {
                System.out.println("Error al obtener la respuesta de la API");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
