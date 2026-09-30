
package udmi.schema;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alarm Alarmset Model
 * <p>
 * Information about a specific alarm name of the device.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmAlarmsetModel {

    /**
     * Detailed description of this alarm
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Detailed description of this alarm")
    public java.lang.String description;
    /**
     * Category that this alarm is classified as
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Category that this alarm is classified as")
    public java.lang.String category;
    /**
     * Severity of the alarm
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Severity of the alarm")
    public java.lang.String severity;
    /**
     * Indicates whether or not alarm activation requries acknowledgement.
     * 
     */
    @JsonProperty("requires_ack")
    @JsonPropertyDescription("Indicates whether or not alarm activation requries acknowledgement.")
    public Boolean requires_ack;
    /**
     * Indicates whether or not the alarm sends return-to-normal events.
     * 
     */
    @JsonProperty("return_to_normal_event")
    @JsonPropertyDescription("Indicates whether or not the alarm sends return-to-normal events.")
    public Boolean return_to_normal_event;
    /**
     * Indicates whether or not returning to normal requries acknowledgement.
     * 
     */
    @JsonProperty("return_requires_ack")
    @JsonPropertyDescription("Indicates whether or not returning to normal requries acknowledgement.")
    public Boolean return_requires_ack;
    /**
     * Mapping for the alarm to its internal counterpart
     * 
     */
    @JsonProperty("ref")
    @JsonPropertyDescription("Mapping for the alarm to its internal counterpart")
    public java.lang.String ref;
    /**
     * Collection of alarm information
     * 
     */
    @JsonProperty("structure")
    @JsonPropertyDescription("Collection of alarm information")
    public Map<String, AlarmRefDiscovery> structure;

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.return_requires_ack == null)? 0 :this.return_requires_ack.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        result = ((result* 31)+((this.return_to_normal_event == null)? 0 :this.return_to_normal_event.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.requires_ack == null)? 0 :this.requires_ack.hashCode()));
        result = ((result* 31)+((this.structure == null)? 0 :this.structure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlarmAlarmsetModel) == false) {
            return false;
        }
        AlarmAlarmsetModel rhs = ((AlarmAlarmsetModel) other);
        return (((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.return_requires_ack == rhs.return_requires_ack)||((this.return_requires_ack!= null)&&this.return_requires_ack.equals(rhs.return_requires_ack))))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))))&&((this.return_to_normal_event == rhs.return_to_normal_event)||((this.return_to_normal_event!= null)&&this.return_to_normal_event.equals(rhs.return_to_normal_event))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.requires_ack == rhs.requires_ack)||((this.requires_ack!= null)&&this.requires_ack.equals(rhs.requires_ack))))&&((this.structure == rhs.structure)||((this.structure!= null)&&this.structure.equals(rhs.structure))));
    }

}
