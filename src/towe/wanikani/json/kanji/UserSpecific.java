package towe.wanikani.json.kanji;

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
        "srs",
        "srs_numeric",
        "unlocked_date",
        "available_date",
        "burned",
        "burned_date",
        "meaning_correct",
        "meaning_incorrect",
        "meaning_max_streak",
        "meaning_current_streak",
        "reading_correct",
        "reading_incorrect",
        "reading_max_streak",
        "reading_current_streak",
        "meaning_note",
        "user_synonyms",
        "reading_note"
})
public class UserSpecific {

    @JsonProperty("srs")
    private String srs;
    @JsonProperty("srs_numeric")
    private Integer srsNumeric;
    @JsonProperty("unlocked_date")
    private Long unlockedDate;
    @JsonProperty("available_date")
    private Long availableDate;
    @JsonProperty("burned")
    private Boolean burned;
    @JsonProperty("burned_date")
    private Long burnedDate;
    @JsonProperty("meaning_correct")
    private Integer meaningCorrect;
    @JsonProperty("meaning_incorrect")
    private Integer meaningIncorrect;
    @JsonProperty("meaning_max_streak")
    private Integer meaningMaxStreak;
    @JsonProperty("meaning_current_streak")
    private Integer meaningCurrentStreak;
    @JsonProperty("reading_correct")
    private Integer readingCorrect;
    @JsonProperty("reading_incorrect")
    private Integer readingIncorrect;
    @JsonProperty("reading_max_streak")
    private Integer readingMaxStreak;
    @JsonProperty("reading_current_streak")
    private Integer readingCurrentStreak;
    @JsonProperty("meaning_note")
    private Object meaningNote;
    @JsonProperty("user_synonyms")
    private Object userSynonyms;
    @JsonProperty("reading_note")
    private Object readingNote;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * @return The srs
     */
    @JsonProperty("srs")
    public String getSrs() {
        return srs;
    }

    /**
     * @param srs The srs
     */
    @JsonProperty("srs")
    public void setSrs(String srs) {
        this.srs = srs;
    }

    /**
     * @return The srsNumeric
     */
    @JsonProperty("srs_numeric")
    public Integer getSrsNumeric() {
        return srsNumeric;
    }

    /**
     * @param srsNumeric The srs_numeric
     */
    @JsonProperty("srs_numeric")
    public void setSrsNumeric(Integer srsNumeric) {
        this.srsNumeric = srsNumeric;
    }

    /**
     * @return The unlockedDate
     */
    @JsonProperty("unlocked_date")
    public Long getUnlockedDate() {
        return unlockedDate;
    }

    /**
     * @param unlockedDate The unlocked_date
     */
    @JsonProperty("unlocked_date")
    public void setUnlockedDate(Long unlockedDate) {
        this.unlockedDate = unlockedDate;
    }

    /**
     * @return The availableDate
     */
    @JsonProperty("available_date")
    public Long getAvailableDate() {
        return availableDate;
    }

    /**
     * @param availableDate The available_date
     */
    @JsonProperty("available_date")
    public void setAvailableDate(Long availableDate) {
        this.availableDate = availableDate;
    }

    /**
     * @return The burned
     */
    @JsonProperty("burned")
    public Boolean getBurned() {
        return burned;
    }

    /**
     * @param burned The burned
     */
    @JsonProperty("burned")
    public void setBurned(Boolean burned) {
        this.burned = burned;
    }

    /**
     * @return The burnedDate
     */
    @JsonProperty("burned_date")
    public Long getBurnedDate() {
        return burnedDate;
    }

    /**
     * @param burnedDate The burned_date
     */
    @JsonProperty("burned_date")
    public void setBurnedDate(Long burnedDate) {
        this.burnedDate = burnedDate;
    }

    /**
     * @return The meaningCorrect
     */
    @JsonProperty("meaning_correct")
    public Integer getMeaningCorrect() {
        return meaningCorrect;
    }

    /**
     * @param meaningCorrect The meaning_correct
     */
    @JsonProperty("meaning_correct")
    public void setMeaningCorrect(Integer meaningCorrect) {
        this.meaningCorrect = meaningCorrect;
    }

    /**
     * @return The meaningIncorrect
     */
    @JsonProperty("meaning_incorrect")
    public Integer getMeaningIncorrect() {
        return meaningIncorrect;
    }

    /**
     * @param meaningIncorrect The meaning_incorrect
     */
    @JsonProperty("meaning_incorrect")
    public void setMeaningIncorrect(Integer meaningIncorrect) {
        this.meaningIncorrect = meaningIncorrect;
    }

    /**
     * @return The meaningMaxStreak
     */
    @JsonProperty("meaning_max_streak")
    public Integer getMeaningMaxStreak() {
        return meaningMaxStreak;
    }

    /**
     * @param meaningMaxStreak The meaning_max_streak
     */
    @JsonProperty("meaning_max_streak")
    public void setMeaningMaxStreak(Integer meaningMaxStreak) {
        this.meaningMaxStreak = meaningMaxStreak;
    }

    /**
     * @return The meaningCurrentStreak
     */
    @JsonProperty("meaning_current_streak")
    public Integer getMeaningCurrentStreak() {
        return meaningCurrentStreak;
    }

    /**
     * @param meaningCurrentStreak The meaning_current_streak
     */
    @JsonProperty("meaning_current_streak")
    public void setMeaningCurrentStreak(Integer meaningCurrentStreak) {
        this.meaningCurrentStreak = meaningCurrentStreak;
    }

    /**
     * @return The readingCorrect
     */
    @JsonProperty("reading_correct")
    public Integer getReadingCorrect() {
        return readingCorrect;
    }

    /**
     * @param readingCorrect The reading_correct
     */
    @JsonProperty("reading_correct")
    public void setReadingCorrect(Integer readingCorrect) {
        this.readingCorrect = readingCorrect;
    }

    /**
     * @return The readingIncorrect
     */
    @JsonProperty("reading_incorrect")
    public Integer getReadingIncorrect() {
        return readingIncorrect;
    }

    /**
     * @param readingIncorrect The reading_incorrect
     */
    @JsonProperty("reading_incorrect")
    public void setReadingIncorrect(Integer readingIncorrect) {
        this.readingIncorrect = readingIncorrect;
    }

    /**
     * @return The readingMaxStreak
     */
    @JsonProperty("reading_max_streak")
    public Integer getReadingMaxStreak() {
        return readingMaxStreak;
    }

    /**
     * @param readingMaxStreak The reading_max_streak
     */
    @JsonProperty("reading_max_streak")
    public void setReadingMaxStreak(Integer readingMaxStreak) {
        this.readingMaxStreak = readingMaxStreak;
    }

    /**
     * @return The readingCurrentStreak
     */
    @JsonProperty("reading_current_streak")
    public Integer getReadingCurrentStreak() {
        return readingCurrentStreak;
    }

    /**
     * @param readingCurrentStreak The reading_current_streak
     */
    @JsonProperty("reading_current_streak")
    public void setReadingCurrentStreak(Integer readingCurrentStreak) {
        this.readingCurrentStreak = readingCurrentStreak;
    }

    /**
     * @return The meaningNote
     */
    @JsonProperty("meaning_note")
    public Object getMeaningNote() {
        return meaningNote;
    }

    /**
     * @param meaningNote The meaning_note
     */
    @JsonProperty("meaning_note")
    public void setMeaningNote(Object meaningNote) {
        this.meaningNote = meaningNote;
    }

    /**
     * @return The userSynonyms
     */
    @JsonProperty("user_synonyms")
    public Object getUserSynonyms() {
        return userSynonyms;
    }

    /**
     * @param userSynonyms The user_synonyms
     */
    @JsonProperty("user_synonyms")
    public void setUserSynonyms(Object userSynonyms) {
        this.userSynonyms = userSynonyms;
    }

    /**
     * @return The readingNote
     */
    @JsonProperty("reading_note")
    public Object getReadingNote() {
        return readingNote;
    }

    /**
     * @param readingNote The reading_note
     */
    @JsonProperty("reading_note")
    public void setReadingNote(Object readingNote) {
        this.readingNote = readingNote;
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