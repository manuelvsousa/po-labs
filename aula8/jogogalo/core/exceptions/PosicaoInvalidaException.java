package jogogalo.core.exceptions;

public class PosicaoInvalidaException extends JogadaInvalidaException {

	private String _mensagem;

	public PosicaoInvalidaException(String mensagem) {
		mensagem = mensagem;
	}

	public final String obtemMensagem(){
		return _mensagem;
	}
}