package ap1.restaurante.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import ap1.restaurante.models.enums.TipoRefeicao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Refeicao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private LocalDateTime dataConsumo;

	private TipoRefeicao tipo;

	@ManyToOne
	@JoinColumn(name = "codigo_consumidor")
	private Consumidor consumidor;

	public Refeicao() {
	}	

	public Refeicao(Long codigo, LocalDateTime dataConsumo, TipoRefeicao tipo, Consumidor consumidor) {
		super();
		this.codigo = codigo;
		this.dataConsumo = dataConsumo;
		this.tipo = tipo;
		this.consumidor = consumidor;
	}

	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}



	public LocalDateTime getDataConsumo() {
		return dataConsumo;
	}



	public void setDataConsumo(LocalDateTime dataConsumo) {
		this.dataConsumo = dataConsumo;
	}



	public TipoRefeicao getTipo() {
		return tipo;
	}



	public void setTipo(TipoRefeicao tipo) {
		this.tipo = tipo;
	}



	public Consumidor getConsumidor() {
		return consumidor;
	}



	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refeicao other = (Refeicao) obj;
		return Objects.equals(codigo, other.codigo);
	}

}