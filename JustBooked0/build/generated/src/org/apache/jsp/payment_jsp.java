package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Payment Gateway</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/payment.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navbar.css\">\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            height: 100vh;\n");
      out.write("            width: 100vw;\n");
      out.write("            background-image: url('Img/lbg.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-position: center center;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <form action=\"payment\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col\">\n");
      out.write("\n");
      out.write("                    <h3 class=\"title\">billing address</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>full name :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"john deo\" name=\"cname\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>email :</span>\n");
      out.write("                        <input type=\"email\" placeholder=\"example@example.com\" name=\"cemail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>address :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"room - street - locality\" name=\"cadd\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>city :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"mumbai\" name=\"cc\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <span>state :</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"india\" name=\"conz\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <span>zip code :</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"123 456\" name=\"zip\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col\">\n");
      out.write("\n");
      out.write("                    <h3 class=\"title\">payment</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>cards accepted :</span>\n");
      out.write("                        <img src=\"Img/card_img.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>name on card :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"mr. john deo\" name=\"nameoc\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>credit card number :</span>\n");
      out.write("                        <input type=\"number\" placeholder=\"1111-2222-3333-4444\" name=\"ccno\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"inputBox\">\n");
      out.write("                        <span>exp month :</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"january\" name=\"mon\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"flex\">\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <span>exp year :</span>\n");
      out.write("                            <input type=\"number\" placeholder=\"2022\" name=\"expy\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <span>CVV :</span>\n");
      out.write("                            <input type=\"text\" placeholder=\"1234\" name=\"cvv\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"proceed to checkout\" class=\"submit-btn\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
