public class Pesquisa {
    private Conteudo questionario;

    public void setquestionario(Conteudo questionario) {
        this.questionario = questionario;
    }

    public String getQuestionario() {
        if (this.questionario == null) {
            throw new NullPointerException("Pesquisa sem conteúdo");
        }
        return this.questionario.getConteudo();
    }
}
