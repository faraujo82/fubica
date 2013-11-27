package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pessoajuridica")
public class PessoaJuridica extends Pessoa{

	@Column(name = "idpessoa")
	private Long idPessoa;	
	
	@Column(name = "cnpj")
	private String cnpj;
	
	public PessoaJuridica() {
		
    }	

}
