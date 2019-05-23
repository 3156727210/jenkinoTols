package zdh.entity;

public class Login {

    private  int Longi_id;
    private String username;
    private String password;

    public int getLongi_id() {
        return Longi_id;
    }

    public void setLongi_id(int longi_id) {
        Longi_id = longi_id;
    }

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
    public String toString() {
        return "Login{" +
                "Longi_id=" + Longi_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
