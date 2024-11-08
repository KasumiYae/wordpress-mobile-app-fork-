package vn.edu.usth.wordpress_mobile_app.Comment;

public class Comment {
    private String name;
    private String date;
    private String cmt;

    public Comment(String name, String date, String cmt) {
        this.name = name;
        this.date = date;
        this.cmt = cmt;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getCmt() {
        return cmt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
}
