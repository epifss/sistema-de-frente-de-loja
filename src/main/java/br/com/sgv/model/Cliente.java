package br.com.sgv.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente extends Pessoa{
    private int Pontos;
    public void calcularPontos(){
       // Pontos = /*venda*//10;
    }

}
