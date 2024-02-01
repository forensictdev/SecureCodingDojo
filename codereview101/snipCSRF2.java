public class ChangePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newPassword = request.getParameter("newPassword");
        User user = getAuthenticatedUser(); // Fictional function to get the authenticated user

        if (isCSRFTokenValid(request)) {
            user.setPassword(newPassword);
            saveUser(user); // Fictional function to save the modified user
            PrintWriter out = response.getWriter();
            out.println("Password changed successfully");
        } else {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }
}
