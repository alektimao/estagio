package br.com.maplebearsystem.tests.main;

import java.util.List;

import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Address;
import br.com.maplebearsystem.model.Estoque;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.Product;

public class InsereProdutoPorqueOGabrielPediuEEuComoAlunoAceitei {
	public static void main(String[] args) {
		{
			Product produto = new Product();

			produto.setEstoque(new Estoque());
			produto.getEstoque().setProduct(produto);
			produto.setExtendedDescription("teste");
			produto.setShortDescription("Teste produto 1");
			produto.getEstoque().setQtd(0);

			new ProductDAO().save(produto);
		}
		{
			Product produto = new Product();

			produto.setEstoque(new Estoque());
			produto.getEstoque().setProduct(produto);
			produto.setExtendedDescription("teste");
			produto.setShortDescription("Teste produto 10");
			produto.getEstoque().setQtd(0);

			new ProductDAO().save(produto);
		}
		{
			Product produto = new Product();

			produto.setEstoque(new Estoque());
			produto.getEstoque().setProduct(produto);
			produto.setExtendedDescription("teste");
			produto.setShortDescription("Teste produto 4");
			produto.getEstoque().setQtd(0);

			new ProductDAO().save(produto);
		}
		{
			Product produto = new Product();

			produto.setEstoque(new Estoque());
			produto.getEstoque().setProduct(produto);
			produto.setExtendedDescription("teste");
			produto.setShortDescription("Teste produto 3");
			produto.getEstoque().setQtd(0);

			new ProductDAO().save(produto);
		}
		{
			Product produto = new Product();

			produto.setEstoque(new Estoque());
			produto.getEstoque().setProduct(produto);
			produto.setExtendedDescription("teste");
			produto.setShortDescription("Teste produto 8");
			produto.getEstoque().setQtd(0);

			new ProductDAO().save(produto);
		}
//		Pessoa pessoa = new Pessoa();
//		Address end = new Address();
//		//List<Address> endereco = new List<Address>;
//		List<Address> teste = new List<Address>();
//		//produto.setName("aleksander");
//		//produto.setAdresses(adresses);;
//		//produto.setEnabled(true);
//		//produto.setPhones(phones);
//
//		//new PessoaDAO().save(produto);
	}
}
