package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_005fpnr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/navbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("    <title>Check PNR</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <img src=\"Img/logo.png\" alt=\"\">\n");
      out.write("                <a href=\"index.jsp\">\n");
      out.write("                    JustBooked\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mid\">\n");
      out.write("\n");
      out.write("                <a href=\"Air_ticket.jsp\">\n");
      out.write("                    <img src=\"Img/aero logo.png\" alt=\"\">\n");
      out.write("                    Flights\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"train.jsp\">\n");
      out.write("                    <img src=\"Img/train-logo.png\" alt=\"\">\n");
      out.write("                    Trains\n");
      out.write("                </a>\n");
      out.write("                <a href=\"cab.jsp\">\n");
      out.write("                    <img src=\"Img/car-logo.png\" alt=\"\">\n");
      out.write("                    Cabs\n");
      out.write("                </a>\n");
      out.write("                <a href=\"bus.jsp\">\n");
      out.write("                    <img src=\"Img/bus logo.png\" alt=\"\">\n");
      out.write("                    Bus\n");
      out.write("                </a>\n");
      out.write("                <a href=\"hotel.jsp\">\n");
      out.write("                    <img src=\"Img/hotel-logo.png\" alt=\"\">\n");
      out.write("                    Hotels\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <a href=\"login_page.jsp\">\n");
      out.write("                    My Account\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"body\">\n");
      out.write("        <img src=\"Img/coming soon.jpeg\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
