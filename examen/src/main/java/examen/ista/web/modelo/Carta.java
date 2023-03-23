package examen.ista.web.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Carta")
@Data
public class Carta {
	@Id
	private Long carta_id;
	private String nombre;
	private String categoria;
	private int cantidad;
	private Plato plato; //One to one 
	private List listadeplatos;
	public Long getCarta_id() {
		return carta_id;
	}
	public void setCarta_id(Long carta_id) {
		this.carta_id = carta_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public List getListadeplatos() {
		return listadeplatos;
	}
	public void setListadeplatos(List listadeplatos) {
		this.listadeplatos = listadeplatos;
	}

	
	
}
