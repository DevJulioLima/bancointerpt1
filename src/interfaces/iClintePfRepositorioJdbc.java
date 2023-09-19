package interfaces;

import entidades.ClientePf;

import java.sql.SQLException;

public interface iClintePfRepositorioJdbc {
    public ClientePf listarPorNome(String nome) throws SQLException;
    public ClientePf listaPorCpf(String cpf) throws SQLException;
}
