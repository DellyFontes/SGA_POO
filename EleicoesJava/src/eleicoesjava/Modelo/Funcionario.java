package eleicoesjava.Modelo;

import java.util.Date;



public class Funcionario  extends Eleitor  {
    private String codigoFuncionario;
    private int celular,tipoFuncionario;

    public Funcionario(String codigoFuncionario, int celular, int tipoFuncionario, String codigo, boolean votou, int id, String nome, String BI, String genero, String Distrito, Date dataNasc) {
        super(codigo, votou, id, nome, BI, genero, Distrito, dataNasc);
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Funcionario(String codigoFuncionario, int celular, int nivelAcesso, String codigo) {
        super(codigo);
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.tipoFuncionario = nivelAcesso;
    }

    public Funcionario(String codigoFuncionario, int celular, int tipoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
        this.celular = celular;
        this.tipoFuncionario = tipoFuncionario;
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

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

}
