package BussinessLogic.Entities;

public class Localidad {
    private int     IDLOCALIDAD     ;
    private int     HID             ;
    private String  NOMBRE          ;
    private String  ESTADO          ;  
    private int     IDLOCALIDADTIPO ;

    public Localidad (int IDLOCALIDAD, int HID, String NOMBRE, String ESTADO,int IDLOCALIDADTIPO){
        this.IDLOCALIDAD = IDLOCALIDAD;
        this.HID  = HID;          
        this.NOMBRE   = NOMBRE;      
        this.ESTADO     = ESTADO;    
        this.IDLOCALIDADTIPO = IDLOCALIDADTIPO;
    }
    public int getIDLOCALIDAD() {
        return IDLOCALIDAD;
    }
    public void setIDLOCALIDAD(int iDLOCALIDAD) {
        IDLOCALIDAD = iDLOCALIDAD;
    }
    public int getHID() {
        return HID;
    }
    public void setHID(int hID) {
        HID = hID;
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
    public int getIDLOCALIDADTIPO() {
        return IDLOCALIDADTIPO;
    }
    public void setIDLOCALIDADTIPO(int iDLOCALIDADTIPO) {
        IDLOCALIDADTIPO = iDLOCALIDADTIPO;
    }
           
    
}
