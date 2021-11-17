package bootcamp.java;

public class NoDuplo <T> {
    private T conteudo;
    private NoDuplo<T> proxNo;
    private NoDuplo<T> noAnt;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getProxNo() {
        return proxNo;
    }

    public void setProxNo(NoDuplo<T> proxNo) {
        this.proxNo = proxNo;
    }

    public NoDuplo<T> getNoAnt() {
        return noAnt;
    }

    public void setNoAnt(NoDuplo<T> noAnt) {
        this.noAnt = noAnt;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
