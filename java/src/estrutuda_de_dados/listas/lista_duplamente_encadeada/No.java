package estrutuda_de_dados.listas.lista_duplamente_encadeada;

public class No<T> {

    private T conteudo;
    private No<T> noPosterior;
    private No<T> noAnterior;

    public No() {
        this.noPosterior = null;
        this.noAnterior = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noPosterior = null;
        this.noAnterior = null;
    }

    public No(T conteudo, No<T> noPosterior) {
        this.conteudo = conteudo;
        this.noPosterior = noPosterior;
        this.noAnterior = null;
    }

    public No(T conteudo, No<T> noPosterior, No<T> noAnterior) {
        this.conteudo = conteudo;
        this.noPosterior = noPosterior;
        this.noAnterior = noAnterior;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(No<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
