@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userType = request.getParameter("type");

        if ("admin".equals(userType)) {
            response.sendRedirect("/admin/dashboard.jsp");
        } else {
            response.sendRedirect("/user/dashboard.jsp");
        }
    }
}
