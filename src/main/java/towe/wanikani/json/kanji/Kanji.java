package towe.wanikani.json.kanji;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "character",
    "meaning",
    "onyomi",
    "kunyomi",
    "nanori",
    "important_reading",
    "level",
    "user_specific"
})
public class Kanji {

    @JsonProperty("character")
    private String character;
    @JsonProperty("meaning")
    private String meaning;
    @JsonProperty("onyomi")
    private String onyomi;
    @JsonProperty("kunyomi")
    private String kunyomi;
    @JsonProperty("nanori")
    private Object nanori;
    @JsonProperty("important_reading")
    private String importantReading;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("user_specific")
    private UserSpecific userSpecific;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     *
     * @return The character
     */
    @JsonProperty("character")
    public String getCharacter() {
        return character;
    }

    /**
     *
     * @param character The character
     */
    @JsonProperty("character")
    public void setCharacter(String character) {
        this.character = character;
    }

    /**
     *
     * @return The meaning
     */
    @JsonProperty("meaning")
    public String getMeaning() {
        return meaning;
    }

    /**
     *
     * @param meaning The meaning
     */
    @JsonProperty("meaning")
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /**
     *
     * @return The onyomi
     */
    @JsonProperty("onyomi")
    public String getOnyomi() {
        return onyomi;
    }

    /**
     *
     * @param onyomi The onyomi
     */
    @JsonProperty("onyomi")
    public void setOnyomi(String onyomi) {
        this.onyomi = onyomi;
    }

    /**
     *
     * @return The kunyomi
     */
    @JsonProperty("kunyomi")
    public String getKunyomi() {
        return kunyomi;
    }

    /**
     *
     * @param kunyomi The kunyomi
     */
    @JsonProperty("kunyomi")
    public void setKunyomi(String kunyomi) {
        this.kunyomi = kunyomi;
    }

    /**
     *
     * @return The nanori
     */
    @JsonProperty("nanori")
    public Object getNanori() {
        return nanori;
    }

    /**
     *
     * @param nanori The nanori
     */
    @JsonProperty("nanori")
    public void setNanori(Object nanori) {
        this.nanori = nanori;
    }

    /**
     *
     * @return The importantReading
     */
    @JsonProperty("important_reading")
    public String getImportantReading() {
        return importantReading;
    }

    /**
     *
     * @param importantReading The important_reading
     */
    @JsonProperty("important_reading")
    public void setImportantReading(String importantReading) {
        this.importantReading = importantReading;
    }

    /**
     *
     * @return The level
     */
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    /**
     *
     * @param level The level
     */
    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     *
     * @return The userSpecific
     */
    @JsonProperty("user_specific")
    public UserSpecific getUserSpecific() {
        return userSpecific;
    }

    /**
     *
     * @param userSpecific The user_specific
     */
    @JsonProperty("user_specific")
    public void setUserSpecific(UserSpecific userSpecific) {
        this.userSpecific = userSpecific;
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
