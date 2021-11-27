package com.rodrigo.portfolio.data.repositories

import com.rodrigo.portfolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}