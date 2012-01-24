String.metaClass.slug = {
	delegate.trim().toLowerCase().replaceAll(/[^\w\s]/, '').replaceAll(/\s+/, '-')
}