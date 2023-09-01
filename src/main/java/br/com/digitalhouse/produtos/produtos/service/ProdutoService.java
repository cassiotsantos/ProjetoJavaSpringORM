package br.com.digitalhouse.produtos.produtos.service;

import br.com.digitalhouse.produtos.produtos.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    Optional<Produto> buscarProdutoPorId (Integer id);
    List<Produto> buscarTodosProdutos();
    void excluirProduto(Integer id);

}
