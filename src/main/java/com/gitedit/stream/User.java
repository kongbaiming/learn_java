package com.gitedit.stream;

/**
 * The type User.
 *
 * @author king
 */
public class User implements java.io.Serializable {
    private int id;
    private String uname;
    transient private String pwd;

    /**
     * Instantiates a new User.
     *
     * @param id    the id
     * @param uname the uname
     * @param pwd   the pwd
     */
    public User(int id, String uname, String pwd) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets uname.
     *
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * Sets uname.
     *
     * @param uname the uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * Gets pwd.
     *
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets pwd.
     *
     * @param pwd the pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
