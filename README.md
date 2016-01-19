## Wordpress REST API Retrofit Library

The Wordpress REST API Retrofit Java Library provides a simple interface to the Wordpress REST API (http://wp-api.org/)

Only the /posts/ endpoint of the api is implemented so far

### Requirements

Java 8 or later (earlier versions are untested)

### Using with Maven

Add this dependency to your project's POM:

    <dependency>
      <groupId>com.moo</groupId>>
      <artifactId>retrofit-wordpress-rest-api</artifactId>>
      <version>${VERSION}</version>
    </dependency>

### Usage

#### Creating a client

    See http://square.github.io/retrofit/.
    
    e.g.
    Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.your-blog.com")
                .build();

    WordpressApi api = retrofit.create(WordpressApi.class);

#### Finding posts with a filter
    PostFilter filter = new PostFilter();
    filter.setParam(PostFilter.WPFilterKeys.posts_per_page, numberOfPosts.toString());
    Call<List<Post>> call = api.getPosts(filter.toMap());
