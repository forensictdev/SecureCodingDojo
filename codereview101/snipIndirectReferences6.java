@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
        if (validateUserId(userId)) {
            String url = "/profile.jsp?id=" + userId;
            response.sendRedirect(url);
        } else {

            response.sendRedirect("/home.jsp");
        }
    }
}
