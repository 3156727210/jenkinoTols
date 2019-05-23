package zdh.util;

public enum RequestMap {

    USERNAME("nsername"),
    PASSWORD("password");

    //定义一个变量
    private String name;

    RequestMap(String nsername) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RequestMap{" +
                "name='" + name + '\'' +
                '}';
    }
}
