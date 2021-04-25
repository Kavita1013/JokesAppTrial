package kavita.myappcompany.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Post {

    //private  int  userId;
    private int id;
    private String type;
    private String setup;
    @SerializedName("punchline")
    private String punchline;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSetup() {
        return setup;
    }

    public String getPunchline() {
        return punchline;
    }
/* public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }*/

}
