package com.rodrigo.portflio.data.services

import retrofit2.http.GET
import retrofit2.http.Path
import com.rodrigo.portflio.data.model.Repo

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}