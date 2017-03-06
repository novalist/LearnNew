package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>webmvctç®åä¾å­</title>\r\n");
      out.write("    <meta charset=\"utf-8\">    \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://v3.bootcss.com/examples/signin/signin.css\"/>\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js\"></script> \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <div  class=\"container\">\r\n");
      out.write("      <form class=\"form-signin\" role=\"form\" action=\"./login/out\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">ç»é</h2>\r\n");
      out.write("        <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"è¯·è¾å¥ç¨æ·å\" required autofocus>\r\n");
      out.write("  \r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">ç»é</button>\r\n");
      out.write("      </form>\r\n");
      out.write("   \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
