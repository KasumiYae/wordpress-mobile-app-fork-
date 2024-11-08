package vn.edu.usth.wordpress_mobile_app.Page;

public class Page {
    private String title;
    private String date;
    private String content;
    public Page(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String getContent() {
        return content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
