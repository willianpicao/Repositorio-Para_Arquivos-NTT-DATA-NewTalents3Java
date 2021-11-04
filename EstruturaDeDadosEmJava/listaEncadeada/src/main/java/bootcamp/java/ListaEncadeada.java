package bootcamp.java;

public class ListaEncadeada <T>{
    No<T> referenciaEntrada;
    public ListaEncadeada(){
        referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpety()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++){
            noAux=noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No <T> noAnt = getNo(index-1);
        noAnt.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRet = null;

        for (int i = 0; i <= index; i++){
            noRet= noAux;
            noAux=noAux.getProximoNo();
        }
        return noRet;
    }

    public int size(){
        int tamanhoLista=0;
        No<T> aux = referenciaEntrada;
        while(true){
            if(aux != null){
                tamanhoLista++;
                if(aux.getProximoNo() != null){
                    aux= aux.getProximoNo();
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "+index+" desta lista. O indice só vai ate: "+ ultimoIndice);


        }
    }

    public boolean isEmpety(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno= "";
        No<T> aux= referenciaEntrada;

        for (int i=0; i< this.size();i++){
            strRetorno+= "[No{conteudo="+ aux.getConteudo()+"}--->";
            aux= aux.getProximoNo();
        }
        strRetorno+="null";

        return strRetorno;
    }
}
