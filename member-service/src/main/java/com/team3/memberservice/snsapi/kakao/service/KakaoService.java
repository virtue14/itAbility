package com.team3.memberservice.snsapi.kakao.service;


import java.util.ArrayList;

public interface KakaoService {

    String getToken(String code) throws Exception ;
    ArrayList<Object> getUserInfo(String access_token) throws Exception;

}
