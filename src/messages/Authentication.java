package messages;

import java.io.Serializable;

public class Authentication implements Commands, Serializable {
    private String login;
    private String password;

    public Authentication(String msg) {
        split(msg);
    }

    private void split(String msg){
        String[] strings = msg.split(" ");
        this.login = strings[0];
        this.password = strings[1];
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
