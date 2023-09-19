package interfaces;

import entidades.ClientePj;

import java.util.ArrayList;

public interface iClientePjRepositorio {
    public ArrayList<ClientePj> pesquisarPorNome(String nome);
    public ArrayList<ClientePj> pesquisarPorCnpj(String cnpj);
    public ArrayList<ClientePj> pesquisarPorNomeFantasia(String nomeFantasia);
}
