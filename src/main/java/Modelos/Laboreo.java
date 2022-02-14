package Modelos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Laboreo")
public class Laboreo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk_nro_laboreo")
	private int nroLaboreo;
	@Column(name = "estapa")
	private String etapaLaboreo;
	@Column(name = "dierccion")
	private String direccionLaboreo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_nro_cultivo")
	private Cultivo laboreoDeCultivo;
	
	@OneToMany(mappedBy = "laboreo",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<DetalleProyecto> detallesProyecto;
	
	
	public Laboreo(String etapaLaboreo, String direccionLaboreo,Cultivo cultivo) {
		this.etapaLaboreo = etapaLaboreo;
		this.direccionLaboreo = direccionLaboreo;
		laboreoDeCultivo = cultivo;
		
	}

	public int getNroLaboreo() {
		return nroLaboreo;
	}

	public void setNroLaboreo(int nroLaboreo) {
		this.nroLaboreo = nroLaboreo;
	}

	public String getEtapaLaboreo() {
		return etapaLaboreo;
	}

	public void setEtapaLaboreo(String etapaLaboreo) {
		this.etapaLaboreo = etapaLaboreo;
	}

	public String getDireccionLaboreo() {
		return direccionLaboreo;
	}

	public void setDireccionLaboreo(String direccionLaboreo) {
		this.direccionLaboreo = direccionLaboreo;
	}
	
	
	
}