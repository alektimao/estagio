package br.com.maplebearsystem.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.Test;

import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Estoque;
import br.com.maplebearsystem.model.Fornecedor;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.test.dao.TestDAO;

public class GravaFornecedorEProdutos {

	@Test
	public void test() {
		
		try {
			PessoaJuridica pj = new PessoaJuridica();
			pj.setName("Pj de teste 2");
			pj.setCnpj("2222.222.222.321");
			
			
			PessoaFisica pf = new PessoaFisica();
			pf.setName("aleksander");
			pf.setBirthDate(Date.valueOf(LocalDate.now()));
			pf.setEnabled(true);
			pf.setCpf("331.182.080-07");
			
			
			new TestDAO<PessoaJuridica>(PessoaJuridica.class).persist(pj);
			new TestDAO<PessoaFisica>(PessoaFisica.class).persist(pf);
			
			Fornecedor forn = new Fornecedor();
			forn.setPessoa(pj);
			
			new TestDAO<Fornecedor>(Fornecedor.class).persist(forn);
			{
				Product produto = new Product();

				produto.setEstoque(new Estoque());
				produto.getEstoque().setProduct(produto);
				produto.setExtendedDescription("teste");
				produto.setShortDescription("Teste produto 1");
				produto.getEstoque().setQtd(0);
				new ProductDAO().save(produto);
				
				FornecedorProduct fp = new FornecedorProduct();
				fp.setFornecedor(forn);
				fp.setProduct(produto);
				
				new TestDAO<FornecedorProduct>(FornecedorProduct.class).persist(fp);
			}
			{
				Product produto = new Product();

				produto.setEstoque(new Estoque());
				produto.getEstoque().setProduct(produto);
				produto.setExtendedDescription("teste");
				produto.setShortDescription("Teste produto 10");
				produto.getEstoque().setQtd(0);

				new ProductDAO().save(produto);
				
				FornecedorProduct fp = new FornecedorProduct();
				fp.setFornecedor(forn);
				fp.setProduct(produto);
				
				new TestDAO<FornecedorProduct>(FornecedorProduct.class).persist(fp);
			}
			{
				Product produto = new Product();

				produto.setEstoque(new Estoque());
				produto.getEstoque().setProduct(produto);
				produto.setExtendedDescription("teste");
				produto.setShortDescription("Teste produto 4");
				produto.getEstoque().setQtd(0);

				new ProductDAO().save(produto);
				
				FornecedorProduct fp = new FornecedorProduct();
				fp.setFornecedor(forn);
				fp.setProduct(produto);
				
				new TestDAO<FornecedorProduct>(FornecedorProduct.class).persist(fp);
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
				
				FornecedorProduct fp = new FornecedorProduct();
				fp.setFornecedor(forn);
				fp.setProduct(produto);
				
				new TestDAO<FornecedorProduct>(FornecedorProduct.class).persist(fp);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}

}
