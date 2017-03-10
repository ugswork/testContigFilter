
package us.kbase.umacontigfilter;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: testResult</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "result_str",
    "result_length"
})
public class TestResult {

    @JsonProperty("result_str")
    private String resultStr;
    @JsonProperty("result_length")
    private Long resultLength;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result_str")
    public String getResultStr() {
        return resultStr;
    }

    @JsonProperty("result_str")
    public void setResultStr(String resultStr) {
        this.resultStr = resultStr;
    }

    public TestResult withResultStr(String resultStr) {
        this.resultStr = resultStr;
        return this;
    }

    @JsonProperty("result_length")
    public Long getResultLength() {
        return resultLength;
    }

    @JsonProperty("result_length")
    public void setResultLength(Long resultLength) {
        this.resultLength = resultLength;
    }

    public TestResult withResultLength(Long resultLength) {
        this.resultLength = resultLength;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("TestResult"+" [resultStr=")+ resultStr)+", resultLength=")+ resultLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
