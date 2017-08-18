package cn.jhsoft.study.struts2.inter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenyi9 on 2017/8/18.
 */
public class LoginInterceptor extends MethodFilterInterceptor {

    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        Object obj = request.getSession().getAttribute("username");
        if (obj != null) {
            // 放行
            return actionInvocation.invoke();
        }else{
            // 在result标签里找到名称是login的值，到配置路径里面
            return "login";
        }
    }

}
