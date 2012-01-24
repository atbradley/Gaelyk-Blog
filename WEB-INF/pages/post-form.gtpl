<% include '/WEB-INF/includes/header.gtpl' %>

<% if (request?.error) { %>
	<p class="error">${request.error}</p>
<% } %>

<% if (request?.message) { %>
	<p class="msg">${request.message}</p>
<% } %>

<form method="post">
<label for="post-title">Title</label><br />
<input type="text" name="title" id="post-title" /><br />
<br />
<label for="post-body">Body</label><br />
<textarea name="body" id="post-body" cols="80" rows="10"></textarea><br />

<button type="submit">Submit</button>
</form>

<% include '/WEB-INF/includes/footer.gtpl' %>

