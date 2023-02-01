package DataAccess;


import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class LocalidadDAC extends SQLiteDataHelper{

public LocalidadDAC(){

    super(AppConfiguration.getDBPathConnection());
}

public ResultSet getAllPaises() throws AppException{
    try {
        String sql ="SELECT NOMBRE" +
                    "FROM LOCALIDAD"+
                    "WHERE IDLOCALIDADTIPO = 1";
        return getResultSet(sql);
    } 
    catch (SQLException e) {
        throw new AppException(e, getClass(), "getAllSexo()");
    }
}








}