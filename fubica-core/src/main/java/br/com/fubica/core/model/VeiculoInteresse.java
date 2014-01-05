package br.com.fubica.core.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="veiculointeresse")
public class VeiculoInteresse {

    @Id
    @SequenceGenerator(name = "IDVEICULOINTERESSE", sequenceName = "VEICULOINTERESSE_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDVEICULOINTERESSE")
    @Column(name = "idveiculointeresse")
    private Long idVeiculoInteresse;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "regiao_veiculointeresse", joinColumns = @JoinColumn(name = "idveiculointeresse"), inverseJoinColumns = @JoinColumn(name = "idregiao"))
    private Set<Regiao> sistema = new HashSet<Regiao>();
    
    @Column(name = "idmodelo")
    private Long idModelo;

    @Column(name = "anofabricacao")
    private Long anoFabricacao;
    
    @Column(name = "anomodelo")
    private Long anoModelo;

    @Column(name = "idcor")
    private Long idCor;
    
    @Column(name = "idmotorizacao")
    private Long idMotorizacao;
	
}
