package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class LocalidadDAC extends SQLiteDataHelper {

    public LocalidadDAC() {

        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllPaises() throws AppException {
        try {
            String sql = "SELECT  * " +
                    "FROM    LOCALIDAD " +
                    "WHERE   ID_LOCALIDAD_TIPO = 1 ";
            return getResultSet(sql);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPais()");
        }
    }

    // public ResultSet getPaisById(int IdPais) throws AppException {
    //     try {
    //         String sql = "SELECT  * " +
    //                 "FROM   LOCALIDAD " +
    //                 "WHERE  ID_LOCALIDAD_TIPO = 1 " +
    //                 "AND    ID_LOCALIDAD_PADRE = ? ";
    //         Connection conn = getConnection();
    //         PreparedStatement pstmt = conn.prepareStatement(sql);
    //         pstmt.setInt(1, IdPais);
    //         return pstmt.executeQuery();
    //     } catch (SQLException e) {
    //         throw new AppException(e, getClass(), "getPaisById()");
    //     }
    // }

    public ResultSet getAllProvincias() throws AppException {
        try {
            String sql = "SELECT  * " +
                    "FROM    LOCALIDAD " +
                    "WHERE   ID_LOCALIDAD_TIPO = 2 ";
            return getResultSet(sql);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllProvincia()");
        }
    }

    // public ResultSet getProvinciaById(int IdPais) throws AppException {
    //     try {
    //         String sql = "SELECT  * " +
    //                 "FROM    LOCALIDAD " +
    //                 "WHERE  ID_LOCALIDAD_TIPO = 2 " +
    //                 "AND    ID_LOCALIDAD_PADRE = ? ";
    //         Connection conn = getConnection();
    //         PreparedStatement pstmt = conn.prepareStatement(sql);
    //         pstmt.setInt(1, IdPais);
    //         return pstmt.executeQuery();
    //     } catch (SQLException e) {
    //         throw new AppException(e, getClass(), "getProvinciaById()");
    //     }
    // }

    public ResultSet getAllCantones() throws AppException {
        try {
            String sql = "SELECT  * " +
                    "FROM    LOCALIDAD " +
                    "WHERE   ID_LOCALIDAD_TIPO = 3 ";
            return getResultSet(sql);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCanton()");
        }
    }

    // public ResultSet getCantonById(int IdCanton) throws AppException {
    //     try {
    //         String sql = "SELECT  * " +
    //                 "FROM   LOCALIDAD " +
    //                 "WHERE  ID_LOCALIDAD_TIPO = 3 " +
    //                 "AND    ID_LOCALIDAD_PADRE = ? ";
    //         Connection conn = getConnection();
    //         PreparedStatement pstmt = conn.prepareStatement(sql);
    //         pstmt.setInt(1, IdCanton);
    //         return pstmt.executeQuery();
    //     } catch (SQLException e) {
    //         throw new AppException(e, getClass(), "getCantonById()");
    //     }
    // }

    public ResultSet getAllParroquias() throws AppException {
        try {
            String sql = "SELECT  * " +
                    "FROM    LOCALIDAD " +
                    "WHERE   ID_LOCALIDAD_TIPO = 4 ";
            return getResultSet(sql);
        } catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllParroquia()");
        }
    }

    // public ResultSet getParroquiaById(int IdParroquia) throws AppException {
    //     try {
    //         String sql = "SELECT  * " +
    //                 "FROM   LOCALIDAD " +
    //                 "WHERE  ID_LOCALIDAD_TIPO = 4 " +
    //                 "AND    ID_LOCALIDAD_PADRE = ? ";
    //         Connection conn = getConnection();
    //         PreparedStatement pstmt = conn.prepareStatement(sql);
    //         pstmt.setInt(1, IdParroquia);
    //         return pstmt.executeQuery();
    //     } catch (SQLException e) {
    //         throw new AppException(e, getClass(), "getParroquiaById()");
    //     }
    // }
}