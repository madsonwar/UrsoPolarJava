package arCondicionados;
	
public class ArcondicionadoSplit extends ArcondicionadoWindow{
	private String evaporador;
	private String condensador;
	
	ArcondicionadoSplit(){
		super();
		this.evaporador = "Desconhecido";
		this.condensador = "Desconhecido";
	}
	ArcondicionadoSplit(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
			float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto, String entradaGasRefrigerador,String entradaEvaporador,String entradaCondensador){
		super(entradaMarca,entradaConsumoDeEnergia,entradagasRefrigerante,entradaPeso,
				entradaDimencoes,entradaPotenciaDeRefrigeracao,entradaPrecoDoProduto,entradaGasRefrigerador);
		this.evaporador = entradaEvaporador;
		this.condensador = entradaCondensador;
		
	}
	ArcondicionadoSplit(ArcondicionadoSplit ar){
		super(ar);
		this.evaporador = ar.evaporador;
		this.condensador = ar.condensador;
	}
	
	
	public String getEvaporador() {
		return evaporador;
	}
	
	public void setEvaporador(String evaporador) {
		this.evaporador = evaporador;
	}
	public String getCondensador() {
		return condensador;
	}
	public void setCondensador(String condensador) {
		this.condensador = condensador;
	}
}
