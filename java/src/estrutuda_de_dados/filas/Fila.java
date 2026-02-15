package estrutuda_de_dados.filas;

public class Fila {

    private No refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public Fila(No refEntrada) {
        enqueue(refEntrada);
    }

    public void enqueue(No novoNO){
        novoNO.setRefNo(refEntrada);
        refEntrada = novoNO;
    }

    public No dequeue(){
        No primeiroNo = first();
        No segundoNo = refEntrada;
        if(!this.isEmpty()){
            while(true){
                if (segundoNo.getRefNo() != primeiroNo){
                    segundoNo = segundoNo.getRefNo();
                } else {
                    segundoNo.setRefNo(null);
                    break;
                }
            }
        }
        return primeiroNo;
    }

    public No first(){
        if(!this.isEmpty()) {
            No primeiroNo = refEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo;
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
