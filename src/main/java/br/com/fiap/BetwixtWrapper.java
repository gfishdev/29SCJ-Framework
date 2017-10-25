package br.com.fiap;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.io.StringWriter;

import org.apache.commons.betwixt.io.BeanWriter;
import org.xml.sax.SAXException;

import br.com.fiap.vo.ColaboradorVO;
import br.com.fiap.vo.EmpresaVO;

public class BetwixtWrapper {
	
	public BetwixtWrapper() throws IOException, SAXException, IntrospectionException {
		
		EmpresaVO empresaVO = new EmpresaVO();
		empresaVO.setCodigo("E01");
		empresaVO.setNome("FIAP");
		
		ColaboradorVO colaboradorVO = new ColaboradorVO();
		colaboradorVO.setCodigo("C01");
		colaboradorVO.setNome("Luis Castro");
		colaboradorVO.setEmpresaVO(empresaVO);
		
		StringWriter sw = new StringWriter();
		BeanWriter bw = new BeanWriter(sw);
		bw.enablePrettyPrint();
		bw.write("Colaborador", colaboradorVO);
		System.out.println(sw.toString());
	}
	
	public static void main(String[] args) throws IOException, SAXException, IntrospectionException {
		new BetwixtWrapper();
	}

}
