package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="requisicaoamizade")
public class RequisicaoAmizade {

    @Id
    @SequenceGenerator(name = "IDREQUISICAOAMIZADE", sequenceName = "REQUISICAOAMIZADE_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDREQUISICAOAMIZADE")
    @Column(name = "idrequisicaoamizade")
    private Long idRequisicaoAmizade;
    
    @Column(name = "idpessoaorigem")
    private Long idPessoaOrigem;
    
    @Column(name = "idpessoadestino")
    private Long idPessoaDestino;

    @Column(name = "idstatusamizade")
    private Long idStatusAmizade;
    
}
