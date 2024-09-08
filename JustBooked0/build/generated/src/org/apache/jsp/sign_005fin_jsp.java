package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>SignIn</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sign_in.css\">\n");
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
      out.write("    <div class=\"signin\">\n");
      out.write("        <div class=\"avatar\">\n");
      out.write("            <img src=\"Img/ava.jpg\" alt=\"error\">\n");
      out.write("        </div>\n");
      out.write("        <h2>SignIn</h2>\n");
      out.write("        <h3>Creat New Account</h3>\n");
      out.write("        <form class=\"signin-form\" action=\"http://localhost:25570/JustBooked0/sign_in\" method=\"POST\">\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"text\" placeholder=\"First Name\" name=\"fname\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"text\" placeholder=\"Last Name\" name=\"lname\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"number\" placeholder=\"+91 00000-11111\" name=\"phone\" min=\"10\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"email\" placeholder=\"example@gmail.com\" name=\"email_id\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"password\" placeholder=\"********\" name=\"pas\" min=\"8\" max=\"20\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"password\" placeholder=\"Confirm Password\" name=\"cnfpas\"/>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"Submit\">SignIn</button>\n");
      out.write("            \n");
      out.write("            <a href=\"login_page.jsp\">\n");
      out.write("                Already have a account?\n");
      out.write("            </a>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
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
