
/**
 * @Authors     : Gabriel Jaya, Jonathan Luzuriaga, Daniel Moncayo, Daniela Molina, Isaac Rivera
 * @Copyright   : TeamMarremoto
 * Date         : 01-02-2023
 * @Version     : 1.0
 */
import BussinessLogic.CantonesBL;
import BussinessLogic.PaisesBL;
import BussinessLogic.ParroquiasBL;
import BussinessLogic.ProvinciasBL;
import BussinessLogic.Entities.Localidad;
import Framework.AppConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        // Configuracion de propiedades de la aplicacion
        AppConfiguration.load("config.properties");
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.print("ID_LOCALIDAD\t\t");
        System.out.print("ID_LOCALIDAD_PADRE\t");
        System.out.print("ID_LOCALIDAD_TIPO\t");
        System.out.print("NOMBRE\t\t");
        System.out.println("      ESTADO");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        // Imprimir todos los paises
        try {
            PaisesBL paises = new PaisesBL();
            for (Localidad p : paises.getAllPaises()) {

                System.out.print(p.getID_LOCALIDAD() + "\t\t" + "                 ");
                System.out.print(p.getID_LOCALIDAD_PADRE() + "\t\t" + "         ");
                System.out.print(p.getID_LOCALIDAD_TIPO() + "\t\t");
                System.out.print(p.getNOMBRE() + "\t\t");
                System.out.println(p.getESTADO() + "\t\t");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        // Imprimir todas las provincias
        try {
            ProvinciasBL provincias = new ProvinciasBL();
            for (Localidad p : provincias.getAllProvincias()) {

                System.out.print(p.getID_LOCALIDAD() + "\t\t" + "                 ");
                System.out.print(p.getID_LOCALIDAD_PADRE() + "\t\t" + "         ");
                System.out.print(p.getID_LOCALIDAD_TIPO() + "\t\t");
                System.out.print(p.getNOMBRE() + "\t\t");
                System.out.println(p.getESTADO() + "\t\t");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        // Imprimir todos los cantones
        try {
            CantonesBL cantones = new CantonesBL();
            for (Localidad c : cantones.getAllCantones()) {

                System.out.print(c.getID_LOCALIDAD() + "\t\t" + "                 ");
                System.out.print(c.getID_LOCALIDAD_PADRE() + "\t\t" + "         ");
                System.out.print(c.getID_LOCALIDAD_TIPO() + "\t\t");
                System.out.print(c.getNOMBRE() + "\t\t");
                System.out.println(c.getESTADO() + "\t\t");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        // Imprimir todas las parroquias
        try {
            ParroquiasBL parroquias = new ParroquiasBL();
            for (Localidad p : parroquias.getAllParroquias()) {

                System.out.print(p.getID_LOCALIDAD() + "\t\t" + "                 ");
                System.out.print(p.getID_LOCALIDAD_PADRE() + "\t\t" + "         ");
                System.out.print(p.getID_LOCALIDAD_TIPO() + "\t\t");
                System.out.print(p.getNOMBRE() + "\t\t");
                System.out.println(p.getESTADO() + "\t\t");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");

    }

}
