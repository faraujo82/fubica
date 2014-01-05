package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="pessoajuridica")
public class PessoaJuridica extends Pessoa{

	@JoinColumn(name="idpessoa", nullable=false, insertable=false, updatable=false)  
	private Long idPessoa;	
	
	@Column(name = "cnpj")
	private String cnpj;
	
	public PessoaJuridica() {
		
    }	

}
