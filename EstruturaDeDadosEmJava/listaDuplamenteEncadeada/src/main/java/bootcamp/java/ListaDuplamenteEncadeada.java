package bootcamp.java;

public class ListaDuplamenteEncadeada <T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo= null;
        this.ultimoNo= null;
        this.tamanhoLista=0;
    }

    public void add(T elemento){
        NoDuplo<T> novoNo= new NoDuplo<T>(elemento);
        novoNo.setProxNo(null);
        novoNo.setNoAnt(ultimoNo);

        if(primeiroNo == null){
            primeiroNo= novoNo;

        }
        if(ultimoNo != null){
            ultimoNo.setProxNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;

    }

    public void add(int index, T elemento){
        NoDuplo<T> noAux= getNo(index);
        NoDuplo<T> novoNo= new NoDuplo<T>(elemento);
        novoNo.setProxNo(noAux);

        if(novoNo.getProxNo() != null){
            novoNo.setNoAnt(noAux.getNoAnt());
            novoNo.getProxNo().setNoAnt(novoNo);
        }else{
            novoNo.setNoAnt(ultimoNo);
            ultimoNo= novoNo;
        }
        if(index == 0){
            primeiroNo=novoNo;
        }else{
            novoNo.getNoAnt().setProxNo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getProxNo();
            if(primeiroNo != null){
                primeiroNo.setNoAnt(null);
            }
        }else{
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnt().setProxNo(noAux.getProxNo());
            if(noAux != ultimoNo){
                noAux.getProxNo().setNoAnt(noAux.getNoAnt());
            }else{
                ultimoNo= noAux;
            }
        }

        this.tamanhoLista --;
    }

    public int sieze(){
        return this.tamanhoLista;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAux = primeiroNo;
        for(int i =0; (i<index) && (noAux!=null); i++){
            noAux= noAux.getProxNo();
        }
        return noAux;
    }

    @Override
    public String toString() {
        String srtRetorno= "";
        NoDuplo<T> noAux = primeiroNo;
        for(int i =0; i < sieze(); i++){
            srtRetorno+= "[No{conteudo =" + noAux.getConteudo()+ "} -->";
            noAux= noAux.getProxNo();
        }
        srtRetorno +="null";

        return srtRetorno;
    }
}
