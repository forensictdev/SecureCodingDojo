public class ChangeEmail extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String newEmail = request.getParameter("newEmail");
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.setAttribute("userEmail", newEmail);
        }
        response.getWriter().println("Email changed to: " + newEmail);
    }
}
