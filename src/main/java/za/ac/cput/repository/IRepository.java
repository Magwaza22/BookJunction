package za.ac.cput.repository;

public interface IRepository<Object, key> {

    Object create(Object obj);

    key read(key Id);

    Object update(Object obj);
}
