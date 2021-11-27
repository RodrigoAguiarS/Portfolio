package com.rodrigo.portfolio.domain

import com.rodrigo.portfolio.data.model.Repo
import com.rodrigo.portfolio.core.UseCase
import com.rodrigo.portfolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}