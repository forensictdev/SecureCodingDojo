public class ChangeEmail extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String newEmail = request.getParameter("newEmail");
        HttpSession session = request.getSession(false);
        if (session != null) {
            String csrfToken = (String) session.getAttribute("csrfToken");
            String requestToken = request.getParameter("csrfToken");
            if (csrfToken != null && csrfToken.equals(requestToken)) {
                session.setAttribute("userEmail", newEmail);
                response.getWriter().println("Email changed to: " + newEmail);
            } else {
                response.getWriter().println("Invalid request.");
            }
        }
    }
 }
