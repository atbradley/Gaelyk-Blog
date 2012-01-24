<% include '/WEB-INF/includes/header.gtpl' %>
	<% request.post.each { %>
		<h1>${it.title}</h1>
		<p><em>${it.created.format('E, d M, h:ma')}</em></p>
		<div>${it.body}</div>	
	<% } %>
<% include '/WEB-INF/includes/footer.gtpl' %>