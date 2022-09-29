package com.company;

public interface IEntityRepository <T extends IEntity>{

    void add(T enttiy);
    void delete(T entity);
    void update(T entity);
}
