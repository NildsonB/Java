package estrutuda_de_dados.listas.lista_circular;

public class No<T> {

    private T conteudo;
    private No<T> refProximoNo;

    public No() {
        this.conteudo = null;
        this.refProximoNo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.refProximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No<T> refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
