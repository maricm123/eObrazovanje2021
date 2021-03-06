package ftn.projekat.eObrazovanje.ProjekatEObrazovanje20212022.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		 HttpServletResponse response = (HttpServletResponse) res;
	     response.setHeader("Access-Control-Allow-Origin", "*");
	     response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
	     response.setHeader("Access-Control-Max-Age", "3600");
	     response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, X-Auth-Token, Content-Type, Accept");
	     chain.doFilter(request, res);
	     
	     System.out.println("corseee");
	}
	
	 public void init(FilterConfig filterConfig) {}

	  public void destroy() {}

}
