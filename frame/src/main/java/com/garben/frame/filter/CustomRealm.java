//package com.garben.frame.filter;
//
//import com.garben.business.service.UserService;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class CustomRealm extends AuthorizingRealm {
//    private static Logger logger = LoggerFactory.getLogger(CustomRealm.class);
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = (String) SecurityUtils.getSubject().getPrincipal();
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("user:show");
//        stringSet.add("user:admin");
//        info.setStringPermissions(stringSet);
//        return info;
//
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        logger.info("-------身份认证方法--------");
//        String userName = (String) authenticationToken.getPrincipal();
//        String userPwd = new String((char[]) authenticationToken.getCredentials());
//        //根据用户名从数据库获取密码
//        String password = userService.findPasswordByUserName(userName);
//        if (userName == null) {
//            throw new AccountException("用户名不正确");
//        } else if (!userPwd.equals(password )) {
//            throw new AccountException("密码不正确");
//        }
//        return new SimpleAuthenticationInfo(userName, password,getName());
//  }
//}
