package co.com.ies.smolplus.dto;

public class EventTypeDTO {

  private Long id;

  private String eventCode;

  private String sasCode;

  private String description;

  private Boolean isStorable;

  private Boolean isPriority;

  private String procesador;

  private Boolean isAlarm;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEventCode() {
    return eventCode;
  }

  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }

  public String getSasCode() {
    return sasCode;
  }

  public void setSasCode(String sasCode) {
    this.sasCode = sasCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getIsStorable() {
    return isStorable;
  }

  public void setIsStorable(Boolean isStorable) {
    this.isStorable = isStorable;
  }

  public Boolean getIsPriority() {
    return isPriority;
  }

  public void setIsPriority(Boolean isPriority) {
    this.isPriority = isPriority;
  }

  public String getProcesador() {
    return procesador;
  }

  public void setProcesador(String procesador) {
    this.procesador = procesador;
  }

  public Boolean getIsAlarm() {
    return isAlarm;
  }

  public void setIsAlarm(Boolean isAlarm) {
    this.isAlarm = isAlarm;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((eventCode == null) ? 0 : eventCode.hashCode());
    result = prime * result + ((sasCode == null) ? 0 : sasCode.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((isStorable == null) ? 0 : isStorable.hashCode());
    result = prime * result + ((isPriority == null) ? 0 : isPriority.hashCode());
    result = prime * result + ((procesador == null) ? 0 : procesador.hashCode());
    result = prime * result + ((isAlarm == null) ? 0 : isAlarm.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EventTypeDTO other = (EventTypeDTO) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    if (eventCode == null) {
      if (other.eventCode != null) return false;
    } else if (!eventCode.equals(other.eventCode)) return false;
    if (sasCode == null) {
      if (other.sasCode != null) return false;
    } else if (!sasCode.equals(other.sasCode)) return false;
    if (description == null) {
      if (other.description != null) return false;
    } else if (!description.equals(other.description)) return false;
    if (isStorable == null) {
      if (other.isStorable != null) return false;
    } else if (!isStorable.equals(other.isStorable)) return false;
    if (isPriority == null) {
      if (other.isPriority != null) return false;
    } else if (!isPriority.equals(other.isPriority)) return false;
    if (procesador == null) {
      if (other.procesador != null) return false;
    } else if (!procesador.equals(other.procesador)) return false;
    if (isAlarm == null) {
      if (other.isAlarm != null) return false;
    } else if (!isAlarm.equals(other.isAlarm)) return false;
    return true;
  }

  @Override
  public String toString() {
    return (
      "EventTypeDTO [id=" +
      id +
      ", eventCode=" +
      eventCode +
      ", sasCode=" +
      sasCode +
      ", description=" +
      description +
      ", isStorable=" +
      isStorable +
      ", isPriority=" +
      isPriority +
      ", procesador=" +
      procesador +
      ", isAlarm=" +
      isAlarm +
      "]"
    );
  }
}
