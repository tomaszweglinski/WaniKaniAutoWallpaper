package towe.wanikani.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "username",
        "gravatar",
        "level",
        "title",
        "about",
        "website",
        "twitter",
        "topics_count",
        "posts_count",
        "creation_date",
        "vacation_date"
})
public class UserInformation {

    @JsonProperty("username")
    private String username;
    @JsonProperty("gravatar")
    private String gravatar;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("title")
    private String title;
    @JsonProperty("about")
    private String about;
    @JsonProperty("website")
    private Object website;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("topics_count")
    private Integer topicsCount;
    @JsonProperty("posts_count")
    private Integer postsCount;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("vacation_date")
    private Object vacationDate;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * @param username The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return The gravatar
     */
    @JsonProperty("gravatar")
    public String getGravatar() {
        return gravatar;
    }

    /**
     * @param gravatar The gravatar
     */
    @JsonProperty("gravatar")
    public void setGravatar(String gravatar) {
        this.gravatar = gravatar;
    }

    /**
     * @return The level
     */
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level The level
     */
    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The about
     */
    @JsonProperty("about")
    public String getAbout() {
        return about;
    }

    /**
     * @param about The about
     */
    @JsonProperty("about")
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return The website
     */
    @JsonProperty("website")
    public Object getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    @JsonProperty("website")
    public void setWebsite(Object website) {
        this.website = website;
    }

    /**
     * @return The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return The topicsCount
     */
    @JsonProperty("topics_count")
    public Integer getTopicsCount() {
        return topicsCount;
    }

    /**
     * @param topicsCount The topics_count
     */
    @JsonProperty("topics_count")
    public void setTopicsCount(Integer topicsCount) {
        this.topicsCount = topicsCount;
    }

    /**
     * @return The postsCount
     */
    @JsonProperty("posts_count")
    public Integer getPostsCount() {
        return postsCount;
    }

    /**
     * @param postsCount The posts_count
     */
    @JsonProperty("posts_count")
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    /**
     * @return The creationDate
     */
    @JsonProperty("creation_date")
    public Integer getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate The creation_date
     */
    @JsonProperty("creation_date")
    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return The vacationDate
     */
    @JsonProperty("vacation_date")
    public Object getVacationDate() {
        return vacationDate;
    }

    /**
     * @param vacationDate The vacation_date
     */
    @JsonProperty("vacation_date")
    public void setVacationDate(Object vacationDate) {
        this.vacationDate = vacationDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}