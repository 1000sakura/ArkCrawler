package cn.konat4.crawlerarknights.service;

import java.util.List;

import cn.konat4.crawlerarknights.pojo.Operator;

public interface OperatorService {
    
    public void save(Operator operator);

    public List<Operator> findAll();

    public void update(int id);

    public Operator findByName(String name);
    
}
