package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorColumn(name="ladron")
public class Ladron extends Personaje{
  @Column(name="nivel_Siniestro",nullable = false)
  private Integer nivelSiniestro;
  @Column(name="tiene_Navaja",nullable = false)
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
