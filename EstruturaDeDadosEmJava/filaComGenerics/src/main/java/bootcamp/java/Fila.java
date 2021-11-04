package bootcamp.java;
//FIFO
public class Fila <T>{
    private No<T> refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public boolean isEmpety() {
        return refNoEntrada == null ? true : false;
    }

    public void insereNo(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;

    }

    public T first() {
        if (!this.isEmpety()) {
            No primeiroNo = refNoEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    public T removeNo() {
        if (!this.isEmpety()) {
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No noAuxiliar = refNoEntrada;

        if (refNoEntrada != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();

                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        }
        return stringRetorno;
    }
}