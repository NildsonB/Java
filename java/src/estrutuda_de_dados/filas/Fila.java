package estrutuda_de_dados.filas;

public class Fila<T> {

    private No<T> refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public void enqueue(T objeto){
        No<T> novoNo = new No<T>(objeto);
        novoNo.setRefNo(refEntrada);
        refEntrada = novoNo;
    }

    public T dequeue(){
        No<T> primeiroNo = refEntrada;
        No<T> segundoNo = refEntrada;
        if(!this.isEmpty()){
            while(true){
                if (primeiroNo.getRefNo() != null) {
                    segundoNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    segundoNo.setRefNo(null);
                    break;
                }
            }
        }
        return (T) primeiroNo.getObject();
    }

    public T first(){
        if(!this.isEmpty()) {
            No<T> primeiroNo = refEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refEntrada;

        if(refEntrada != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
