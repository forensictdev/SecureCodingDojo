@WebServlet("/lab")
public class LabServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getParameter("url");
        response.sendRedirect(url);
    }
}
