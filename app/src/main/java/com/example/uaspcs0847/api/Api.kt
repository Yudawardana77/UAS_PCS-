package com.example.uaspcs0847.api

import com.example.uaspcs0847.data.model.DetailUserResponse
import com.example.uaspcs0847.data.model.User
import com.example.uaspcs0847.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET ("search/users")
    @Headers("Authorization: token  cb84b151577a4ce55e4ba1860c7a08be0606eea6")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token  cb84b151577a4ce55e4ba1860c7a08be0606eea6")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET ("users/{username}/followers")
    @Headers("Authorization: token  cb84b151577a4ce55e4ba1860c7a08be0606eea6")
    fun getFollowers(
        @Path("username") username:String
    ): Call<ArrayList<User>>

    @GET ("users/{username}/following")
    @Headers("Authorization: token  cb84b151577a4ce55e4ba1860c7a08be0606eea6")
    fun getFollowing(
        @Path("username") username:String
    ): Call<ArrayList<User>>
}