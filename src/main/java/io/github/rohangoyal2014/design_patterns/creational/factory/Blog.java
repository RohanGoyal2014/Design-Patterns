package io.github.rohangoyal2014.design_patterns.creational.factory;

public class Blog extends Website {

	@Override
	public void createPages() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
