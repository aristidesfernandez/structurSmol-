package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventdevice.EventDeviceEntityMapper;
import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDeviceRepository;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public class SpringDataEventDeviceRepository implements EventDeviceRepository {

  private final JpaEventDeviceRepository jpaEventDeviceRepository;

  private EventDeviceEntityMapper eventDeviceEntityMapper;

  private static final Long ONE_DAY= 1L;


  public SpringDataEventDeviceRepository(JpaEventDeviceRepository jpaEventDeviceRepository, EventDeviceEntityMapper eventDeviceEntityMapper) {
    this.jpaEventDeviceRepository = jpaEventDeviceRepository;
    this.eventDeviceEntityMapper = eventDeviceEntityMapper;
  }

  @Override
  public List<EventDevice> getEventDeviceByDate(ZonedDateTime liquidationDate) {
    ZonedDateTime controlTimeDayBefore = liquidationDate.minusDays(ONE_DAY);
    System.out.println("************ NOW :: "+ liquidationDate);
    System.out.println("************ YESTERDAY :: "+ controlTimeDayBefore);
    List<EventDeviceEntity> eventDeviceEntityList = jpaEventDeviceRepository.findAllByDate(controlTimeDayBefore, liquidationDate);
    List<EventDevice> eventDeviceList = eventDeviceEntityMapper.toDomain(eventDeviceEntityList);
    return eventDeviceList;
  }


}
