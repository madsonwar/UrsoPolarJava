package interfaces;

public interface Servicos {
	void comprarProduto();
	void limpeza();
	void instalacao();
	void trocaDeGas();
	int comprarProduto(int compra);
	int limpeza(int valor);
	int instalacao(int valor);
	int trocaDeGas(int valor);
}
