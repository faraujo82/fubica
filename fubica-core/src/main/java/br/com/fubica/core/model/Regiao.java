package br.com.fubica.core.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="regiao")
public class Regiao {

    @Id
    @SequenceGenerator(name = "IDREGIAO", sequenceName = "REGIAO_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="IDREGIAO")
    @Column(name = "idregiao")
    private Long idRegiao;
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "veiculointeresse_regiao", joinColumns = @JoinColumn(name = "idregiao"), inverseJoinColumns = @JoinColumn(name = "idveiculointeresse"))
    private Set<VeiculoInteresse> sistema = new HashSet<VeiculoInteresse>();
    
    @Column(name = "nomeregiao", length=50)
    private String nomeRegiao;
}
