import com.google.appengine.api.datastore.Entity

if ( params.body == null ) { 
	//The form wasn't submitted. Just quit.
} else if ( !params.body || !params.title ) {
	//Some required data wasn't sent. Set an error message and quit.
	request.error = "Body and Title are required."
} else {
	//Create a new blog post.
	Entity newpost = new Entity("BlogPost")
	newpost.title = params.title
	newpost.body = params.body
	
	//Create a post slug for URLs.
	newpost.slug = params.title.slug()

	//Set the post created date.
	newpost.created = new Date()
	
	//Save the post.
	newpost.save()
	
	//Tell the user the post has been created.
	request.message = "New post \"$newpost.title\" created."
}

forward "../pages/post-form.gtpl"