import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PesquisaTest {

    @Test
    void deveRetornarQuestionarioPesquisa() {
        Questao pergunta1 = new Questao("Como você avalia nosso serviço?");
        Resposta resposta11 = new Resposta("Muito bom!", "Lucas Freitas");
        Resposta resposta12 = new Resposta("Deixou a desejar!", "José");
        pergunta1.addQuestao(resposta11);
        pergunta1.addQuestao(resposta12);

        Questao pergunta2 = new Questao("Você recomendaria nossos serviços para outras pessoas?");
        Resposta resposta21 = new Resposta("Com certeza!", "Lucas Freitas");
        pergunta2.addQuestao(resposta21);

        Questao pergunta3 = new Questao("Você tem alguma sugestão para melhorar nossos serviços?");
        Resposta resposta31 = new Resposta("Está perfeito como está", "Lucas Freitas");
        Resposta resposta32 = new Resposta("Poderiam investir em um melhor atendimento", "José");
        pergunta3.addQuestao(resposta31);
        pergunta3.addQuestao(resposta32);

        Questao questionario = new Questao("Pesquisa de satisfação");
        questionario.addQuestao(pergunta1);
        questionario.addQuestao(pergunta2);
        questionario.addQuestao(pergunta3);

        Pesquisa pesquisa = new Pesquisa();
        pesquisa.setquestionario(questionario);

        assertEquals("Pergunta: Pesquisa de satisfação\n"+
                            "Pergunta: Como você avalia nosso serviço?\n"+
                            "Resposta: Muito bom! - nome participante: Lucas Freitas\n"+
                            "Resposta: Deixou a desejar! - nome participante: José\n"+
                            "Pergunta: Você recomendaria nossos serviços para outras pessoas?\n"+
                            "Resposta: Com certeza! - nome participante: Lucas Freitas\n"+
                            "Pergunta: Você tem alguma sugestão para melhorar nossos serviços?\n"+
                            "Resposta: Está perfeito como está - nome participante: Lucas Freitas\n"+
                            "Resposta: Poderiam investir em um melhor atendimento - nome participante: José\n", pesquisa.getQuestionario());
    }

    @Test
    void deveRetornarExcecaoPesquisaSemQuestionario() {
        try {
            Pesquisa pesquisa = new Pesquisa();
            pesquisa.getQuestionario();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Pesquisa sem conteúdo", e.getMessage());
        }
    }
}