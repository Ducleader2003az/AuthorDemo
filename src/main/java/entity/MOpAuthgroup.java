package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "m_op_authgroup")
@Data
public class MOpAuthgroup {
    @Id
    @Column(name = "authority_cd")
    private String authorityCd;

    @Column(name = "empl_id")
    private String emplId;

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

    @Column(name = "delete_fg")
    private boolean deleteFg;

    @Column(name = "upd_disable_fg")
    private boolean updDisableFg;

}
