
package com.kafkacloud.demo.Entities;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PageEvent {
    private String name ; 
    private String user;
    private Date date;
    private long duration;
}
