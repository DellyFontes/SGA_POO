package Model.Dao;

import Connection.ConnectionFactory;
import eleicoesjava.Modelo.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FuncionarioDao {

    
    public void Salvar(Funcionario f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(" Insert into funcionario (codigoFuncionario, celular, nome, BI,"
                    + " genero, Distrito, dataNascimento) Values (?,?,?,?,?,?) ");
            stmt.setString(1, f.getCodigoFuncionario());            // String - código
            stmt.setInt(2, f.getCelular());              // String - nome
            stmt.setString(3, f.getNome());                // String - BI
            stmt.setString(4, f.getBI());                // String - BI
            stmt.setString(5, f.getGenero());            // String - genero
            stmt.setString(6, f.getDistrito());         // String - Distrito
            stmt.setDate(7, new java.sql.Date(f.getDataNasc().getTime())); // Date - dataNascimento
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Salvar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Funcionario> listarTabela() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> eleitores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select id, nome, bi, dataNascimento, genero  from funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setBI(rs.getString("BI"));
                f.setDataNasc(rs.getDate("dataNascimento"));
                f.setGenero(rs.getString("Genero"));
                eleitores.add(f);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return eleitores;
    }

    public void atualizar(Funcionario f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Update funcionario set , nome = ?, BI = ? , dataNAscimento = ?, Distrito = ?  Where id = ? ");

            stmt.setInt(1, f.getId());                   // int
            stmt.setString(2, f.getNome());              // String
            stmt.setString(3, f.getBI());                // String
            stmt.setDate(4, (Date) f.getDataNasc());
            stmt.setString(5, f.getDistrito());
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Atualizar!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void eliminar(Funcionario f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("Delete from Funcionario Where id = ? ");

            stmt.setInt(1, f.getId());

            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao Excluir!!! " + ex);
            System.out.println(" ");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Funcionario> busca(String termo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String filtro = " %"+termo+"%";
        List<Funcionario> funcionario = new ArrayList<>();

        try {
            stmt = con.prepareStatement(" Select * from funcionario where nome Like ? or BI like?");
            stmt.setString(1, filtro);
            stmt.setString(2, filtro);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setBI(rs.getString("BI"));
                f.setGenero(rs.getString("dataNascimento"));
                f.setDistrito(rs.getString("Distrito"));
                funcionario.add(f);

            }
            System.out.println("Listado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {

            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return funcionario;
    }

    
}

