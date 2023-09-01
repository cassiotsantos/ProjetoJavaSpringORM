package br.com.digitalhouse.produtos.produtos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Entity
@Slf4j
public class Produto {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 60)
    private String produto;
    private Integer quantidade;
    private String descricao;
}
