import java.util.ArrayList;
import java.util.List;

public class Questao extends Conteudo{
    private List<Conteudo> respostas;

    public Questao(String descricao) {
        super(descricao);
        this.respostas = new ArrayList<>();
    }

    public void addQuestao(Conteudo conteudo) {
        this.respostas.add(conteudo);
    }

    @Override
    public String getConteudo() {
        String saida = "";
        saida = "Pergunta: " + this.getDescricao() + "\n";
        for (Conteudo resposta : respostas) {
            saida += resposta.getConteudo();
        }
        return saida;
    }
}
