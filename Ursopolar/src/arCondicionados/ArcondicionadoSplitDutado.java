package arCondicionados;

public class ArcondicionadoSplitDutado extends ArcondicionadoSplit{
	private float tamanhoDaTubulacao;

	
	
	ArcondicionadoSplitDutado(){
		super();
		this.tamanhoDaTubulacao = 0;
	}
	ArcondicionadoSplitDutado(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
			float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto, String entradaGasRefrigerador,String entradaEvaporador,String entradaCondensador,float entradaTamanhoDaTubulacao){
		super(entradaMarca,entradaConsumoDeEnergia,entradagasRefrigerante,entradaPeso,
				entradaDimencoes,entradaPotenciaDeRefrigeracao,entradaPrecoDoProduto,entradaGasRefrigerador,entradaEvaporador,entradaCondensador);
		this.tamanhoDaTubulacao = entradaTamanhoDaTubulacao;
	}
	ArcondicionadoSplitDutado(ArcondicionadoSplitDutado ar){
		super(ar);
		this.tamanhoDaTubulacao = ar.tamanhoDaTubulacao;
	}
	public float getTamanhoDaTubulacao() {
		return tamanhoDaTubulacao;
	}

	public void setTamanhoDaTubulacao(float tamanhoDaTubulacao) {
		this.tamanhoDaTubulacao = tamanhoDaTubulacao;
	}

}
