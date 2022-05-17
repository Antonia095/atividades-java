package br.db.atividade.d_produtos;

public class ProdutoRepository {
    Produto findById(Long id);
    Produto save(Produto produto);
}
