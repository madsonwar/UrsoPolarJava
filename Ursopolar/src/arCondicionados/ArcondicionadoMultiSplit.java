package arCondicionados;

public class ArcondicionadoMultiSplit extends ArcondicionadoSplit{
		private int quantidadeDeEvaporadores;
		
		ArcondicionadoMultiSplit(){
			super();
			this.quantidadeDeEvaporadores = 0;
		}
		ArcondicionadoMultiSplit(String entradaMarca,float entradaConsumoDeEnergia,String entradagasRefrigerante,float entradaPeso,
				float entradaDimencoes,float entradaPotenciaDeRefrigeracao,float entradaPrecoDoProduto, String entradaGasRefrigerador,String entradaEvaporador,String entradaCondensador){
			super(entradaMarca,entradaConsumoDeEnergia,entradagasRefrigerante,entradaPeso,
					entradaDimencoes,entradaPotenciaDeRefrigeracao,entradaPrecoDoProduto,entradaGasRefrigerador,entradaEvaporador,entradaCondensador);
		}
		ArcondicionadoMultiSplit(ArcondicionadoMultiSplit ar){
			super(ar);
			this.quantidadeDeEvaporadores = ar.quantidadeDeEvaporadores;
		}

		public int getQuantidadeDeEvaporadores() {
			return quantidadeDeEvaporadores;
		}

		public void setQuantidadeDeEvaporadores(int quantidadeDeEvaporadores) {
			this.quantidadeDeEvaporadores = quantidadeDeEvaporadores;
		}
}
