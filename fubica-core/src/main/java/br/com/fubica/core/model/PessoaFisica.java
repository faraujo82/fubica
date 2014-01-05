package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="pessoafisica")
public class PessoaFisica extends Pessoa{
	
 
	@JoinColumn(name="idpessoa", nullable=false, insertable=false, updatable=false)  
	private Long idPessoa;	
	
	@Column(name = "cpf")
	private String cpf;
	
	public PessoaFisica() {
		
    }	
}
