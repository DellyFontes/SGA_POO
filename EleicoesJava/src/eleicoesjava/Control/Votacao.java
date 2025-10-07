package eleicoesjava.Control;

import eleicoesjava.Modelo.Candidato;
import eleicoesjava.Modelo.Eleitor;
import eleicoesjava.Modelo.Partido;
import java.util.ArrayList;
import java.util.List;


public class Votacao {
    private List<Eleitor> eleitores;
    private List<Candidato> candidatos;
    private List<Partido> partidos;
    // numero de votos 
    private int totalVotosValidos;
    //numero de nao escolha
    private int totalVotosNulos;
    //quem nao votou
    private int totalVotosBrancos;
    
    public Votacao(){
       this.eleitores = new ArrayList<>();
        this.candidatos = new ArrayList<>();
        this.partidos = new ArrayList<>();
        this.totalVotosValidos = 0;
        this.totalVotosNulos = 0;
        this.totalVotosBrancos = 0;
    
    }
      // Método para verificar se eleitor já votou e validar a senha do candidato
    public boolean verificarVoto(String codigoEleitor) {
        // Verificar se eleitor existe
        Eleitor eleitor = buscarEleitorPorCodigo(codigoEleitor);
        if (eleitor == null) {
            System.out.println("Eleitor não encontrado!");
            return false;
        }

        
        if (eleitor.getVotou()) {
            System.out.println("Este eleitor já realizou o voto!");
            return false;
        }  return true;
    }
    
        // Método principal para realizar a votação
    public boolean realizarVotacao( String codigoEleitor, String senhaCandidato) {
       

        Eleitor eleitor = buscarEleitorPorCodigo(codigoEleitor);
        Candidato candidato = buscarCandidatoPorNumero(senhaCandidato);

        // Registrar voto
        eleitor.setVotou(true);
        
        // Atualizar votos do candidato
        candidato.setNumVotosCand(candidato.getNumVotosCand() + 1);
        
        // Atualizar votos do partido
        Partido partido = candidato.getPart();
        partido.setNumVotosPart(partido.getNumVotosPart() + 1);
        
        totalVotosValidos++;
        
        System.out.println("Voto registrado com sucesso para o candidato: " + candidato.getNome());
        return true;
    }
    
    // Método para votação em branco
    public boolean votarBranco(String codigoEleitor) {
        Eleitor eleitor = buscarEleitorPorCodigo(codigoEleitor);
        if (eleitor == null) {
            System.out.println("Eleitor não encontrado!");
            return false;
        }

        if (eleitor.getVotou()) {
            System.out.println("Este eleitor já realizou o voto!");
            return false;
        }

        eleitor.setVotou(true);
        totalVotosBrancos++;
        System.out.println("Voto em branco registrado com sucesso.");
        return true;
    }
    
     // Método para votação nula
    public boolean votarNulo(String codigoEleitor) {
        Eleitor eleitor = buscarEleitorPorCodigo(codigoEleitor);
        if (eleitor == null) {
            System.out.println("Eleitor não encontrado!");
            return false;
        }

        if (eleitor.getVotou()) {
            System.out.println("Este eleitor já realizou o voto!");
            return false;
        }

        eleitor.setVotou(true);
        totalVotosNulos++;
        System.out.println("Voto nulo registrado com sucesso.");
        return true;
    }

     // Método para calcular distribuição de assentos no parlamento (método D'Hondt)
    public void calcularDistribuicaoAssentos() {
        System.out.println("\n=== DISTRIBUIÇÃO DE ASSENTOS NO PARLAMENTO ===");
        System.out.println("Total de assentos: 250");
        System.out.println("Total de votos válidos: " + totalVotosValidos);

        List<Partido> partidosComVotos = new ArrayList<>();
        
        // Filtrar partidos com votos
        for (Partido partido : partidos) {
            if (partido.getNumVotosPart() > 0) {
                partidosComVotos.add(partido);
            }
        }

        //distribuição de 250 assentos
        int assentosRestantes = 250;
        int[] assentosPartidos = new int[partidosComVotos.size()];
        
        while (assentosRestantes > 0) {
            double maiorQuociente = 0;
            int indicePartidoMaiorQuociente = -1;
            
            for (int i = 0; i < partidosComVotos.size(); i++) {
                Partido partido = partidosComVotos.get(i);
                int votos = partido.getNumVotosPart();
                int assentosAtuais = assentosPartidos[i];
                
                double quociente = (double) votos / (assentosAtuais + 1);
                
                if (quociente > maiorQuociente) {
                    maiorQuociente = quociente;
                    indicePartidoMaiorQuociente = i;
                }
            }
            
            if (indicePartidoMaiorQuociente != -1) {
                assentosPartidos[indicePartidoMaiorQuociente]++;
                assentosRestantes--;
            }
        }

        // Exibir resultados
        System.out.println("\nRESULTADO DA DISTRIBUIÇÃO:");
        for (int i = 0; i < partidosComVotos.size(); i++) {
            Partido partido = partidosComVotos.get(i);
            double percentual = (double) partido.getNumVotosPart() / totalVotosValidos * 100;
            System.out.printf("%s (%s): %d votos (%.2f%%) -> %d assentos\n",
                partido.getNome(), partido.getSigla(), 
                partido.getNumVotosPart(), percentual, assentosPartidos[i]);
        }
    }
     // Método para gerar estatísticas da votação
    public void gerarEstatisticas() {
        int totalEleitores = eleitores.size();
        int totalVotaram = (int) eleitores.stream().filter(Eleitor::getVotou).count();
        double percentualParticipacao = (double) totalVotaram / totalEleitores * 100;

        System.out.println("\n=== ESTATÍSTICAS DA ELEIÇÃO ===");
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Total que votaram: " + totalVotaram);
        System.out.printf("Percentual de participação: %.2f%%\n", percentualParticipacao);
        System.out.println("Votos válidos: " + totalVotosValidos);
        System.out.println("Votos em branco: " + totalVotosBrancos);
        System.out.println("Votos nulos: " + totalVotosNulos);

        // Ranking de candidatos
        System.out.println("\nRANKING DE CANDIDATOS:");
        candidatos.stream()
            .sorted((c1, c2) -> c2.getNumVotosCand().compareTo(c1.getNumVotosCand()))
            .forEach(c -> System.out.printf("%s (%s): %d votos\n", 
                c.getNome(), c.getPart().getSigla(), c.getNumVotosCand()));
    }
    
    // Métodos auxiliares
    private Eleitor buscarEleitorPorCodigo(String codigo) {
        return eleitores.stream()
            .filter(e -> e.getCodigo().equals(codigo))
            .findFirst()
            .orElse(null);
    }

    private Candidato buscarCandidatoPorNumero(String senha) {
        return candidatos.stream()
            .filter(c -> c.getSenha().equalsIgnoreCase(senha))
            .findFirst()
            .orElse(null);
    }
    
    // Getters e Setters
    public List<Eleitor> getEleitores() {
        return eleitores;
    }

    public void setEleitores(List<Eleitor> eleitores) {
        this.eleitores = eleitores;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getTotalVotosValidos() {
        return totalVotosValidos;
    }

    public int getTotalVotosNulos() {
        return totalVotosNulos;
    }

    public int getTotalVotosBrancos() {
        return totalVotosBrancos;
    }


}
