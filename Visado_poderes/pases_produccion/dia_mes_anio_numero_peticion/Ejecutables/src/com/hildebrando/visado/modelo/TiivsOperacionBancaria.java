package com.hildebrando.visado.modelo;

// Generated 05/12/2012 11:41:39 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TiivsOperacionBancaria generated by hbm2java
 */
public class TiivsOperacionBancaria implements java.io.Serializable {
	private String codOperBan;
	private String desOperBan;
	private String activo;
	private String tipo;
	private Set<TiivsSolicitudOperban> tiivsSolicitudOperbans = new HashSet<TiivsSolicitudOperban>();

	public TiivsOperacionBancaria() {
	}

	public TiivsOperacionBancaria(String codOperBan) {
		this.codOperBan = codOperBan;
	}

	public TiivsOperacionBancaria(String codOperBan, String desOperBan,
			String activo, String tipo, Set<TiivsSolicitudOperban> tiivsSolicitudOperbans) {
		this.codOperBan = codOperBan;
		this.desOperBan = desOperBan;
		this.activo = activo;
		this.tipo = tipo;
		this.tiivsSolicitudOperbans = tiivsSolicitudOperbans;
	}

	public String getCodOperBan() {
		return this.codOperBan;
	}

	public void setCodOperBan(String codOperBan) {
		this.codOperBan = codOperBan;
	}

	public String getDesOperBan() {
		return this.desOperBan;
	}

	public void setDesOperBan(String desOperBan) {
		this.desOperBan = desOperBan;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<TiivsSolicitudOperban> getTiivsSolicitudOperbans() {
		return this.tiivsSolicitudOperbans;
	}

	public void setTiivsSolicitudOperbans(Set<TiivsSolicitudOperban> tiivsSolicitudOperbans) {
		this.tiivsSolicitudOperbans = tiivsSolicitudOperbans;
	}
	}
