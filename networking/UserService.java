package com.david.luharsamaj.networking;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;


public interface UserService {

    @POST("users/login")
    @FormUrlEncoded
    Call<String> userLogin(@Header("Authorization") String string,
                           @Field("username") String username,
                           @Field("password") String password);

    @POST("users/register")
    @FormUrlEncoded
    Call<String> userRegister(@Header("Authorization") String string,
                              @Field("username") String username,
                              @Field("password") String pasword,
                              @Field("email") String email,
                              @Field("mobile") String mobile);


    @GET("users/users")
    Call<String> getUsers(@Header("Authorization") String string);

    @GET("teams/team_by_type")
    Call<String> getTeam(@Header("Authorization") String string, @Query("type") int type);

    @GET("magazine/magazine")
    Call<String> getMagazine(@Header("Authorization") String string);

    @GET("breaking_news/get")
    Call<String> getBreakingNews(@Header("Authorization") String string);

    @GET("rojgar_news/get")
    Call<String> getRojgarNews(@Header("Authorization") String string);

    @GET("vividh_mahiti/get")
    Call<String> getMahiti(@Header("Authorization") String string);

    @POST("users/forgot_password")
    @FormUrlEncoded
    Call<String> forgetPassword(@Header("Authorization") String string,
                                @Field("email") String password);

    @POST("users/reset_password")
    @FormUrlEncoded
    Call<String> resetPassword(@Header("Authorization") String string,
                               @Field("email") String email,
                               @Field("current_password") String current_password,
                               @Field("new_password") String new_password);

    @GET("events/list")
    Call<String> getGalleryImages(@Header("Authorization") String string);


    @GET("gnati/get")
    Call<String> getGnati(@Header("Authorization") String string);

    @GET("business_expo/get")
    Call<String> getBusinessExpo(@Header("Authorization") String string);

    @GET("users/user_profile_by_gender")
    Call<String> getMalelist(@Header("Authorization") String string, @Query("gender") String male);

    @GET("users/user_profile_by_gender")
    Call<String> getFemaleList(@Header("Authorization") String string, @Query("gender") String female);


    @Streaming
    @GET
    Call<ResponseBody> downloadFileByUrl(@Url String fileUrl);

    //
    @POST("users/filter_user")
    @FormUrlEncoded
    Call<String> Filter(@Header("Authorization") String string,
                        @Field("marital_status") String mstatus,
                        @Field("from_year") String fromyear,
                        @Field("to_year") String toyear,
                        @Field("gender") String Gender,
                        @Field("candidate_name") String name,
                        @Field("study") String study);

    @Multipart
    @POST("users/save_profile_image")
    Call<String> upload_image(@Header("Authorization") String string,
                              @PartMap Map<String,RequestBody> map) ;

    @Multipart
    @POST("users/save_profile")
    Call<String> Registration(@Header("Authorization") String string,
                              @Part("candidate_name") String fname,
                              @Part("Surname") String lname,
                              @Part("gender") String gender,
                              @Part("date_of_birth") String bod,
                              @Part("birth_time") String bot,
                              @Part("birth_place") String bplace,
                              @Part("height") String height,
                              @Part("weight") String weight,
                              @Part("study") String education,
                              @Part("job_bussiness") String bussiness,
                              @Part("anual_income") String income,
                              @Part("marital_status") String mstatus,
                              @Part("handicamp") String Phisical,
                              @Part("Specs") String Glasses,
                              @Part("Mangaldosh") String Mangal,
                              @Part("Hobby") String hobby,
                              @Part("father_full_name") String fathername,
                              @Part("Gnati") String cast,
                              @Part("mother_name") String mothername,
                              @Part("father_bussiness") String fatherBussiness,
                              @Part("address") String Address,
                              @Part("native_palce") String native_palce,
                              @Part("father_mob_no") String Contactp,
                              @Part("mob_no") String ContactC,
                              @Part("email") String Email,
                              @Part MultipartBody.Part file1,
                              @Part MultipartBody.Part file2,
                              @Part MultipartBody.Part file3,
                              @Part("user_id") String user_id,
                              @Part("username") String username,
                              @Part("password") String password);
}
