package BussinessLogic.Entities;

public class Localidad {
    
    private int         ID_LOCALIDAD;      
    private int         ID_LOCALIDAD_PADRE; 
    private int         ID_LOCALIDAD_TIPO;  
    private String      NOMBRE;           
    private String      ESTADO;

    public Localidad(int iD_LOCALIDAD, int iD_LOCALIDAD_PADRE, int iD_LOCALIDAD_TIPO, String nOMBRE, String eSTADO) {
        this.ID_LOCALIDAD = iD_LOCALIDAD;
        this.ID_LOCALIDAD_PADRE = iD_LOCALIDAD_PADRE;
        this.ID_LOCALIDAD_TIPO = iD_LOCALIDAD_TIPO;
        this.NOMBRE = nOMBRE;
        this.ESTADO = eSTADO;
    }
    public int getID_LOCALIDAD() {
        return ID_LOCALIDAD;
    }
    public void setID_LOCALIDAD(int iD_LOCALIDAD) {
        ID_LOCALIDAD = iD_LOCALIDAD;
    }
    public int getID_LOCALIDAD_PADRE() {
        return ID_LOCALIDAD_PADRE;
    }
    public void setID_LOCALIDAD_PADRE(int iD_LOCALIDAD_PADRE) {
        ID_LOCALIDAD_PADRE = iD_LOCALIDAD_PADRE;
    }
    public int getID_LOCALIDAD_TIPO() {
        return ID_LOCALIDAD_TIPO;
    }
    public void setID_LOCALIDAD_TIPO(int iD_LOCALIDAD_TIPO) {
        ID_LOCALIDAD_TIPO = iD_LOCALIDAD_TIPO;
    }
    public String getNOMBRE() {
        return NOMBRE;
    }
    public void setNOMBRE(String nOMBRE) {
        NOMBRE = nOMBRE;
    }
    public String getESTADO() {
        return ESTADO;
    }
    public void setESTADO(String eSTADO) {
        ESTADO = eSTADO;
    } 
}
