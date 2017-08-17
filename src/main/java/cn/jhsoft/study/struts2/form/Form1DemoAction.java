package cn.jhsoft.study.struts2.form;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created by chenyi9 on 2017/8/17.
 */
public class Form1DemoAction extends ActionSupport //implements ServletRequestAware
{

    //private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        // 第一种方式 使用ActionContext类获取
        ActionContext context = ActionContext.getContext();
        Map<String, Object> map = context.getParameters();
        for (Map.Entry<String, Object> en : map.entrySet()) {
            Object[] obj = (Object[])en.getValue();
            System.out.println(Arrays.toString(obj));
        }

        // 第二种方式 使用ServletActionContext类
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"--"+password);

        // 第三种，使用接口注入：让Action实现接口ServletRequestAware
        //System.out.println(this.request.getParameter("username"));

        // 操作三个域对象：
        // 1、request域
        HttpServletRequest request1 = ServletActionContext.getRequest();
        request1.setAttribute("uname", "ght");
        // 2、session域
        HttpSession session = request.getSession();
        session.setAttribute("id", 100);
        // 3、ServletContext域
        ServletContext servletContext = ServletActionContext.getServletContext();
        servletContext.setAttribute("contextname", "contextValue");

        return NONE;
    }

//    public void setServletRequest(HttpServletRequest request) {
//        this.request = request;
//    }
}
