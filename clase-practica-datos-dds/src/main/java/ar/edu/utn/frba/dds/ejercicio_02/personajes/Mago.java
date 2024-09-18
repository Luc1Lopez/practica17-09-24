package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorColumn(name="mago")
public class Mago  extends Personaje{
  @Column(name="nivel_Magia",nullable = false)
  private Integer nivelDeMagia;
  @Column(name="alas",nullable = false)
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
