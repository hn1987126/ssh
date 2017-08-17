package cn.jhsoft.study.struts2.form;

import cn.jhsoft.study.entity.Book;
import cn.jhsoft.study.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by chenyi9 on 2017/8/17.
 */
public class Form4DemoAction extends ActionSupport {

    private User user;
    private Book book;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user.getUsername()+"----"+user.getPassword()+"----"+book.getBookname());
        return NONE;
    }
}
