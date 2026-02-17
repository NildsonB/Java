package estrutuda_de_dados.listas.lista_encadeada;

public class Lista<T> {

    private No<T> refEntrada;

    public Lista() {
        this.refEntrada = null;
    }

    public void add(T elemento) {
        if(this.isEmpty()) {
            this.refEntrada = new No<>(elemento);
            refEntrada.setproximoNo(null);
            return;
        }
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getproximoNo();
        }
        noAuxiliar.setproximoNo(new No<>(elemento));
    }

    public T get(int index) {
        return getNo(index).getElemento();
    }

    private No<T> getNo(int indice){
        validaIndice(indice);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <=indice; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getproximoNo();
        }
        return noRetorno;
    }

    public T remove(int indice) {
        No<T> noAuxiliar = this.getNo(indice);
        if(indice == 0){
            refEntrada = noAuxiliar.getproximoNo();
            return noAuxiliar.getElemento();
        }
        No<T> noAnterior = this.getNo(indice-1);
        noAnterior.setproximoNo(noAuxiliar.getproximoNo());
        return noAuxiliar.getElemento();
    }

    public int size() {
        int tamanhoLista = 0;
        No<T>  noAuxiliar = refEntrada;
        while(true){
            if(noAuxiliar != null){
                tamanhoLista++;
                if(noAuxiliar.getproximoNo() != null){
                    noAuxiliar = noAuxiliar.getproximoNo();
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int indice){
        if(indice >= size()){
            throw new IndexOutOfBoundsException("Indice invalido. O indice indicado não existe.");
        }
    }

    public boolean isEmpty(){
        return this.refEntrada == null;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "No: " + i + " {conteúdo: " + noAuxiliar.getElemento() + "} ----> ";
            noAuxiliar = noAuxiliar.getproximoNo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
