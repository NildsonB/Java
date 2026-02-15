package estrutuda_de_dados.filas;

public class Fila {

    private No refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public Fila(No refEntrada) {
        enqueue(refEntrada);
    }

    public void enqueue(Object objeto){
        No novoNo = new No(objeto);
        novoNo.setRefNo(refEntrada);
        refEntrada = novoNo;
    }

    public Object dequeue(){
        No primeiroNo = refEntrada;
        No segundoNo = refEntrada;
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
        return primeiroNo.getObject();
    }

    public Object first(){
        if(!this.isEmpty()) {
            No primeiroNo = refEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refEntrada;

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
