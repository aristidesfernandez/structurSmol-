package co.com.ies.smolplus.dto.moduleeventmanager;

public class EventTypeModelDTO {
    
    private Long id;

    private Integer modelId;

    private EventTypeDTO eventTypeDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public EventTypeDTO getEventTypeDTO() {
        return eventTypeDTO;
    }

    public void setEventTypeDTO(EventTypeDTO eventTypeDTO) {
        this.eventTypeDTO = eventTypeDTO;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((modelId == null) ? 0 : modelId.hashCode());
        result = prime * result + ((eventTypeDTO == null) ? 0 : eventTypeDTO.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventTypeModelDTO other = (EventTypeModelDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (modelId == null) {
            if (other.modelId != null)
                return false;
        } else if (!modelId.equals(other.modelId))
            return false;
        if (eventTypeDTO == null) {
            if (other.eventTypeDTO != null)
                return false;
        } else if (!eventTypeDTO.equals(other.eventTypeDTO))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EventTypeModelDTO [id=" + id + ", modelId=" + modelId + ", eventTypeDTO=" + eventTypeDTO + "]";
    }

    
}
