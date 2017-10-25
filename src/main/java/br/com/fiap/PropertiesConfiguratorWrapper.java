package br.com.fiap;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesConfiguratorWrapper {

	public PropertiesConfiguratorWrapper() throws ConfigurationException {
	
		PropertiesConfiguration pc = new PropertiesConfiguration("src/main/java/fiap.properties");
	
		System.out.println("Telefone: " + pc.getString("telefone"));
		System.out.println("Endereço: " + pc.getList("endereco").get(0));
		System.out.println("Numero: " + pc.getList("endereco").get(1));
		
	}
	
	public static void main(String[] args) throws ConfigurationException {
		
		new PropertiesConfiguratorWrapper();

	}

}
