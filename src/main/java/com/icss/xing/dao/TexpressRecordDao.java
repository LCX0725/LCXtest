package com.icss.xing.dao;

import com.icss.xing.entity.TexpressRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TexpressRecordDao extends JpaRepository<TexpressRecord,Integer>, JpaSpecificationExecutor<TexpressRecord> {
}
