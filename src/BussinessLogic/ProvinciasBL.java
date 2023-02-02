package BussinessLogic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BussinessLogic.Entities.Localidad;
import DataAccess.LocalidadDAC;
import Framework.AppException;
public class ProvinciasBL {
    public List<Localidad> getAllProvincias() throws AppException {
        try {
            LocalidadDAC localidadDAC = new LocalidadDAC();
            List<Localidad> paises = new ArrayList<Localidad>();

            ResultSet rs = localidadDAC.getAllProvincias();
            while (rs.next()) {
                Localidad p = new Localidad(
                        rs.getInt("ID_LOCALIDAD"),
                        rs.getInt("ID_LOCALIDAD_PADRE"),
                        rs.getInt("ID_LOCALIDAD_TIPO"),
                        rs.getString("NOMBRE"),
                        rs.getString("ESTADO"));
                paises.add(p);
            }
            
            return paises;
        } catch (SQLException e) {
            throw new AppException(e, getClass());
        }

    }
}
