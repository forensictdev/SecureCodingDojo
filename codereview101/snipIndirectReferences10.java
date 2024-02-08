@WebServlet("/lab")
public class LabServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getParameter("url");
        if (isValidURL(url)) {
            response.sendRedirect(url);
        } else {
            response.sendRedirect("/error.jsp");
        }
    }
}
