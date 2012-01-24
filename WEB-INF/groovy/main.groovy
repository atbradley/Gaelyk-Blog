import com.google.appengine.api.datastore.*
import static com.google.appengine.api.datastore.FetchOptions.Builder.*

request.posts = datastore.execute {
	select all from BlogPost
	sort desc by created
	limit 10
}

//request.posts.each { it.delete() }

forward '/WEB-INF/pages/index.gtpl'