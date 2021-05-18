package cn.konat4.crawlerarknights.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.konat4.crawlerarknights.pojo.Operator;

public interface OperatorDao extends JpaRepository<Operator, Long> {
    
    Operator findByName(String name);

}
