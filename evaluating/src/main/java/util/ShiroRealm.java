package util;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.evaluating.model.Role;
import com.evaluating.model.User;
import com.evaluating.service.RoleService;
import com.evaluating.service.UserService;

public class ShiroRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;
	
	private RoleService roleService;
	/**
	 * 登录认证
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String)token.getPrincipal();
		String password = new String((char[])token.getCredentials());
		User user = userService.getUser(userName, password);
		if(user!=null) {
			 //如果身份认证验证成功，返回一个AuthenticationInfo实现；  
	        return new SimpleAuthenticationInfo(user, userName, getName());  
		}
		throw new UnknownAccountException();
	}
	
	/**
	 * 权限认证
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User)SecurityUtils.getSubject().getPrincipal();
		
		Integer id = user.getId();
		
		List<Role> roles = roleService.getRolesByUser(user);
		// TODO Auto-generated method stub
		return null;
	}

}
