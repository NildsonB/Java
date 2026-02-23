package estrutuda_de_dados.listas.lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

    private No<T> refEntrada;
    private No<T> refSaida;

    public ListaDuplamenteEncadeada() {
        this.refEntrada = null;
        this.refSaida = null;
    }

    public void add(T elemento) {
        No<T> novoNo = new No<>(elemento);
        No<T> noAuxiliar;
        if(this.isEmpty()) {
            this.refEntrada = novoNo;
        }else {
            noAuxiliar = this.refEntrada;
            noAuxiliar.setNoAnterior(novoNo);
            this.refEntrada = novoNo;
            novoNo.setNoPosterior(noAuxiliar);
        }
    }

    public void add(T elemento, int indice) {
        No<T> novoNo = new No<>(elemento);
        No<T> noAuxiliar;
        No<T> noPivo;
        if(indice < 0 || indice > size()) {
            throw new IndexOutOfBoundsException("Local de inserção do conteúdo é inválido. Informe um local que seja de 0 a " + size());
        }else if(indice == 0) {
            add(elemento);
        }else if(indice == size()) {
            noAuxiliar = getNo(indice -1);
            noAuxiliar.setNoPosterior(novoNo);
            novoNo.setNoAnterior(noAuxiliar);
        }else {
            noPivo = getNo(indice);
            noAuxiliar = getNo(indice-1);
            novoNo.setNoAnterior(noAuxiliar);
            novoNo.setNoPosterior(noPivo);
            noPivo.setNoAnterior(novoNo);
            noAuxiliar.setNoPosterior(novoNo);
        }
    }

    public T remove(int indice) {
        No<T> noRetorno = null;
        No<T> noAuxiliar;
        if(!isEmpty()) {
            if(indice < 0 || indice > size() -1) {
                throw new IndexOutOfBoundsException("O elemento indicado não exite na lista.");
            } else {
                noRetorno = getNo(indice);
                noAuxiliar = noRetorno.getNoAnterior();
                noAuxiliar.setNoPosterior(noRetorno.getNoPosterior());
                noAuxiliar = noRetorno.getNoPosterior();
                noAuxiliar.setNoAnterior(noRetorno.getNoAnterior());
            }
        }
        return noRetorno.getConteudo();
    }

    public T getConteudo(int indice) {
        T  retorno = getNo(indice).getConteudo();
        return retorno;
    }

    private No<T> getNo(int indice){
        No<T> noAuxiliar = this.refEntrada;
        No<T> noRetorno = null;
        if (isEmpty() || indice > size() - 1) {
            throw new IndexOutOfBoundsException("Indice inválido. A lista não possui o indice indicado.");
        }else {
            for(int i = 0; i <=indice; i++){
                noRetorno = noAuxiliar;
                noAuxiliar = noAuxiliar.getNoPosterior();
            }
        }
        return noRetorno;
    }

    public int size() {
        No<T> noAuxiliar = this.refEntrada;
        int tamanho = 0;
        while (true) {
            if (noAuxiliar != null) {
                tamanho++;
                if (noAuxiliar.getNoPosterior() != null) {
                    noAuxiliar = noAuxiliar.getNoPosterior();
                } else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanho;
    }

    private boolean isEmpty() {
        return this.refEntrada == null && this.refSaida == null;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.refEntrada;
        for (int i = 0; i < this.size(); i++) {
            if( getNo(i).getNoAnterior() == null ) {
                strRetorno += "{ null } <--- nó anterior [ListaDuplamenteEncadeada{(conteúdo= " + getConteudo(i) + ")}] nó posterior ---> {" +  getNo(i).getNoPosterior().getConteudo() + '}';
            }else if (getNo(i).getNoPosterior() == null ) {
                strRetorno += " | {" + getNo(i).getNoAnterior().getConteudo() + "} <--- nó anterior [ListaDuplamenteEncadeada{(conteúdo= " + getConteudo(i) + ")] nó posterior --->{ null } --->";
            }else {
                strRetorno += " | {" + getNo(i).getNoAnterior().getConteudo() + "} <--- nó anterior [ListaDuplamenteEncadeada{(conteúdo= " + getConteudo(i) + ")}] nó posterior ---> {" +  getNo(i).getNoPosterior().getConteudo() + '}';
            }
            noAuxiliar = noAuxiliar.getNoPosterior();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
