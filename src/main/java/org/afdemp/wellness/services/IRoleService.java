
package org.afdemp.wellness.services;

import org.afdemp.wellness.dao.*;
import java.util.List;
import org.afdemp.wellness.entities.Role;


public interface IRoleService {

    public Role findById(int id);
    public List<Role> findAllRoles();
    public boolean delete(int id);
    public boolean update(Role role);
    public boolean create(Role role);
}
