package arCondicionados;

public class ArcondicionadoWindow extends Arcondicionado{
	private String gasRefrigerador;
	ArcondicionadoWindow() {
		super();
		this.gasRefrigerador = "Desconhecido";
		
		
		
	}
	ArcondicionadoWindow(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
			float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto, String entradaGasRefrigerador) {
		super(entradaMarca,entradaConsumoDeEnergia,entradagasRefrigerante,entradaPeso,
				entradaDimencoes,entradaPotenciaDeRefrigeracao,entradaPrecoDoProduto);
		
		
		this.gasRefrigerador = entradaGasRefrigerador;
		
	}
	ArcondicionadoWindow(ArcondicionadoWindow ar) {
		
		super(ar);
		
		this.gasRefrigerador=ar.gasRefrigerador;
		
	}
	public String getGasRefrigerador() {
		return gasRefrigerador;
	}
	public void setGasRefrigerador(String gasRefrigerador) {
		this.gasRefrigerador = gasRefrigerador;
	}
	@Override
	public void ligarDesligar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void aumentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void diminuir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void comprarProduto() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void limpeza() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void instalacao() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void trocaDeGas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int comprarProduto(int compra) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int limpeza(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int instalacao(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int trocaDeGas(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
