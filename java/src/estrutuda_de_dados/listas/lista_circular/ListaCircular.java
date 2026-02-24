package estrutuda_de_dados.listas.lista_circular;

public class ListaCircular<T> {

    private No<T> refEntrada;
    private int tamanhoLista = 0;

    public ListaCircular() {
        refEntrada = null;
    }

    public void add(T elemento){
        No<T> novoNO = new No<>(elemento);
        No<T> noAuxiliar;
        if(refEntrada == null){
            refEntrada = novoNO;
            refEntrada.setRefProximoNo(novoNO);
        }else {
            noAuxiliar = this.refEntrada;
            this.refEntrada = novoNO;
            novoNO.setRefProximoNo(noAuxiliar);
            noAuxiliar = getNo(size());
            noAuxiliar.setRefProximoNo(refEntrada);
        }
        tamanhoLista++;
    }

    public void remove(int indice) {
        No<T> noAuxiliar;
        if(!isEmpty()){
            if(indice == 0){
                this.refEntrada = refEntrada.getRefProximoNo();
                noAuxiliar = getNo(size() -1);
                noAuxiliar.setRefProximoNo(this.refEntrada);
            }else if (indice == size() - 1){
                noAuxiliar = getNo(size() - 2);
                noAuxiliar.setRefProximoNo(refEntrada);
            }else {
                noAuxiliar = getNo(indice-1);
                noAuxiliar.setRefProximoNo(getNo(indice+1));
            }
            tamanhoLista--;
        }
    }

    public T get(int indice) {
        T  retorno = getNo(indice).getConteudo();
        return retorno;
    }

    private No<T> getNo(int indice) {
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        if(!isEmpty()){
            for(int i = 0; i <= indice; i++){
                noRetorno = noAuxiliar;
                noAuxiliar = noAuxiliar.getRefProximoNo();
            }
        }
        return noRetorno;
    }

    public int size(){
        return this.tamanhoLista;
    }

    private boolean isEmpty(){
        return refEntrada == null;
    }

    @Override
    public String toString() {
        String retorno = "";
        No<T> noAuxiliar =  refEntrada;
        for (int i = 0; i <= tamanhoLista; i++){
            retorno += "[ListaCircular{conteúdo= " + noAuxiliar.getConteudo() + "--->}]";
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }

        return retorno;
    }
}
