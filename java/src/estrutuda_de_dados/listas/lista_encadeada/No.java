package estrutuda_de_dados.listas.lista_encadeada;

public class No<T> {

    private T elemento;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.proximoNo = null;
    }

    public No(T elemento, No proximoNo) {
        this.elemento = elemento;
        this.proximoNo = proximoNo;
    }

    public No getproximoNo() {
        return proximoNo;
    }

    public void setproximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "elemento= " + elemento +
                '}';

        if(proximoNo != null){
            str += "-->" + proximoNo.toString();
        }else {
            str += "--> null";
        }
        return str;
    }
}
