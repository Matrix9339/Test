package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.Session;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>JustBooked</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
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
      out.write("\n");
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
      out.write("        <div class=\"t1\">\n");
      out.write("            <img src=\"Img/lp0.jpg\" alt=\"\">\n");
      out.write("            <div class=\"box1\">PLAN YOUR VACATIONS</div>\n");
      out.write("            <div class=\"box2\">BOOK NOW AND SAVE MONEY</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"t2\">\n");
      out.write("\n");
      out.write("            <h2>POPULAR TOURS</h2>\n");
      out.write("\n");
      out.write("            <div class=\"t2img\">\n");
      out.write("                <div class=\"i1\">\n");
      out.write("                    <img src=\"Img/rome.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"i1d\">\n");
      out.write("                        <div class=\"i1d1\">\n");
      out.write("                            ROME\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i1d2\">\n");
      out.write("                            FROM\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i1d3\">\n");
      out.write("                            $1,999\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"i2\">\n");
      out.write("                    <div class=\"i2d\">\n");
      out.write("                        <img src=\"Img/hawaii.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"i2d1\">\n");
      out.write("                            HAWAII\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i2d2\">\n");
      out.write("                            FROM\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i2d3\">\n");
      out.write("                            $3,999\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"i3\">\n");
      out.write("                    <img src=\"Img/dubai.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"i3d\">\n");
      out.write("                        <div class=\"i3d1\">\n");
      out.write("                            DUBAI\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i3d2\">\n");
      out.write("                            FROM\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"i3d3\">\n");
      out.write("                            $5,599\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"t3\">\n");
      out.write("            <h2>ENJOY YOUR VACATION WITH US!</h2>\n");
      out.write("            <div class=\"d\">\n");
      out.write("                <img src=\"Img/t3.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"t3d\">\n");
      out.write("                \"The more you travel, the more you learn about new places, new cultures, and new people. This is your time to explore the unknown and see the unseen. Make the best out of it. Stay safe and enjoy!\"\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"t4\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p class=\"op\">\n");
      out.write("        <ul>\n");
      out.write("            <h3>OUR PRODUCTS</h3>\n");
      out.write("\n");
      out.write("            <li>Domestic Hotels</li>\n");
      out.write("            <li>International Hotels</li>\n");
      out.write("            <li>Domestic Flights</li>\n");
      out.write("            <li>International Flights</li>\n");
      out.write("            <li>Multi-City Flights</li>\n");
      out.write("            <li>Couple Friendly Hotels</li>\n");
      out.write("            <li>Nearby Getaways</li>\n");
      out.write("            <li>Bus Booking</li>\n");
      out.write("            <li>Cab Booking</li>\n");
      out.write("            <li>Airport Cabs Booking</li>\n");
      out.write("            <li>Outstation Cabs Booking</li>\n");
      out.write("            <li>Train Booking</li>\n");
      out.write("            <li>Go Stay</li>\n");
      out.write("            <li>Trip Money</li>\n");
      out.write("            <li>Goibibo Advertising Solutions</li>\n");
      out.write("        </ul>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p class=\"au\">\n");
      out.write("        <ul>\n");
      out.write("            <a href=\"aboutus.html\"><h3>ABOUT US</h3></a>\n");
      out.write("            <li>Investor Relations</li>\n");
      out.write("            <li>Management</li>\n");
      out.write("            <li>Terms of Services</li>\n");
      out.write("            <li>User Agreement</li>\n");
      out.write("            <li>Privacy</li>\n");
      out.write("            <li>Careers</li>\n");
      out.write("            <li>YouTube Channel</li>\n");
      out.write("            <li>Technology@JustBooked</li>\n");
      out.write("            <li>Customer Support</li>\n");
      out.write("            <li>Facebook Page</li>\n");
      out.write("            <li>Twitter Handle</li>\n");
      out.write("        </ul>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p class=\"te\">\n");
      out.write("        <ul>\n");
      out.write("            <h3>TRAVEL ESSENTIALS</h3>\n");
      out.write("\n");
      out.write("            <li>PNR Status</li>\n");
      out.write("            <li>Offers</li>\n");
      out.write("            <li>Airline Routes</li>\n");
      out.write("            <li>Train Running Status</li>\n");
      out.write("        </ul>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p class=\"ml\">\n");
      out.write("        <ul>\n");
      out.write("            <h3>MORE LINKS</h3>\n");
      out.write("            \n");
      out.write("            <li>Cheap Flights</li>\n");
      out.write("            <li>Hotels Near Me</li>\n");
      out.write("            <li>My Bookings</li>\n");
      out.write("            <li>Cancellation</li>\n");
      out.write("            <li>My Account</li>\n");
      out.write("            <li>Wallet</li>\n");
      out.write("            <li>Advertise with Us</li>\n");
      out.write("        </ul>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("</footer>\n");
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
