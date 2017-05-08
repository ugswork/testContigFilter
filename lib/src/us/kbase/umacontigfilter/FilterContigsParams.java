
package us.kbase.umacontigfilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: FilterContigsParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "assembly_input_ref",
    "workspace_name",
    "min_length",
    "libfile_args",
    "extra_params"
})
public class FilterContigsParams {

    @JsonProperty("assembly_input_ref")
    private java.lang.String assemblyInputRef;
    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("min_length")
    private Long minLength;
    @JsonProperty("libfile_args")
    private List<LibfileArgsType> libfileArgs;
    @JsonProperty("extra_params")
    private List<String> extraParams;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("assembly_input_ref")
    public java.lang.String getAssemblyInputRef() {
        return assemblyInputRef;
    }

    @JsonProperty("assembly_input_ref")
    public void setAssemblyInputRef(java.lang.String assemblyInputRef) {
        this.assemblyInputRef = assemblyInputRef;
    }

    public FilterContigsParams withAssemblyInputRef(java.lang.String assemblyInputRef) {
        this.assemblyInputRef = assemblyInputRef;
        return this;
    }

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public FilterContigsParams withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("min_length")
    public Long getMinLength() {
        return minLength;
    }

    @JsonProperty("min_length")
    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public FilterContigsParams withMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonProperty("libfile_args")
    public List<LibfileArgsType> getLibfileArgs() {
        return libfileArgs;
    }

    @JsonProperty("libfile_args")
    public void setLibfileArgs(List<LibfileArgsType> libfileArgs) {
        this.libfileArgs = libfileArgs;
    }

    public FilterContigsParams withLibfileArgs(List<LibfileArgsType> libfileArgs) {
        this.libfileArgs = libfileArgs;
        return this;
    }

    @JsonProperty("extra_params")
    public List<String> getExtraParams() {
        return extraParams;
    }

    @JsonProperty("extra_params")
    public void setExtraParams(List<String> extraParams) {
        this.extraParams = extraParams;
    }

    public FilterContigsParams withExtraParams(List<String> extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((("FilterContigsParams"+" [assemblyInputRef=")+ assemblyInputRef)+", workspaceName=")+ workspaceName)+", minLength=")+ minLength)+", libfileArgs=")+ libfileArgs)+", extraParams=")+ extraParams)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
