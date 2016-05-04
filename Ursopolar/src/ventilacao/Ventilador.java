package ventilacao;

public abstract class Ventilador {
	private int potenciaDoMotor;

	public int getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(int potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

}
