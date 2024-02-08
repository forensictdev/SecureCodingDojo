@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (isUserAuthenticated(request)) {
            String userType = request.getParameter("type");

            if ("admin".equals(userType) && isUserAdmin(request)) {
                response.sendRedirect("/admin/dashboard.jsp");
            } else {
                response.sendRedirect("/user/dashboard.jsp");
            }
        } else {

            response.sendRedirect("/login.jsp");
        }
    }
}
