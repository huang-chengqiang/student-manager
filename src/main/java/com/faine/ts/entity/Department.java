package com.faine.ts.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ ClassName Department
 * @ Description 院系实体类
 * @ Author faine
 * @ Date 2020/11/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private Integer id;
    private String deparmentName;
    private String logo;
}
