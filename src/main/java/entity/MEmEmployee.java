package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "m_em_employee")
@Data
public class MEmEmployee implements UserDetails {
    @Id
    @Column(name = "empl_id")
    private String emplId;

    @Column(name = "emplname")
    private String emplname;

    @Column(name = "mailaddres")
    private String mailaddres;

    @Column(name = "company_cd")
    private String companyCd;

    @Column(name = "org_cd")
    private String orgCd;

    @Column(name = "directorname")
    private String directorname;

    @Column(name = "delete_fg")
    private boolean deleteFg;

    @Column(name = "insert_tm")
    private LocalDateTime insertTm;

    @Column(name = "insert_id")
    private String insertId;

    @Column(name = "update_tm")
    private LocalDateTime updateTm;

    @Column(name = "update_cnt")
    private boolean updateCnt;

    @Column(name = "update_id")
    private String updateId;

    @Column(name = "teams_user_id")
    private String teamsUserId;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        return authorities;
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
