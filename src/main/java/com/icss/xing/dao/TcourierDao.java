package com.icss.xing.dao;

import com.icss.xing.entity.Tcourier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface TcourierDao extends JpaRepository<Tcourier,Integer>, JpaSpecificationExecutor<Tcourier> {

    @Query("from Tcourier where couName=?1")
    Tcourier findbyExName(String couName);
}
