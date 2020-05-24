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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "cart_products", catalog = "wellness", schema = "")
@XmlRootElement
public class CartProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    @JoinColumn(name = "cart_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cart cartId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId", fetch = FetchType.EAGER)
    private List<CartProduct> cartProductsList;
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private CartProduct productId;

    public CartProduct() {
    }

    public CartProduct(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Cart getCartId() {
        return cartId;
    }

    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }

    @XmlTransient
    public List<CartProduct> getCartProductsList() {
        return cartProductsList;
    }

    public void setCartProductsList(List<CartProduct> cartProductsList) {
        this.cartProductsList = cartProductsList;
    }

    public CartProduct getProductId() {
        return productId;
    }

    public void setProductId(CartProduct productId) {
        this.productId = productId;
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
        if (!(object instanceof CartProduct)) {
            return false;
        }
        CartProduct other = (CartProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.afdemp.wellness.entities.CartProducts[ id=" + id + " ]";
    }
    
}
