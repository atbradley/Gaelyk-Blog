<% include '/WEB-INF/includes/header.gtpl' %>
	<ol>
	<% request.posts.each { %>
		<li>
			<h2><a href="/${it.created.format('yyyy/MM/dd')}/${it.slug}">${it.title}</a></h2>
			<p><em>${it.created.format('E, d M, h:ma')}</em></p>
			<div>${it.body}</div>
		</li>
	<% } %>
	</ol>
<% include '/WEB-INF/includes/footer.gtpl' %>