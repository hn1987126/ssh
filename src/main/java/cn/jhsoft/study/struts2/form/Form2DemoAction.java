package cn.jhsoft.study.struts2.form;

import cn.jhsoft.study.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 使用ServletActionContext获取表单数据封装到实体类对象里
 * Created by chenyi9 on 2017/8/17.
 */
public class Form2DemoAction extends ActionSupport  {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {

        // 封装到实体类对象里
        System.out.println(username+"-"+password);

        return NONE;
    }
}
