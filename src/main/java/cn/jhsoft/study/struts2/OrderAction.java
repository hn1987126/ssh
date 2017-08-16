package cn.jhsoft.study.struts2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chenyi9 on 2017/8/16.
 */
public class OrderAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("here");
        return NONE;
    }
}
