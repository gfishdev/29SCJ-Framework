package br.com.fiap;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import br.com.fiap.vo.ColaboradorVO;
import br.com.fiap.vo.ColaboradorVO2;
import br.com.fiap.vo.EmpresaVO;

/**
 * Hello world!
 *
 */
public class BeanUtilsWrapper 
{
	
	public BeanUtilsWrapper() throws IllegalAccessException, 
									 InvocationTargetException {
		
		EmpresaVO empresaVO = new EmpresaVO();
		empresaVO.setCodigo("E01");
		empresaVO.setNome("FIAP");
		
		ColaboradorVO colaboradorVO = new ColaboradorVO();
		colaboradorVO.setCodigo("C01");
		colaboradorVO.setNome("Luis Castro");
		colaboradorVO.setEmpresaVO(empresaVO);
		
		//ColaboradorVO colaboradorVO2 = new ColaboradorVO();
		ColaboradorVO2 colaboradorVO3 = new ColaboradorVO2();
		
		BeanUtils.copyProperties(colaboradorVO3, colaboradorVO);
		
		System.out.println("Nome Colaborador : " + colaboradorVO.getNome());
		System.out.println("Nome Colaborador Copy: " + colaboradorVO3.getNome());
		System.out.println("Endereco Colaborador Copy: " + colaboradorVO3.getEndereco());
		
	}
	
    public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException
    {
        new BeanUtilsWrapper();
    }
}
