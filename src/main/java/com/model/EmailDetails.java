package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor

//Class
public class EmailDetails {

 // Class data members
 private String[] to;
 private String msgBody;
 private String subject;
 private String attachment;
 
 
}
