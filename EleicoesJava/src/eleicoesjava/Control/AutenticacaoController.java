package eleicoesjava.Control;

import eleicoesjava.Modelo.Funcionario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AutenticacaoController {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Funcionario usuarioLogado = null;
    
   static {
        try {
          
            funcionarios.add(new Funcionario(
                "1111", 
                911111111, 
                5,
                "ADMIN001",false, 
                1, 
                "admin", 
                "123456789LA001", 
                "Masculino", 
                "Marraquene",
                new Date(90, 0, 1) 
            ));
            
            funcionarios.add(new Funcionario(
                "2222", 
                922222222, 
                1, 
                "NIV1001",false ,
                2, 
                "funcionario", 
                "123456789LA002", 
                "Feminino", 
                "Matola",
                new Date(95, 5, 15) 
            ));
            
            funcionarios.add(new Funcionario(
                "3333", 
                933333333, 
                2, 
                "NIV2001",false, 
                3, 
                "funcionario", 
                "123456789LA003", 
                "Masculino", 
                "katembe",
                new Date(92, 8, 20) // 20 de Setembro de 1992
            ));
            
            funcionarios.add(new Funcionario(
                "4444", 
                944444444, 
                3, 
                "NIV3001",false, 
                4, 
                  "funcionario", 
                "123456789LA004", 
                "Feminino", 
                "Boane",
                new Date(88, 3, 10) 
            ));
            
           
            funcionarios.add(new Funcionario(
                "5555", 
                955555555, 
                4, 
                "NIV4001",false, 
                5, 
                "funcionario", 
                "123456789LA005", 
                "Masculino", 
                "Magude",
                new Date(85, 11, 25) 
            ));
            
        } catch (Exception e) {
            System.err.println("Erro ao inicializar funcionários: " + e.getMessage());
        }
    }
    
    public static boolean autenticar(String usuario, String senha) {
        for (Funcionario func : funcionarios) {
            if (func.getNome().equals(usuario) && func.getCodigoFuncionario().equals(senha)) {
                usuarioLogado = func;
                return true;
            }
        }
        return false;
    }
    
    public static Funcionario getUsuarioLogado() {
        return usuarioLogado;
    }
    
    public static void logout() {
        usuarioLogado = null;
    }
    
    // Métodos de validação de acesso
    public static boolean temAcessoRecenciamento() {
        return usuarioLogado != null && usuarioLogado.getNivelAcesso() >= 1;
    }
    
    public static boolean temAcessoCadastros() {
        return usuarioLogado != null && usuarioLogado.getNivelAcesso() >= 2;
    }
    
    public static boolean temAcessoVotacoes() {
        return usuarioLogado != null && usuarioLogado.getNivelAcesso() >= 3;
    }
    
    public static boolean temAcessoRelatorios() {
        return usuarioLogado != null && usuarioLogado.getNivelAcesso() >= 4;
    }
    
    public static boolean temAcessoTotal() {
        return usuarioLogado != null && usuarioLogado.getNivelAcesso() == 5;
    }
}
