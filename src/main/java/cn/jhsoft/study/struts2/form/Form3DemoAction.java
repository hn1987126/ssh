package cn.jhsoft.study.struts2.form;

import cn.jhsoft.study.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by chenyi9 on 2017/8/17.
 */
public class Form3DemoAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user.getUsername());
        return NONE;
    }

    public User getModel() {
        return user;
    }
}
