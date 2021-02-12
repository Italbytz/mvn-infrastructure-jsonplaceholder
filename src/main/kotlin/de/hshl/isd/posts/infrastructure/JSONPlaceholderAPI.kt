package de.hshl.isd.placeholderposts.infrastructure

import retrofit2.Call
import retrofit2.http.*

/*
 * REST API of https://jsonplaceholder.typicode.com/posts
 */
interface JSONPlaceholderAPI {

    /**
     * Retrieves a post.
     *
     * @param id ID of the post to retrieve.
     * @return A post.
     */
    @GET("posts/{id}")
    fun readPost(@Path("id") id: Long): Call<PlaceholderPost>

    /**
     * Retrieves all posts.
     *
     * @return All posts.
     */
    @GET("posts")
    fun readAllPosts(): Call<List<PlaceholderPost>>

    /**
     * Create a post.
     *
     * @param post The post to create.
     * @return The created post.
     */
    @POST("posts")
    fun createPost(@Body post: PlaceholderPost): Call<PlaceholderPost>

    /**
     * Updates a post.
     *
     * @param id ID of the post to update.
     * @param post Updated post.
     * @return The updated post.
     */
    @PUT("posts/{id}")
    fun updatePost(@Path("id") id: Long, @Body post: PlaceholderPost): Call<PlaceholderPost>

    /**
     * Deletes a post.
     *
     * @param id ID of the post to delete.
     * @return Boolean indicating success or failure.
     */
    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Long): Call<Void>

}

