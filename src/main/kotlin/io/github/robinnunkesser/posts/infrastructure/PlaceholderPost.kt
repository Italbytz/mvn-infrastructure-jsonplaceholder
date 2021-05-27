package io.github.robinnunkesser.posts.infrastructure

/*
 * Represents a post from https://jsonplaceholder.typicode.com/posts/1
 */
data class PlaceholderPost(
    val userId: Long,
    val id: Long,
    val title: String,
    val body: String
)
