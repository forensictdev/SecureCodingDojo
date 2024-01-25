<div class="form-group">
    <label for="username">Username:</label>
    <input type="text" class="form-control" id="username" name="username">

    <label for="password">Password:</label>
    <input type="password" class="form-control" id="password" name="password">

    <input type="submit" id="submit" class="btn" value="Login">
    <div class="alert alert-danger <%=alertVisibility%>">
        Invalid username or password: <%=StringEscapeUtils.escapeHtml4(request.getParameter("username"))%>
    </div>
</div>
