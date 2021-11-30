package case_study.services;


import case_study.models.PEmployee;

public interface Service<E> {
    void displayService();
    void addService(E e);
    void editService(E eId);

}
