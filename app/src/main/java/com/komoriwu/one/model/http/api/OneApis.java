package com.komoriwu.one.model.http.api;

import com.komoriwu.one.model.bean.OneIdBean;
import com.komoriwu.one.model.bean.OneListBean;
import com.komoriwu.one.model.http.reponse.MyHttpResponse;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by KomoriWu
 * on 2017/9/15.
 */

public interface OneApis {
    String HOST = "http://v3.wufazhuce.com:8000/api/onelist/";
    String END="?cchannel=wdj&version=4.3.4&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android";

    //获取最新 idlist
    @GET("idlist/"+END)
    Flowable<OneIdBean> getOneId();

    //获取 onelist
    @GET("{id}/0"+END)
    Flowable<MyHttpResponse<OneListBean>> getOneList(@Path("id") String id);

}
