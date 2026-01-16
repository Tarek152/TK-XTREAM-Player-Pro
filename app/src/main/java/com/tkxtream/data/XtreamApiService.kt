package com.tkxtream.data

import retrofit2.http.GET
import retrofit2.http.Query

interface XtreamApiService {
    @GET("player_api.php")
    suspend fun authenticate(
        @Query("username") user: String,
        @Query("password") pass: String
    ): LoginResponse
}

data class LoginResponse(val user_info: UserInfo)
data class UserInfo(val auth: Int, val status: String)
