package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\n");
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
      out.write("    <div class=\"login\">\n");
      out.write("        <div class=\"avatar\">\n");
      out.write("            <img src=\"Img/ava.jpg\" alt=\"error\">\n");
      out.write("        </div>\n");
      out.write("        <h2>Login</h2>\n");
      out.write("        <h3>Welcome back</h3>\n");
      out.write("        <form class=\"login-form\" action=\"login_page\" method=\"POST\" >\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"email\" placeholder=\"example@gmail.com\" name=\"email\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"textbox\">\n");
      out.write("                <input type=\"password\" placeholder=\"********\" name=\"pass\"/>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <button type=\"Submit\">Login</button>\n");
      out.write("            <div class=\"sign-in\">\n");
      out.write("                <a href=\"sign_in.jsp\">\n");
      out.write("                    SignIn\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <a href=\"forgotpw.jsp\">\n");
      out.write("                forgot your cridentials?\n");
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
