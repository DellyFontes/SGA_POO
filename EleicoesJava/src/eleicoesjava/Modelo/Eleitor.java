

package eleicoesjava.Modelo;

import java.util.Date;
import java.util.Random;



public class Eleitor  extends  Cidadao{
    private String codigo;
    private boolean votou;

    public Eleitor(String codigo, boolean votou, int id, String nome, String BI, String genero, String provincia, String Distrito, Date dataNasc) {
        super(id, nome, BI, genero, provincia, Distrito, dataNasc);
        this.codigo = codigo;
        this.votou = votou;
    }

    public Eleitor(String codigo, boolean votou) {
        this.codigo = codigo;
        this.votou = votou;
    }

   

    public Eleitor() {
        super();
    }

    public boolean isVotou() {
        return votou;
    }

    public void setVotou(boolean votou) {
        this.votou = votou;
    }

    
     private String gerarCodigo(){
         Random random=  new Random();
         int numeros = 100000+ random.nextInt(900000);
         char letra1 = (char)('A'+random.nextInt(26));
         char letra2 =(char)('A'+random.nextInt(26));
         String  codigoAleatorio= numeros + ""+letra1+letra2;
         
         
         return codigoAleatorio;
     }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     

   

            
    

}

