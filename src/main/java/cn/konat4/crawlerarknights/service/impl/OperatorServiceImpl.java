package cn.konat4.crawlerarknights.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.konat4.crawlerarknights.dao.OperatorDao;
import cn.konat4.crawlerarknights.pojo.Operator;
import cn.konat4.crawlerarknights.service.OperatorService;

@Service
public class OperatorServiceImpl implements OperatorService{

    @Autowired
    private OperatorDao operatorDao;

    @Override
    @Transactional
    public void save(Operator operator) {
        this.operatorDao.save(operator);
    }

    @Override
    public List<Operator> findAll() {

        List<Operator> list = this.operatorDao.findAll();

        return list;
    }

    @Override
    public void update(int id) {

        Operator operator = new Operator();
        operator.setId(id);
        operator.setName("name");
        operatorDao.save(operator);
    }
    
    @Override
    public Operator findByName(String name) {

        return operatorDao.findByName(name);
    } 
}
