package com.grupo1.accenture.controller;

import java.io.IOException;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class CelularController
 */
@WebServlet(description = "Trata os dados recebidos pelo front-end do celular", urlPatterns = { "/enviar" })
public class CelularController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CelularController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        Map<String,Map<String, String>> exemplo = new HashMap<String,Map<String, String>>();

        String buscar = (String) request.getParameter("cellphone-value");

        /*
        * Vamos adicionar alguns valores a nossa lista
        * */
        
       buscar = "22"; 
       
       Map<String, String> values = new HashMap<String, String>();
       values.put( "2", new String( "A" ));
       values.put( "22", new String( "B" ));
       values.put( "222", new String( "C" ));

       exemplo.put("2", values);

       
       
       String[] arrayString = buscar.split(" ");
       String responseToSend = "";
       
       for (int i = 0; i < arrayString.length; i++) {
    	   if (exemplo.containsKey(arrayString[i].charAt(0))) {
    		   responseToSend = exemplo.get(arrayString[i].charAt(0)).get(arrayString[i].length());
    	   }
      }
       

       
       response.getWriter().append(responseToSend);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
