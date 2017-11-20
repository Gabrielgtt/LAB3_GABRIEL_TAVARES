import static org.junit.Assert.*;

import org.junit.Test;

public class ContatoTest {

	@Test(expected=NullPointerException.class)
	public void nomeNull(){
		String nome = null;
		String sobrenome = "Tavares";
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com nome igual a null");
	}


	@Test(expected=NullPointerException.class)
	public void sobrenomeNull(){
		String nome = "Gabriel";
		String sobrenome = null;
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com sobrenome igual a null");
	}

	@Test(expected=NullPointerException.class)
	public void numeroNull(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = null;
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com numero igual a null");
	}

	@Test(expected=IllegalArgumentException.class)
	public void nomeVazio(){
		String nome = "";
		String sobrenome = "Tavares";
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com nome vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void sobrenomeVazio(){
		String nome = "Gabriel";
		String sobrenome = "";
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com sobrenome vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void numeroVazio(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = "";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com numero vazio");
	}

	@Test(expected=IllegalArgumentException.class)
	public void nomeSoEspacos(){
		String nome = "     ";
		String sobrenome = "Tavares";
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com nome feito só de espaços");
	}

	@Test(expected=IllegalArgumentException.class)
	public void sobrenomeSoEspacos(){
		String nome = "Gabriel";
		String sobrenome = "     ";
		String numero = "123123";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com sobrenome feito só de espaços");
	}

	@Test(expected=IllegalArgumentException.class)
	public void numeroSoEspacos(){
		String nome = "Gabriel";
		String sobrenome = "Tavares";
		String numero = "      ";
		Contato contato = new Contato(nome, sobrenome, numero);
		fail("Contato foi criado com numero feito só de espaços");
	}

	@Test
	public void equalsNulo(){
	    Contato instancia = new Contato("Gabriel", "Tavares", "1298912");
	    Contato outro = null;
	    if (instancia.equals(outro)){
			fail("Contatos considerados iguais com um deles sendo nulo");
		}
	}

	@Test
	public void equalsNomeDiferente(){
	    Contato instancia = new Contato("Gabriel", "Alves", "12421412");
	    Contato outro = new Contato("Pedro", "Alves", "12421412");
	    if (instancia.equals(outro)){
			fail("Contatos considerados iguais tendo nomes diferentes");
		}
	}

	@Test
	public void equalsNumeroDiferente(){
		Contato instancia = new Contato("Gabriel", "Alves", "12421412");
	    Contato outro = new Contato("Gabriel", "Alves", "1412");
	    if (!instancia.equals(outro)){
			fail("Contatos considerados diferentes tendo nomes iguais");
		}
	}

	@Test
	public void equalsSobrenomeDiferente(){
		Contato instancia = new Contato("Gabriel", "Tavares", "12421412");
	    Contato outro = new Contato("Gabriel", "Alves", "1412");
	    if (instancia.equals(outro)){
			fail("Contatos considerados iguais tendo sobrenomes diferentes");
		}
	}

}
