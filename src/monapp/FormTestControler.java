package monapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "formTest")
@SessionScoped
public class FormTestControler {

    private String text = "X";

    public String submit() {
        System.out.println("LOG: Submit");
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("LOG: Set text with " + text);
    }

}