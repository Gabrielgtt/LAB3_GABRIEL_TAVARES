import static org.junit.Assert.*;

import org.junit.Test;

public class AgendaTest {

	@Test(expected=NullPointerException.class)
	public void cadastraNomeNull(){
		String nome = null;
		String sobrenome = "Tavares";
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com nome igual a null");
	}


	@Test(expected=NullPointerException.class)
	public void cadastraSobrenomeNull(){
		String nome = "Gabriel";
		String sobrenome = null;
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com sobrenome igual a null");
	}

	@Test(expected=NullPointerException.class)
	public void cadastraNumeroNull(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = null;
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com numero igual a null");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraNomeVazio(){
		String nome = "";
		String sobrenome = "Tavares";
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com nome vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraSobrenomeVazio(){
		String nome = "Gabriel";
		String sobrenome = "";
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com sobrenome vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraNumeroVazio(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = "";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com numero vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraNomeSoEspacos(){
		String nome = "     ";
		String sobrenome = "Tavares";
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com nome feito só de espaços");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraSobrenomeSoEspacos(){
		String nome = "Gabriel";
		String sobrenome = "     ";
		String numero = "123123";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com sobrenome feito só de espaços");
	}

	@Test(expected=IllegalArgumentException.class)
	public void cadastraNumeroSoEspacos(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = "      ";
		int posicao = 1;
		Agenda agenda = new Agenda();
		agenda.cadastraContato(nome, sobrenome, numero, posicao);
		fail("Contato foi criado com numero feito só de espaços");
	}

}
