
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
 * <p>Original spec-file type: TestParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "testStr",
    "testInt"
})
public class TestParams {

    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("testStr")
    private String testStr;
    @JsonProperty("testInt")
    private Long testInt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public TestParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("testStr")
    public String getTestStr() {
        return testStr;
    }

    @JsonProperty("testStr")
    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public TestParams withTestStr(String testStr) {
        this.testStr = testStr;
        return this;
    }

    @JsonProperty("testInt")
    public Long getTestInt() {
        return testInt;
    }

    @JsonProperty("testInt")
    public void setTestInt(Long testInt) {
        this.testInt = testInt;
    }

    public TestParams withTestInt(Long testInt) {
        this.testInt = testInt;
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
        return ((((((((("TestParams"+" [workspaceName=")+ workspaceName)+", testStr=")+ testStr)+", testInt=")+ testInt)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
