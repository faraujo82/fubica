package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public abstract class Pessoa {

    @Id
    @SequenceGenerator(name = "IDPESSOA", sequenceName = "PESSOA_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDPESSOA")
	@Column(name="idpessoa")
	private Long idPessoa;
	
	@Column(name = "nome", length=100)
	private String nome;
	
	@Column(name = "email", length=50)
	private String email;

	@Column(name = "senha", length=50)
	private String senha;
	
	public Pessoa(){
		
	}	
}
