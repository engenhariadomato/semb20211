package br.edu.ifmt.cba.carrinho.core.model;

import lombok.Data;

/**
 * @author daohn
 * @since 24/07/2021
 */
@Data
public class Coordinate {
  private FinalCoordinate finalCoordinate;
  private InitialCoordinate initialCoordinate;
}
