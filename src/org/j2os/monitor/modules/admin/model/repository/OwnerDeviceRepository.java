package org.j2os.monitor.modules.admin.model.repository;

import org.j2os.monitor.modules.admin.model.entity.OwnerDevice;
import org.j2os.monitor.modules.utils.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerDeviceRepository extends CrudRepository<OwnerDevice, Long> {
}
