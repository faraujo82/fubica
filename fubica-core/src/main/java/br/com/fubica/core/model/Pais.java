package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class Pais {

    @Id
    @SequenceGenerator(name = "IDPAIS", sequenceName = "PAIS_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDPAIS")
    @Column(name = "idpais")
    private Long idPais;
	
    @Column(name = "nomepais", length=50)
    private String nomePais;
}
