package samiamharris.rottenflix.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SamMyxer on 4/14/16.
 */
public class Ratings {

    @SerializedName("critics_rating")
    String criticsRating;
    @SerializedName("critics_score")
    int criticsScore;
    @SerializedName("audience_rating")
    String audienceRating;
    @SerializedName("audience_score")
    int audeinceScore;

    public String getCriticsRating() {
        return criticsRating;
    }

    public int getCriticsScore() {
        return criticsScore;
    }

    public String getAudienceRating() {
        return audienceRating;
    }

    public int getAudeinceScore() {
        return audeinceScore;
    }
}
