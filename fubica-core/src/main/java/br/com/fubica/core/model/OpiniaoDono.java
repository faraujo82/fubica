package br.com.fubica.core.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="opiniaodono")
public class OpiniaoDono {
	
    @Id
    @SequenceGenerator(name = "IDOPINIAODONO", sequenceName = "OPINIAODONO_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDOPINIAODONO")
    @Column(name = "idopiniaodono")
    private Long idOpiniaoDono;

    @Column(name = "idveiculopessoa")
    private Long idVeiculoPessoa;
    
    @Column(name = "opiniaofavor", length=250)
    private String opiniaoFavor;
    
    @Column(name = "opiniaocontra", length=250)
    private String opiniaoContra;

    @Column(name = "notaestilo")
    private BigDecimal notaEstilo;

    @Column(name = "notaacabamento")
    private BigDecimal notaAcabamento;
    
    @Column(name = "notaposicao")
    private BigDecimal notaPosicao;
    
    @Column(name = "notainstrumentos")
    private BigDecimal notaInstrumentos;
    
    @Column(name = "notaInterior")
    private BigDecimal notaInterior;
    
    @Column(name = "notaportamalas")
    private BigDecimal notaPortaMalas;
    
    @Column(name = "notadesempenho")
    private BigDecimal notaDesempenho;
    
    @Column(name = "notamotor")
    private BigDecimal notaMotor;
    
    @Column(name = "notacambio")
    private BigDecimal notaCambio;
    
    @Column(name = "notafreios")
    private BigDecimal notaFreios;
    
    @Column(name = "notasuspensao")
    private BigDecimal notaSuspensao;
    
    @Column(name = "notaconsumo")
    private BigDecimal notaConsumo;
    
    @Column(name = "notaestabilidade")
    private BigDecimal notaEstabilidade;
    
    @Column(name = "notacustobeneficio")
    private BigDecimal notaCustoBeneficio;
    
    @Column(name = "notarecomendacao")
    private BigDecimal notaRecomendacao;
    
}
