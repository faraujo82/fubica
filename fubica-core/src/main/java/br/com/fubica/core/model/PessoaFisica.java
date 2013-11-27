package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pessoafisica")
public class PessoaFisica extends Pessoa{
	
	@Column(name = "idpessoa")
	private Long idPessoa;	
	
	@Column(name = "cpf")
	private String cpf;
	
	public PessoaFisica() {
		
    }	
}
