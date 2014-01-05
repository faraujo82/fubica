package br.com.fubica.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="veiculopessoa")
public class VeiculoPessoa {

    @Id
    @SequenceGenerator(name = "IDVEICULOPESSOA", sequenceName = "VEICULOPESSOA_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDVEICULOPESSOA")
    @Column(name = "idveiculopessoa")
    private Long idVeiculoPessoa;

    @Column(name = "idpessoa")
    private Long idPessoa;
    
    @Column(name = "placa", length=50)
    private String placa;
    
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
