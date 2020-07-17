//package com.appleframework.ras.token;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Component;
//
//import com.gitee.easyopen.auth.Oauth2Manager;
//import com.gitee.easyopen.auth.OpenUser;
//import com.gitee.easyopen.auth.RefreshToken;
//
//import cn.lalaframework.easyopen.ApiConfig;
//import cn.lalaframework.easyopen.exception.LoginErrorException;
//
///**
// * 
// * oauth2管理redis实现，这个类跟Oauth2CacheManagerImpl类只能用一个，
// * 如果要用这个类，注释掉Oauth2CacheManagerImpl的@Service
// * 启用这个类的@Service
// */
//@Component
//public class Oauth2RedisManagerImpl implements Oauth2Manager  {
//    
//    //private static String CODE_PREFIX = "oauth2_code:";
//    //private static String ACCESS_TOKEN_PREFIX = "oauth2_access_token:";
//    //private static String REFRESH_TOKEN_PREFIX = "oauth2_refresh_token:";
//    
//	//private Logger logger = LogUtil.get();
//	    
//
//    @Override
//    public void addAuthCode(String authCode, OpenUser authUser) {
//        //redisTemplate.opsForValue().set(getCodeKey(authCode), 
//        //        JSON.toJSONString(authUser), 
//        //        codeTimeoutSeconds, 
//        //        TimeUnit.SECONDS);
//    }
//
//    // 不需要实现，该方法已废弃
//    @Override
//    public void addAccessToken(String accessToken, OpenUser authUser, long expiresIn) {
//    }
//
//    @Override
//    public void addAccessToken(String accessToken, String refreshToken, OpenUser authUser, long expiresIn) {
//        // 存accessToken
//        //redisTemplate.opsForValue().set(getAccessTokenKey(accessToken), JSON.toJSONString(authUser), expiresIn, TimeUnit.SECONDS);
//        // 存refreshToken
//        //redisTemplate.opsForValue().set(
//         //       getRefreshTokenKey(refreshToken), 
//         //       JSON.toJSONString(new RefreshToken(accessToken, authUser)), 
//         //       expiresIn * 3, // refreshToken过期时间，是accessToken的三倍
//         //       TimeUnit.SECONDS);
//    	
//    	
//    }
//
//    @Override
//    public void removeAccessToken(String accessToken) {
//    }
//
//    @Override
//    public void removeRefreshToken(String refreshToken) {
//    }
//
//    @Override
//    public RefreshToken getRefreshToken(String refreshToken) {
//		return null;
//    }
//
//    @Override
//    public boolean checkAuthCode(String authCode) {
//    	return true;
//    }
//    
//	
//
//
//    @Override
//    public OpenUser getUserByAuthCode(String authCode) {
//    	return null;
//    }
//    
//
//    @Override
//    public OpenUser getUserByAccessToken(String accessToken) {
//		return null;
//    }
//
//    @Override
//    public Map<String, String> getParam(OpenUser user) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("username", user.getUsername());
//        map.put("id", user.getId().toString());
//        return map;
//    }
//
//    @Override
//    public long getExpireIn(ApiConfig apiConfig) {
//        return apiConfig.getOauth2ExpireIn();
//    }
//
//    @Override
//    public OpenUser login(HttpServletRequest request) throws LoginErrorException {
//        return null;
//    }
//
//}
