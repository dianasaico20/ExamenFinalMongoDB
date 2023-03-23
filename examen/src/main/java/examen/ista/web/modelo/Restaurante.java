package examen.ista.web.modelo;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Restaurante")
@Data
public class Restaurante {
	@Id
	private Long restaurante_id;
	private String nombre;
	private String telefono;
	private String direccion;
	private String correo;
	
	private Carta  carta; //One to one 
	private List listadecartas;
	
	private Cliente  cliente; //One to one 
	
	private List listadeclientes;
	public Long getRestaurante_id() {
		return restaurante_id;
	}
	public void setRestaurante_id(Long restaurante_id) {
		this.restaurante_id = restaurante_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Carta getCarta() {
		return carta;
	}
	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	public List getListadecartas() {
		return listadecartas;
	}
	public void setListadecartas(List listadecartas) {
		this.listadecartas = listadecartas;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List getListadeclientes() {
		return listadeclientes;
	}
	public void setListadeclientes(List listadeclientes) {
		this.listadeclientes = listadeclientes;
	}
	
	
	
	
	
}
