

package eleicoesjava.Modelo;

import java.util.Date;
import java.util.Random;



public class Eleitor  extends  Cidadao{
    private String codigo;

    public Eleitor(String codigo, int id, String nome, String BI, String genero, String Distrito, Date dataNasc) {
        super(id, nome, BI, genero, Distrito, dataNasc);
        this.codigo = codigo;
    }

    public Eleitor(String codigo, String nome, String BI, String genero, String Distrito, Date dataNasc) {
        super(nome, BI, genero, Distrito, dataNasc);
        this.codigo = codigo;
    }

    public Eleitor(String codigo) {
        this.codigo = codigo;
    }

    

    public Eleitor() {
        super();
    }

    


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     

   

            
    

}

