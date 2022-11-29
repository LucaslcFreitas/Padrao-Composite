public class Resposta extends Conteudo{
    public String nomeParticipante;

    public Resposta(String descricao, String nomeParticipante) {
        super(descricao);
        this.nomeParticipante = nomeParticipante;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    @Override
    public String getConteudo() {
        return "Resposta: " + this.getDescricao() + " - nome participante: " + this.nomeParticipante + "\n";
    }
}
