package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.User;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements IObjectDao {

    @Override
    public List<User> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }

    @Override
    public User findById(long id) {
        User u = getByKey((int) id);
        if (u != null) {
            return u;
        }
        return null;
    }

    @Override
    public boolean save(Object object) {
        User user = (User) object;
        boolean save = persist(user);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        User u = getByKey((int) id);
        if (u != null) {
            delete(u);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object object) {
        User user = (User) object;
        User u = (User) findById(user.getId());
        if (u != null) {
            u.setFirstName(user.getFirstName());
            u.setLastName(user.getLastName());
            u.setEmail(user.getEmail());
            u.setPassword(user.getPassword());
            return save(u);
        }
        return false;
    }

//    @Override
//    public List<User> findAllUsers() {
//        Criteria criteria = createEntityCriteria();
//        return (List<User>) criteria.list();
//    }
//
//    @Override
//    public User findById(long id) {
//        User u = getByKey((int) id);
//        if (u != null) {
//            return u;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean save(User user) {
//        boolean save = persist(user);
//        if (save) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public boolean delete(long id) {
//        User u = getByKey((int) id);
//        if (u != null) {
//            delete(u);
//            if (getByKey((int) id) == null) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(User user) {
//        User u = findById(user.getId());
//        if (u != null){
//            u.setFirstName(user.getFirstName());
//            u.setLastName(user.getLastName());
//            u.setEmail(user.getEmail());
//            u.setPassword(user.getPassword());
//            return save(u);
//        }
//        return false;
//    } 
}
