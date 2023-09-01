package br.com.digitalhouse.produtos.produtos.api;


import br.com.digitalhouse.produtos.produtos.entity.Produto;
import br.com.digitalhouse.produtos.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {


    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.criarProduto(produto));
    }

    @GetMapping("{id}")
    Produto buscarProdutoPorId(@PathVariable Integer id) {
        return produtoService.buscarProdutoPorId(id).orElseThrow();
    }

    @GetMapping
    List<Produto> buscarTodosProdutos () {
        return produtoService.buscarTodosProdutos();
    }

    @DeleteMapping({"id"})
    void excluirProduto(@PathVariable Integer id) {
        produtoService.excluirProduto(id);
    }



}
