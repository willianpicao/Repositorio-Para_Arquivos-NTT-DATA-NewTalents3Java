package com.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public Integer codigo;
    public String nome;
    public String cpf;

    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new RuntimeException("endereço n pode ser nulo");
        }
        
    }
//f v v f f
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null){
            enderecos= new ArrayList<Endereco>();
        }
        return enderecos;
    }

    

}
