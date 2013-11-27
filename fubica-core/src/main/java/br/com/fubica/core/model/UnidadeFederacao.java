package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="unidadefederacao")
public class UnidadeFederacao {

    @Id
    @SequenceGenerator(name = "IDUNIDADEFEDERACAO", sequenceName = "UNIDADEFEDERACAO_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IDUNIDADEFEDERACAO")
    @Column(name = "idunidadefederacao")
    private Long idUnidadeFederacao;
	
    @Column(name = "idpais")
    private Long idPais;	

    @Column(name = "nome", length=50)
    private String nome;
    
    @Column(name = "sigla", length=2)
    private String sigla;	
    
}
