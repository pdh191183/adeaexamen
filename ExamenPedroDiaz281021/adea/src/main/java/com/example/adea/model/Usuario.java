package com.example.adea.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario",schema="new_schema")
public class Usuario {

	@Id
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="cliente")
	private float cliente;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fechaAlta")
	private Date fechaAlta;
	
	@Column(name="fechaBaja")
	private Date fechaBaja;
	
	@Column(name="status")
	private String status;
	
	@Column(name="intentos")
	private float intentos;
	
	@Column(name="")
	private Date fechaRevocado;
	
	@Column(name="")
	private Date fechaVigencia;
	
	@Column(name="")
	private Integer noAcceso;
	
	@Column(name="")
	private String apellidoPaterno;
	
	@Column(name="")
	private String apellidoMaterno;
	
	@Column(name="")
	private Integer area;
	
	@Column(name="")
	private Date fechaModificacion;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCliente() {
		return cliente;
	}
	public void setCliente(float cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getIntentos() {
		return intentos;
	}
	public void setIntentos(float intentos) {
		this.intentos = intentos;
	}
	public Date getFechaRevocado() {
		return fechaRevocado;
	}
	public void setFechaRevocado(Date fechaRevocado) {
		this.fechaRevocado = fechaRevocado;
	}
	public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	public Integer getNoAcceso() {
		return noAcceso;
	}
	public void setNoAcceso(Integer noAcceso) {
		this.noAcceso = noAcceso;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
}
