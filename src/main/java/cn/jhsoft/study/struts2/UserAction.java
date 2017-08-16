package cn.jhsoft.study.struts2;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chen on 2017/8/16.
 */
public class UserAction implements Action {
    public String execute() throws Exception {
        System.out.println("user action ok");
        return SUCCESS;
    }

    public String add() throws Exception {
        System.out.println("user action add ok");
        return NONE;
    }

    public String edit() throws Exception {
        System.out.println("user action edit ok");
        return NONE;
    }

    public String list() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name", "cjh");
        return "list";
    }
}
