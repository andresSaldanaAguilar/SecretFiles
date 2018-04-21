package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!--  user interface -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <!-- Personalized Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/styles.css\">\n");
      out.write("        <!-- Personalized Scripts -->\n");
      out.write("        <script src=\"resources/scripts.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.9/js/all.js\" integrity=\"sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>App</title>\n");
      out.write("        <!-- SweetAlert -->\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <!-- Google fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Ewert\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- NavBar -->\n");
      out.write("        <nav class=\"navbar navbar-primary bg-primary fixed-top\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"color:white\">CryptoApp</a>  \n");
      out.write("        </nav>\n");
      out.write("        <!-- Body -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"card\" id=\"main-card\">\n");
      out.write("\n");
      out.write("                <div class=\"card-body text-primary\" id=\"transparent\">\n");
      out.write("                    <div class=\"card-deck\" id=\"transparent\">                       \n");
      out.write("                        <div class=\"card border-primary nav-separation\" id=\"transparent\">\n");
      out.write("                            <div class=\"card-body text-primary\" id=\"card-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <!-- column 1 -->\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <text class=\"row justify-content-center\" id=\"title\">HIDDER</text>\n");
      out.write("                                        <!-- Icon and filename -->\n");
      out.write("                                        <div class=\"row justify-content-center button-padding\">\n");
      out.write("                                            <i class=\"fas fa-lock-open fa-10x\" id=\"lockIcon\"></i>                                                  \n");
      out.write("                                        </div>\n");
      out.write("                                        <h5><span class=\"badge badge-outline-primary col align-self-center\">examplefilename.txt</span></h5> \n");
      out.write("                                        <!--Form-->\n");
      out.write("                                        <form name=\"form\" method=\"post\" action=\"FileReciever\" enctype=\"multipart/form-data\">\n");
      out.write("                                                <!--filechooser-->\n");
      out.write("                                                <div class=\"input-group button-padding\">    \n");
      out.write("                                                    <input type=\"file\" class=\"form-control-file\" required name=\"file\" id=\"file\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <!--key-->\n");
      out.write("                                                <div class=\"input-group mb-3\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Key\" aria-label=\"Recipient's username\" aria-describedby=\"basic-addon2\" name=\"key\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Variables to choose -->\n");
      out.write("                                                <div class=\"row justify-content-md-center\">\n");
      out.write("                                                    <!-- Algorithm to choose -->\n");
      out.write("                                                    <select class=\"form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary\" style=\"margin-right: 9%;\">\n");
      out.write("                                                        <option>AES</option>\n");
      out.write("                                                        <option>DES</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <!-- Mode -->\n");
      out.write("                                                    <select class=\"form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary\" style=\"margin-right: 9%;\">\n");
      out.write("                                                        <option>OFB</option>\n");
      out.write("                                                        <option>CBC</option>\n");
      out.write("                                                        <option>ECB</option>\n");
      out.write("                                                        <option>CFB</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <!-- Action -->\n");
      out.write("                                                    <select class=\"form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary\">\n");
      out.write("                                                        <option>CIPHER</option>\n");
      out.write("                                                        <option>DECIPHER</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div> \n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-success btn-block\">Go!</button> \n");
      out.write("                                        </form>\n");
      out.write("                                        <!--submit button-->\n");
      out.write("                                        \n");
      out.write("                                    </div>    \n");
      out.write("                                    <!-- column 2 -->\n");
      out.write("                                    <div class=\"col\">\n");
      out.write("                                        <div class=\"row justify-content-center button-padding\">                                \n");
      out.write("                                            <i class=\"fas fa-cogs fa-10x\" style=\"color:gray\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row justify-content-center button-padding\">  \n");
      out.write("                                            <i class=\"fas fa-arrow-down fa-5x\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row justify-content-center button-padding\">\n");
      out.write("                                            <i class=\"far fa-file fa-8x\" style=\"margin-right: 5%;\"></i>\n");
      out.write("                                            <i class=\"fas fa-user-secret fa-8x\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h5><span class=\"badge badge-outline-primary col align-self-center\">examplefilename.txt</span></h5> \n");
      out.write("                                        <div class=\"row justify-content-center button-padding\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-success col-lg-6 col-xl-6 col-sm-6 col-6\" onclick=\"download()\"><i class=\"fas fa-download\"></i> Download File</button>  \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>                            \n");
      out.write("                    </div>\n");
      out.write("                </div>             \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
