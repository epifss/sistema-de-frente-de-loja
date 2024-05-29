package br.com.sgv.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.sgv.model.Carrinho;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface VendaRepository extends CrudRepository<Carrinho,Long>{
    
}
