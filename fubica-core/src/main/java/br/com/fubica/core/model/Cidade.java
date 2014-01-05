package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @SequenceGenerator(name = "IDCIDADE", sequenceName = "CIDADE_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDCIDADE")
    @Column(name = "idcidade")
    private Long idCidade;
	
    @Column(name = "idunidadefederacao")
    private Long idUnidadeFederacao;

    @Column(name = "idregiao")
    private Long idRegiao;
    
    @Column(name = "nomecidade", length=50)
    private String nomeCidade;

}
