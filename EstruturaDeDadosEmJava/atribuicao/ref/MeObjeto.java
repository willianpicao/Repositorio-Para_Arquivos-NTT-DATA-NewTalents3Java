package com.projeto.atribuicao.ref;

public class MeObjeto {
    Integer nun;

    public MeObjeto(Integer nun) {
        this.nun = nun;
    }

    public void setNun(Integer num){
        this.nun = num;
    }

    @Override
    public String toString (){
        return this.nun.toString();
    }
}
