package com.rodrigo.portfolio.data.model

import com.google.gson.annotations.SerializedName
import java.security.acl.Owner

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language: String,
    @SerializedName("html_url")
    val htmlURL: String,
    val description: String
)