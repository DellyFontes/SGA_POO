package eleicoesjava.Modelo;

import java.util.*;

public class Dados_Senhas {

    // Listas estáticas para armazenar os cidadãos, partidos e candidatos registrados
    public static ArrayList<Eleitor> eleitores = new ArrayList<>();
    public static ArrayList<Partido> partidos = new ArrayList<>();
    public static ArrayList<Candidato> candidatos = new ArrayList<>();


    // Gera uma senha numérica única para um cidadão
public static String gerarSenhaEleitor() {
    Random rand = new Random();
    String senha;

    do {
        StringBuilder sb = new StringBuilder();

        // Gera 7 dígitos
        for (int i = 0; i < 7; i++) {
            sb.append(rand.nextInt(10));
        }

        // Gera 3 letras maiúsculas
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + rand.nextInt(26));
            sb.append(letra);
        }

        senha = sb.toString();

    } while (isSenhaCidadaoExistente(senha)); // repete se já existir

    return senha;
}


    // Gera uma senha única para um candidato (formato: 3 letras maiúsculas + 2 dígitos)
    public static String gerarSenhaCandidato() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        String senha;

        // Gera uma senha de candidato única até que não exista
        do {
            sb.setLength(0); // limpa o StringBuilder

            // Gera 3 letras aleatórias
            for (int i = 0; i < 3; i++) {
                sb.append(letras.charAt(rand.nextInt(letras.length())));
            }

            // Gera 2 dígitos aleatórios
            for (int i = 0; i < 2; i++) {
                sb.append(rand.nextInt(10));
            }

            senha = sb.toString(); // converte para string

        } while (isSenhaCandidatoExistente(senha)); // repete se a senha já existir

        return senha; // retorna a senha única
    }

    // Verifica se uma senha já foi usada por um cidadão
    private static boolean isSenhaCidadaoExistente(String senha) {
        for (Eleitor e : eleitores) {
            if (e.getCodigo().equalsIgnoreCase(senha)) {
                return true; // senha já existe
            }
        }
        return false; // senha é nova
    }

    // Verifica se uma senha já foi usada por um candidato
    private static boolean isSenhaCandidatoExistente(String senha) {
        for (Candidato c : candidatos) {
            if (c.getCodigo().equalsIgnoreCase(senha)) {
                return true; // senha já existe
            }
        }
        return false; // senha é nova
    }

    // Busca um cidadão pelo número da senha
    public static Cidadao buscarPorSenha(String senha) {
        for (Eleitor c : eleitores) {
            if (c.getCodigo().equalsIgnoreCase(senha)) {
                return c; // cidadão encontrado
            }
        }
        return null; // não encontrado
    }

    // Busca um partido pelo nome exato
    public static Partido getPartidoPorNome(String nome) {
        for (Partido p : partidos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p; // partido encontrado
            }
        }
        return null; // não encontrado
    }

    // Busca um candidato pelo nome (sem diferenciar maiúsculas de minúsculas)
    public static Candidato getCandidatoPorNome(String nome) {
        for (Candidato c : candidatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c; // candidato encontrado
            }
        }
        return null; // não encontrado
    }

  }

    // Método para carregar todos os dados dos arquivos
     

