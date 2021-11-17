package com.model;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        //dados do endereço
        Client cliente = new Client();
        //dados do cliente

        cliente.adicionaEndereco(endereco);

    }
}
