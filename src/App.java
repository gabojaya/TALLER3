import BussinessLogic.LocalidadBL;
import BussinessLogic.Entities.Localidad;
import Framework.AppConfiguration;
import Framework.AppException;

public class App {
    public static void main(String[] args) throws Exception {
       
       //Configuracion de propiedades de la aplicaci�n
       AppConfiguration.load("src/config.properties"); 
       System.out.println(AppConfiguration.getDBName());
       System.out.println(AppConfiguration.getDBPathConnection());

       try {
           LocalidadBL paises = new LocalidadBL();
           for (Localidad s : paises.GetAllPaises()) {
               System.out.println(s.getNOMBRE());
           }
       } catch (Exception e) {
           // TODO: handle exception
       }






    }

    
}
