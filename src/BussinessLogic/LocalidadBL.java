package BussinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BussinessLogic.Entities.Localidad;
import DataAccess.LocalidadDAC;
import Framework.AppException;

public class LocalidadBL {
    public List<Localidad> GetAllPaises() throws AppException{
        try {
            LocalidadDAC localidadDAC = new LocalidadDAC();  
            List<Localidad> paises = new ArrayList<Localidad>();
            ResultSet rs = localidadDAC.getAllPaises();
            while(rs.next())    {
                Localidad p = new Localidad(
                    rs.getInt("IDLOCALIDAD"),
                    rs.getInt("HID"),
                    rs.getString("NOMBRE"),
                    rs.getString("ESTADO"),
                    rs.getInt("IDLOCALIDADTIPO"));
                paises.add(p);
            }
            return paises;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }



    }




}
