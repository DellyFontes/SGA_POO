package eleicoesjava.Modelo;

import java.util.Date;



public class Funcionario  extends Eleitor  {
    private String codigoFuncionario;
    private int celular;
    private int nivelAcesso;

    public Funcionario(String codigoFuncionario, int celular, int nivelAcesso, String codigo, boolean votou, int id, String nome, String BI, String genero, String Distrito, Date dataNasc) {
        super(codigo, votou, id, nome, BI, genero, Distrito, dataNasc);
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.nivelAcesso = nivelAcesso;
    }

    public Funcionario(String codigoFuncionario, int celular, int nivelAcesso, String codigo) {
        super(codigo);
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.nivelAcesso = nivelAcesso;
    }

    public Funcionario(String codigoFuncionario, int celular, int nivelAcesso) {
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.nivelAcesso = nivelAcesso;
    }

 
    

 
    

    public Funcionario() {
       super();
        
    }

    

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

}
