package com.grupo1.accenture.controller;

import java.io.IOException;
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
        Map<String,String> exemplo = new HashMap<String,String>();

        String buscar = (String) request.getParameter("cellphone-value");

        /*
        * Vamos adicionar alguns valores a nossa lista
        * */
       exemplo.put( "2", new String( "A" ));
       exemplo.put( "22", new String( "B" ));
       exemplo.put( "222", new String( "C" ));
       exemplo.put( "3", new String( "D" ));
       exemplo.put( "33", new String( "E" ));
       exemplo.put( "333", new String( "F" ));
       exemplo.put( "4", new String( "G" ));
       exemplo.put( "44", new String( "H" ));
       exemplo.put( "444", new String( "I" ));
       exemplo.put( "5", new String( "J" ));
       exemplo.put( "55", new String( "K" ));
       exemplo.put( "555", new String( "L" ));
       exemplo.put( "6", new String( "M" ));
       exemplo.put( "66", new String( "N" ));
       exemplo.put( "666", new String( "O" ));
       exemplo.put( "7", new String( "P" ));
       exemplo.put( "77", new String( "Q" ));
       exemplo.put( "777", new String( "R" ));
       exemplo.put( "7777", new String( "S" ));
       exemplo.put( "8", new String( "T" ));
       exemplo.put( "88", new String( "U" ));
       exemplo.put( "888", new String( "V" ));
       exemplo.put( "9", new String( "W" ));
       exemplo.put( "99", new String( "X" ));
       exemplo.put( "999", new String( "Y" ));
       exemplo.put( "9999", new String( "Z" ));

       String responseToSend;

       if ( exemplo.containsKey( buscar ) ) {
    	   responseToSend = "Valor da Chave "+buscar+ " = "+exemplo.get(buscar);
       }else{
    	   responseToSend = "Chave não existe";
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
