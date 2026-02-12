package estrutuda_de_dados.pilhas;

public class Pilha {

    private No refNo;

    public Pilha() {
        this.refNo = null;
    }

    public void push(No novoNo){
        No refAuxiliar = this.refNo;
        this.refNo = novoNo;
        this.refNo.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNo;
            this.refNo = this.refNo.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return this.refNo;
    }

    public boolean isEmpty() {
        return refNo == null;
    }

    @Override
    public String toString() {

        String stringRetorno = "---------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = this.refNo;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
