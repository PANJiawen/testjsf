package monapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="myBean", eager=false)
public class BeanImplementation { 
	
	
    //private static final long serialVersionUID = 7983140976075649622L;

    int value = 0;

    public Integer getCounter() {
        return ++value;
    }

    @PostConstruct
    void init() {
        System.err.println("Create " + this);
    }

    @PreDestroy
    void close() {
        System.err.println("Close " + this);
    }

}