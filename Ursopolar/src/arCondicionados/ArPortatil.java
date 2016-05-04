package arCondicionados;

public class ArPortatil extends Arcondicionado{
	private int bateria;
	ArPortatil() {
		super();
		this.bateria = 0;
		
		
		
	}
	ArPortatil(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
			float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto, String entradaGasRefrigerador,int entradaBateria) {
		super(entradaMarca,entradaConsumoDeEnergia,entradagasRefrigerante,entradaPeso,
				entradaDimencoes,entradaPotenciaDeRefrigeracao,entradaPrecoDoProduto);
		
		
		this.bateria = entradaBateria;
		
	}
	ArPortatil(ArPortatil ar) {
		
		super(ar);
		
		this.bateria=ar.bateria;
		
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
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
