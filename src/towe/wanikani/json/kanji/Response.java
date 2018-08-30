package towe.wanikani.json.kanji;

import towe.wanikani.json.UserInformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "user_information",
    "requested_information"
})
public class Response {

    @JsonProperty("user_information")
    private UserInformation userInformation;
    @JsonProperty("requested_information")
    private List<Kanji> requestedInformation = new ArrayList<>();
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<>();

    /**
     *
     * @return The userInformation
     */
    @JsonProperty("user_information")
    public UserInformation getUserInformation() {
        return userInformation;
    }

    /**
     *
     * @param userInformation The user_information
     */
    @JsonProperty("user_information")
    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    /**
     *
     * @return The requestedInformation
     */
    @JsonProperty("requested_information")
    public List<Kanji> getRequestedInformation() {
        return requestedInformation;
    }

    /**
     *
     * @param requestedInformation The requested_information
     */
    @JsonProperty("requested_information")
    public void setRequestedInformation(List<Kanji> requestedInformation) {
        this.requestedInformation = requestedInformation;
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
