package com.feedback.app.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;

        if (!Objects.equals(getClass(), o.getClass())) {
            return false;
        }

        BaseEntity that = (BaseEntity) o;
        return this.id != null && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
