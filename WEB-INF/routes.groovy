get "/", forward: "/WEB-INF/groovy/main.groovy" //, cache: 2.hours

get "/@year/@month/@day/@title",
	forward: "/WEB-INF/groovy/article.groovy?year=@year&month=@month&day=@day&title=@title",
	validate: { year ==~ /\d{4}/ && month ==~ /\d{2}/ && day ==~ /\d{2}/ }

all "/new", forward: "/WEB-INF/groovy/new-post.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
