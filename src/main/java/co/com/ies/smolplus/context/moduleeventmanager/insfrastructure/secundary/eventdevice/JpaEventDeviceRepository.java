package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEventDeviceRepository extends JpaRepository<EventDeviceEntity, UUID>, JpaSpecificationExecutor<EventDeviceEntity> {
  @Query(value="SELECT * FROM event_device WHERE created_at BETWEEN :dayBefore AND :dayNow", nativeQuery = true)
  List<EventDeviceEntity> findAllByDate(@Param("dayBefore") ZonedDateTime dayBefore, @Param("dayNow") ZonedDateTime dayNow);
}

