package br.com.bertini.primeiroprojeto;


public class Cliente {
	
	private int idadePrimitivo;
	private boolean clienteAtivoPrimitvo;
	private double valorPrimitivo;
	
	private Integer idadeWrapper;
	private Boolean clienteAtivoWrapper;
	private Double valorWrapper;
	
	String Nome;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdadePrimitivo() {
		return idadePrimitivo;
	}
	public void setIdadePrimitivo(int idadePrimitivo) {
		this.idadePrimitivo = idadePrimitivo;
	}
	public boolean isClienteAtivoPrimitvo() {
		return clienteAtivoPrimitvo;
	}
	public void setClienteAtivoPrimitvo(boolean clienteAtivoPrimitvo) {
		this.clienteAtivoPrimitvo = clienteAtivoPrimitvo;
	}
	public double getValorPrimitivo() {
		return valorPrimitivo;
	}
	public void setValorPrimitivo(double valorPrimitivo) {
		this.valorPrimitivo = valorPrimitivo;
	}
	public Integer getIdadeWrapper() {
		return idadeWrapper;
	}
	public void setIdadeWrapper(Integer idadeWrapper) {
		this.idadeWrapper = idadeWrapper;
	}
	public Boolean getClienteAtivoWrapper() {
		return clienteAtivoWrapper;
	}
	public void setClienteAtivoWrapper(Boolean clienteAtivoWrapper) {
		this.clienteAtivoWrapper = clienteAtivoWrapper;
	}
	public Double getValorWrapper() {
		return valorWrapper;
	}
	public void setValorWrapper(Double valorWrapper) {
		this.valorWrapper = valorWrapper;
	}
	
	@Override
	public String toString() {
		return "Cliente [idadePrimitivo=" + idadePrimitivo + ", clienteAtivoPrimitvo=" + clienteAtivoPrimitvo
				+ ", valorPrimitivo=" + valorPrimitivo + ", idadeWrapper=" + idadeWrapper + ", clienteAtivoWrapper="
				+ clienteAtivoWrapper + ", valorWrapper=" + valorWrapper + "]";
	}

}
