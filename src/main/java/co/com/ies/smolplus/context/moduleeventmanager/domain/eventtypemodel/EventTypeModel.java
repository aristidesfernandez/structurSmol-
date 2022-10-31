package co.com.ies.smolplus.context.moduleeventmanager.domain.eventtypemodel;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;

public class EventTypeModel {

  private Long id;
  
  private Integer modelId;
 
  private EventType eventType;

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

  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  @Override
  public String toString() {
    return "EventTypeModel [id=" + id + ", modelId=" + modelId + ", eventType=" + eventType + "]";
  }  
  
}
