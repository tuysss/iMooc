package com.tuysss.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Selection {
    private int id;
    private int cid;
    private int tid;
    private int sid;
    private String cname;
    private String tname;
    private String sname;
    private int progress;
    private int isfinish; //0未完成 1完成
    private float mark;
}
