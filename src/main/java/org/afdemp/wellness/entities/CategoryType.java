package org.afdemp.wellness.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "category_type", catalog = "wellness", schema = "")
@XmlRootElement
public class CategoryType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Category categoryId;
    @JoinColumn(name = "type_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Type typeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoryTypeId", fetch = FetchType.EAGER)
    private List<ProductTypeCategory> productTypeCategoryList;

    public CategoryType() {
    }

    public CategoryType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    @XmlTransient
    public List<ProductTypeCategory> getProductTypeCategoryList() {
        return productTypeCategoryList;
    }

    public void setProductTypeCategoryList(List<ProductTypeCategory> productTypeCategoryList) {
        this.productTypeCategoryList = productTypeCategoryList;
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
        if (!(object instanceof CategoryType)) {
            return false;
        }
        CategoryType other = (CategoryType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.afdemp.wellness.entities.CategoryType[ id=" + id + " ]";
    }
    
}
