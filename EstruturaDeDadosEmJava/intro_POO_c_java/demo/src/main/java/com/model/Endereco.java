package com.model;

public class Endereco {
    
    enum TipoEndereço{
        RESIDENCIAL, 
        ENTREGA, 
        TRABALHO}

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;


}
