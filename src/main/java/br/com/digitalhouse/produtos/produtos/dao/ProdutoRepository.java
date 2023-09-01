package br.com.digitalhouse.produtos.produtos.dao;

import br.com.digitalhouse.produtos.produtos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    Optional<Produto> findByIdAndQuantidadeGreaterThan(Integer id, Integer quantidade);

    List<Produto> findAllByQuantidadeIsGreaterThan(Integer quantidade);
}
