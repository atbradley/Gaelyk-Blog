import com.google.appengine.api.datastore.*
import static com.google.appengine.api.datastore.FetchOptions.Builder.*

def dt = Date.parse('dd-MM-yyyy', params.day+"-"+params.month+"-"+params.year)
def dtn = dt + 1

request.post = datastore.execute {
	select all from BlogPost
	where slug == params.title
	and created >= dt
	and created < dtn
	limit 1
}

//println request.posts

forward '/WEB-INF/pages/article.gtpl'