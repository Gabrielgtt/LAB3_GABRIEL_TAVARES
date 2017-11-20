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

	@Test
	public void equalsNulo(){
	    Agenda agenda = new Agenda();
	    Agenda outro = null;
	    if (agenda.equals(outro)){
			fail("Agenda foi considera igual a outra agenda nula");
		}
	}

	@Test
	public void equalsContatosIguais(){
	    Agenda agenda = new Agenda();
		agenda.cadastraContato("Gabriel", "Alves", "1234", 5);
	    Agenda outro = new Agenda();
		outro.cadastraContato("Gabriel", "Alves", "1234", 7);
	    if (agenda.equals(outro)){
			fail("Agenda tem contato iguais mas em posições diferentes e foram consideradas iguais");
		}
	}

	@Test
	public void equalsSemContatos(){
	    Agenda agenda = new Agenda();
		agenda.cadastraContato("Gabriel", "Alves", "1234", 7);
	    Agenda outro = new Agenda();
	    if (agenda.equals(outro)){
			fail("Agenda sem contatos foi considera igual a outra com um contato");
		}
	}

	@Test
	public void equalsAmbasSemContatos(){
	    Agenda agenda = new Agenda();
	    Agenda outro = new Agenda();
	    if (!agenda.equals(outro)){
			fail("As duas agendas vazias foram consideradas diferentes");
		}
	}

	@Test
	public void equalsIguais(){
	    Agenda agenda = new Agenda();
		agenda.cadastraContato("Gabriel", "Alves", "1234", 7);
	    Agenda outro = new Agenda();
		outro.cadastraContato("Gabriel", "Alves", "1234", 7);
	    if (!agenda.equals(outro)){
			fail("As duas agendas com o mesmo contato na mesma posição foram consideradas diferentes");
		}
	}

}
