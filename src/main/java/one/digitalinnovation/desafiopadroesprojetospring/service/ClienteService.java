package one.digitalinnovation.desafiopadroesprojetospring.service;

import one.digitalinnovation.desafiopadroesprojetospring.model.Cliente;

/**
 * Interface que define o padrão <i>Strategy</i> no domínio de cliente.
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
