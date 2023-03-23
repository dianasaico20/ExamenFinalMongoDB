package examen.ista.web.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Plato")
@Data
public class Plato {
	@Id
	private Long plato_id;
	private String nombrePlato;
	private String descripcion;
	private double precio;
	public Long getPlato_id() {
		return plato_id;
	}
	public void setPlato_id(Long plato_id) {
		this.plato_id = plato_id;
	}
	public String getNombrePlato() {
		return nombrePlato;
	}
	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
