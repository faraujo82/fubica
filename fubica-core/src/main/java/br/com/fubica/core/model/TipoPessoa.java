package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tipopessoa")
public class TipoPessoa {

    @Id
    @SequenceGenerator(name = "IDTIPOPESSOA", sequenceName = "TIPOPESSOA_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IDTIPOPESSOA")
    @Column(name = "idtipopessoa")
    private Long idTipoPessoa;
	
    @Column(name = "descricao", length=50)
    private String descricao;
}
