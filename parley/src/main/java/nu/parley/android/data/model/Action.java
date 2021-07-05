package nu.parley.android.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public final class Action {

    @SerializedName("type")
    private String type;

    @SerializedName("title")
    private String title;

    @SerializedName("payload")
    private String payload;

    Action(String title, String payload) {
        this.title = title;
        this.payload = payload;
    }

    public String getTitle() {
        return title;
    }

    public String getPayload() {
        return payload;
    }
}