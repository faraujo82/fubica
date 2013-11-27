package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="statusamizade")
public class StatusAmizade {

    @Id
    @SequenceGenerator(name = "IDSTATUSAMIZADE", sequenceName = "STATUSAMIZADE_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IDSTATUSAMIZADE")
    @Column(name = "idstatusamizade")
    private Long idStatusAmizade;
	
    @Column(name = "descricao", length=50)
    private String descricao;    
}
