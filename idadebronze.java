public class IdadeDoBronze {
	public String periodo;
	public String[] regioesPrincipais;
	public String[] melhoresInvencoes;
	
	public IdadeDoBronze(String periodo, String[] regioesPrincipais, String[] melhoresInvencoes) {
		this.periodo = periodo;
		this.regioesPrincipais = regioesPrincipais;
		this.melhoresInvencoes = melhoresInvencoes;
	}
	
	public String detalharAvancoesTecnologicos() {
		return "Foi uma época bem revolucionária";
	}
	
	public void listarCivilizacoes() {
		for (String civilizacao : regioesPrincipais) {
			System.out.println(civilizacao);
		}
	}
	
	public String identificarLegado() {
		return "\nPlanejamento Urbano: As cidades bem planejadas e as"+
				"inovações em infraestrutura, como sistemas de drenagem"+
				"e arquitetura monumental, serviram de modelo para o d"+
				"esenvolvimento urbano futuro"
				+"\nMitologia e Religião: Muitas das tradições religiosas "
				+ "e mitos que se desenvolveram durante a Idade do Bronze "
				+ "influenciaram as crenças e práticas culturais em períodos "
				+ "subsequentes.";
	}
}
