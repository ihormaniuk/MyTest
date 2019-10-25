package Transport;

public class Helm {                 //кермо
    private int DiameterHelm;
    private String TypeHelm;
    private String MaterialHelm;

    public void DiameterHelmPlus(){
        int a = DiameterHelm++;
    }

    public String toString(){
        return DiameterHelm + " - " + TypeHelm + " - " + MaterialHelm;
    }

    public Helm(){

    }

    public Helm(int DiameterHelm,String TypeHelm,String MaterialHelm){
        this.DiameterHelm = DiameterHelm;
        this.TypeHelm = TypeHelm;
        this.MaterialHelm = MaterialHelm;
    }

    public void setDiameterHelm(){
        this.DiameterHelm = DiameterHelm;
    }

    public int getDiameterHElm(){
        return DiameterHelm;
    }

    public void setTypeHelm(){
        this.TypeHelm = TypeHelm;
    }

    public String getTypeHelm(){
        return TypeHelm;
    }

    public void setMaterialHelm(){
        this.MaterialHelm = MaterialHelm;
    }

    public String getMaterialHelm(){
        return MaterialHelm;
    }


}
