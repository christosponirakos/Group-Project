package org.afdemp.wellness.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "user", catalog = "wellness", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"email"})})
@XmlRootElement
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email", nullable = false, length = 40)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "first_name", nullable = false, length = 25)
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "password", nullable = false, length = 25)
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @JoinTable(name = "users_roles", joinColumns = {
        @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
        , @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
        , @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private List<Subscriptions> subscriptionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private List<UsersStats> usersStatsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private List<Orders> ordersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private List<Cart> cartList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", fetch = FetchType.EAGER)
    private List<UsersContactforms> usersContactformsList;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String email, String firstName, String lastName, String password, Date createTime) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @XmlTransient
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @XmlTransient
    public List<Subscriptions> getSubscriptionsList() {
        return subscriptionsList;
    }

    public void setSubscriptionsList(List<Subscriptions> subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }

    @XmlTransient
    public List<UsersStats> getUsersStatsList() {
        return usersStatsList;
    }

    public void setUsersStatsList(List<UsersStats> usersStatsList) {
        this.usersStatsList = usersStatsList;
    }

    @XmlTransient
    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @XmlTransient
    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    @XmlTransient
    public List<UsersContactforms> getUsersContactformsList() {
        return usersContactformsList;
    }

    public void setUsersContactformsList(List<UsersContactforms> usersContactformsList) {
        this.usersContactformsList = usersContactformsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.afdemp.leisurehotel4animals.entities.User[ id=" + id + " ]";
    }
    
}
