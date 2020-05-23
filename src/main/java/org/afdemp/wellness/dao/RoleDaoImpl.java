
package org.afdemp.wellness.dao;

import java.util.List;
import org.afdemp.wellness.entities.Role;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Integer, Role> implements IObjectDao{

    @Override
    public List<Role> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Role>) criteria.list();
    }

    @Override
    public Role findById(long id) {
        Role r = getByKey((int) id);
        if (r != null) {
            return r;
        }
        return null;
    }

    @Override
    public boolean save(Object entity) {
        Role role = (Role) entity;
        boolean save = persist(role);
        if (save) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(long id) {
        Role r = getByKey((int) id);
        if (r != null) {
            delete(r);
            if (getByKey((int) id) == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object entity) {
        Role role = (Role) entity;
        Role r = (Role) findById(role.getId());
        if (r != null) {
            r.setName(role.getName());
            return save(r);
        }
        return false;
    }
    
}
