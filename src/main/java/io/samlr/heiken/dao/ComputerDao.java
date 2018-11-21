package io.samlr.heiken.dao;

import io.samlr.heiken.entity.Computer;

public interface ComputerDao extends BasicDao<Computer>{

    Computer getComputerByName(String name);
}
