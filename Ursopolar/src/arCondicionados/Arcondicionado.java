package arCondicionados;
import interfaces.Servicos;
import interfaces.Device;
public abstract class Arcondicionado implements Servicos,Device{
	private String marca;
	
	private float consumoDeEnergia;
	private  Estados estadosDoAr;
	private float peso;
	private float dimencoes;
	private float potenciaDeRefrigeracao;
	private float precoDoProduto;
	
	 Arcondicionado(){
		this.marca = "Desconhecido";
		this.consumoDeEnergia = 0;

		this.peso = 0;
		this.dimencoes = 0;
		this.potenciaDeRefrigeracao = 0;
		this.precoDoProduto =  0;
		
	}
	Arcondicionado(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
			float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto){
		this.marca = entradaMarca;
		this.consumoDeEnergia = entradaConsumoDeEnergia;
	
		this.peso = entradaPeso;
		this.dimencoes = entradaDimencoes;
		this.potenciaDeRefrigeracao = entradaPotenciaDeRefrigeracao;
		this.precoDoProduto =  entradaPrecoDoProduto;
	}
	
	Arcondicionado(Arcondicionado ar){
		this.marca = ar.marca;
		this.consumoDeEnergia = ar.consumoDeEnergia;
	
		this.peso = ar.peso;
		this.dimencoes = ar.dimencoes;
		this.potenciaDeRefrigeracao = ar.potenciaDeRefrigeracao;
		this.precoDoProduto =  ar.precoDoProduto;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getConsumoDeEnergia() {
		return consumoDeEnergia;
	}
	public void setConsumoDeEnergia(float consumoDeEnergia) {
		this.consumoDeEnergia = consumoDeEnergia;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getDimencoes() {
		return dimencoes;
	}
	public void setDimencoes(float dimencoes) {
		this.dimencoes = dimencoes;
	}
	public float getPotenciaDeRefrigeracao() {
		return potenciaDeRefrigeracao;
	}
	public void setPotenciaDeRefrigeracao(float potenciaDeRefrigeracao) {
		this.potenciaDeRefrigeracao = potenciaDeRefrigeracao;
	}
	public float getPrecoDoProduto() {
		return precoDoProduto;
	}
	public void setPrecoDoProduto(float precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	public Estados getEstadosDoAr() {
		return estadosDoAr;
	}
	public void setEstadosDoAr(Estados estadosDoAr) {
		this.estadosDoAr = estadosDoAr;
	}
}
