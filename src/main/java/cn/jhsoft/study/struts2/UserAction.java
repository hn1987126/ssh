package cn.jhsoft.study.struts2;

import cn.jhsoft.study.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 2017/8/16.
 */
public class UserAction implements Action {

    private String uname;

    public String getUname() {
        return uname;
    }

    private User user;

    public User getUser() {
        return user;
    }

    private List<User> list;

    public List<User> getList() {
        return list;
    }

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

        // 获取ActionContext类对象
        ActionContext context = ActionContext.getContext();
        // 调用方法得到值栈对象
        ValueStack stack = context.getValueStack();
        // 调用方法set
        stack.set("username", "ght");
        stack.push("chenyi");
        // 第三种方式：向类成员变量设置值
        uname = "ggg";
        user = new User();
        user.setUsername("ght");
        user.setPassword("123456");

        list = new ArrayList<User>();
        list.add(user);
        User user2 = new User();
        user2.setUsername("cjh");
        user2.setPassword("123456");
        list.add(user2);



        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name", "cjh");
        return "list";
    }
}
